package br.ufs.urnaeletronica.server.service;

import java.rmi.RemoteException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.ufs.urnaeletronica.server.model.Prefeito;
import br.ufs.urnaeletronica.server.repository.PrefeitoRepository;

public class TribunalSuperiorEleitoralImpl implements ITribunalSuperiorEleitoral {
	
	@Autowired
	private PrefeitoRepository prefeitoRepository;
	private int version;
	
	public TribunalSuperiorEleitoralImpl() throws RemoteException {
		this.version = 0;
	}

	@Override
	public ICandidato cadastrarCandidato(Prefeito prefeito)
			throws RemoteException {

		if (prefeitoExiste(prefeito)) {
			return null;
		}
		
		version++;
		ICandidato candidato = new CandidatoImpl(prefeito, version);
		this.prefeitoRepository.save(prefeito);
		
		return candidato;
	}

	@Override
	public List<Prefeito> consultarCandidatos() throws RemoteException {
		return this.prefeitoRepository.findAll();
	}
	
	@Override
	public Prefeito consultarCandidato(Prefeito prefeito) throws RemoteException {
		if (prefeitoExiste(prefeito)) {
			return this.prefeitoRepository.findOne(prefeito.getId());
		}
		return null;
	}

	@Override
	public boolean excluirCandidato(Prefeito prefeito) throws RemoteException {
		if (prefeitoExiste(prefeito)) {
			this.prefeitoRepository.delete(prefeito);
			return true;
		}
		
		return false;
	}
	
	private boolean prefeitoExiste(Prefeito prefeito) {
		Prefeito temp = this.prefeitoRepository.findByNumeroEleitoral(prefeito.getNumeroCandidato());
		if (temp.equals(null)) {
			return true;
		}
		return false;
	}

}

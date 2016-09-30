package br.ufs.urnaeletronica.server.service;

import java.rmi.RemoteException;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.rmi.server.urnaeletronica.utils.AbstractTest;

import br.ufs.urnaeletronica.server.model.PartidoPolitico;
import br.ufs.urnaeletronica.server.model.Prefeito;
import br.ufs.urnaeletronica.server.repository.PartidoPoliticoRepository;


public class TribunalSuperiorEleitoralImplTest extends AbstractTest {
	
	private static final Logger LOGGER = Logger.getLogger(TribunalSuperiorEleitoralImplTest.class);
	
	private ITribunalSuperiorEleitoral trs;
	
	@Autowired
	private PartidoPoliticoRepository partidoPoliticoRepository;
	
	@Test
	public void cadastrarCandidatoTest(){
		PartidoPolitico partidoPolitico = this.partidoPoliticoRepository.findBySiglaPartido("REDE");
		
	
		Prefeito prefeito = new Prefeito("Gabriel", 12, partidoPolitico, "Tulio");
		
		try {
			ICandidato candidato = this.trs.cadastrarCandidato(prefeito);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			System.out.println("Error: " + e.getMessage());
		}
	}
}

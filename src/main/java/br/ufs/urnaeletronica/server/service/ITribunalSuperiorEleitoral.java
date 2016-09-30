package br.ufs.urnaeletronica.server.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import org.springframework.stereotype.Service;

import br.ufs.urnaeletronica.server.model.Prefeito;

@Service
public interface ITribunalSuperiorEleitoral extends Remote {
	
	public ICandidato cadastrarCandidato(Prefeito prefeito) throws RemoteException;
	
	public List<Prefeito> consultarCandidatos() throws RemoteException;
	
	public Prefeito consultarCandidato(Prefeito prefeito) throws RemoteException;
	
	public boolean excluirCandidato(Prefeito prefeito) throws RemoteException;
}

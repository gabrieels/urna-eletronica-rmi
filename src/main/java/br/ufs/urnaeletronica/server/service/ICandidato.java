package br.ufs.urnaeletronica.server.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

import br.ufs.urnaeletronica.server.model.Prefeito;

public interface ICandidato extends Remote {
	
	public int getVersion() throws RemoteException;
	
	public Prefeito getPrefeitos() throws RemoteException;
}
package br.ufs.urnaeletronica.server.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import br.ufs.urnaeletronica.server.model.Prefeito;

public class CandidatoImpl extends UnicastRemoteObject implements ICandidato {

	private static final long serialVersionUID = 1L;
	private int version;
	private Prefeito prefeito;

	public CandidatoImpl(Prefeito prefeito, int version) throws RemoteException {
		this.prefeito = prefeito;
		this.version = version;
	}

	@Override
	public int getVersion() throws RemoteException {
		// TODO Auto-generated method stub
		return this.version;
	}

	@Override
	public Prefeito getPrefeitos() throws RemoteException {
		// TODO Auto-generated method stub
		return this.prefeito;
	}

}

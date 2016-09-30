package br.ufs.urnaeletronica.server.model;

import java.io.Serializable;

public class Voto implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Prefeito prefeito;
	
	private int quantidadeVotos;
	
	private String tipoVoto;
	
	public Voto() {
		// TODO Auto-generated constructor stub
	}

	public Voto(Prefeito prefeito, int quantidadeVotos, String tipoVoto) {
		this.prefeito = prefeito;
		this.quantidadeVotos = quantidadeVotos;
		this.tipoVoto = tipoVoto;
	}


	public Prefeito getPrefeito() {
		return prefeito;
	}

	public void setPrefeito(Prefeito prefeito) {
		this.prefeito = prefeito;
	}

	public int getQuantidadeVotos() {
		return quantidadeVotos;
	}

	public void setQuantidadeVotos(int quantidadeVotos) {
		this.quantidadeVotos = quantidadeVotos;
	}

	public String getTipoVoto() {
		return tipoVoto;
	}

	public void setTipoVoto(String tipoVoto) {
		this.tipoVoto = tipoVoto;
	}
}

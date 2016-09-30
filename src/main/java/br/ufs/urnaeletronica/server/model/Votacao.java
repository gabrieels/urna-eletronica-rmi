package br.ufs.urnaeletronica.server.model;

import java.io.Serializable;
import java.util.List;

public class Votacao implements Serializable {

	private static final long serialVersionUID = 1L;
	List<Voto> votos;
	
	public boolean cadastrarVoto(Voto voto){
		if (voto != null) {
			votos.add(voto);
			return true;
		}
		return false;
	}
	
	public List<Voto> listarVotos(){
		return votos;
	}

}

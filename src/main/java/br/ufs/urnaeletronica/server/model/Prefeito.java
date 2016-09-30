package br.ufs.urnaeletronica.server.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.ufs.urnaeletronica.server.utils.CandidatoAbstract;
import br.ufs.urnaeletronica.server.utils.CargoPolitico;

import javax.persistence.Column;

@Entity
@Table(name="tb_prefeito")
@AttributeOverride(name = "id", column = @Column(name = "id_prefeito"))
public class Prefeito extends CandidatoAbstract {

	private static final long serialVersionUID = 201604161022L;
	
	@Column(name = "nome_vice_prefeito", length=20, nullable=false, unique=true)
	private String vice;
	
	 public Prefeito() {
		 
	}
	
	public Prefeito(String nomeCandidato, int numeroCandidato, PartidoPolitico partidoPolitico, String vice) {
		super(
				nomeCandidato, 
				numeroCandidato, 
				partidoPolitico, 
				CargoPolitico.PREFEITO
			);
		
		this.vice = vice;
	}

	public String getVice() {
		return vice;
	}

	public void setVice(String vice) {
		this.vice = vice;
	}
}

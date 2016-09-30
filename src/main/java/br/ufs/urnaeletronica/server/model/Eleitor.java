package br.ufs.urnaeletronica.server.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.ufs.urnaeletronica.server.utils.BaseEntity;

@Entity
@Table(name="tb_eleitor")
@AttributeOverride(name = "id", column = @Column(name = "id_eleitor"))
public class Eleitor extends BaseEntity<Long> {
	
	private static final long serialVersionUID = 201604161022L;
	
	@Column(name = "nu_titulo", length = 12, nullable = false, unique = true)
	private String numeroTitulo;
	@Column(name = "fl_votou", length = 1, nullable = false)
	private boolean votou;
	
	public Eleitor() {
		// TODO Auto-generated constructor stub
	}

	public Eleitor(String numeroTitulo, boolean votou) {
		this.numeroTitulo = numeroTitulo;
		this.votou = votou;
	}

	public String getNumeroTitulo() {
		return numeroTitulo;
	}

	public void setNumeroTitulo(String numeroTitulo) {
		this.numeroTitulo = numeroTitulo;
	}

	public boolean isVotou() {
		return votou;
	}

	public void setVotou(boolean votou) {
		this.votou = votou;
	}
}

package br.ufs.urnaeletronica.server.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.ufs.urnaeletronica.server.utils.BaseEntity;

@Entity
@Table(name="tb_partido_politico")
@AttributeOverride(name = "id", column = @Column(name = "id_partido"))
public class PartidoPolitico extends BaseEntity<Long> {
	
	private static final long serialVersionUID = 201604161022L;
	
	@Column(name="nome_partido", length=120, nullable=false, unique=true)
	private String nomePartido;
	
	@Column(name="sigla", length=10, nullable=true, unique=true)
	private String siglaPartido;
	
	/**
	 * 
	 */
	public PartidoPolitico() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param siglaPartido
	 * @param nomePartido
	 */
	public PartidoPolitico(String nomePartido, String siglaPartido) {
		this.nomePartido = nomePartido;
		this.siglaPartido = siglaPartido;		
	}

	/**
	 * @return the siglaPartido
	 */
	public String getSiglaPartido() {
		return siglaPartido;
	}

	/**
	 * @param siglaPartido the siglaPartido to set
	 */
	public void setSiglaPartido(String siglaPartido) {
		this.siglaPartido = siglaPartido;
	}

	/**
	 * @return the nomePartido
	 */
	public String getNomePartido() {
		return nomePartido;
	}

	/**
	 * @param nomePartido the nomePartido to set
	 */
	public void setNomePartido(String nomePartido) {
		this.nomePartido = nomePartido;
	}
}

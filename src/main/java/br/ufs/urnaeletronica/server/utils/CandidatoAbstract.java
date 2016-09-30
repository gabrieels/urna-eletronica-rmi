package br.ufs.urnaeletronica.server.utils;


import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import br.ufs.urnaeletronica.server.model.PartidoPolitico;

@MappedSuperclass
public abstract class CandidatoAbstract extends BaseEntity<Long> {

	protected static final long serialVersionUID = 201604161022L;
	
	@Column(name = "nome_candidato", length = 20, nullable = false, unique=true)
	protected String nomeCandidato;

	@Column(name = "nu_eleitoral", length = 2, nullable = false, unique = true)
	protected int numeroEleitoral;

	@ManyToOne
	@JoinColumn(name = "id_partido")
	protected PartidoPolitico partidoPolitico;
	
	@Column(name = "cargo_politico", length = 20, nullable=false)
	protected String cargoPolitico;

	public CandidatoAbstract() {
		// TODO Auto-generated constructor stub
	}

	public CandidatoAbstract(String nomeCantidato, int numeroCandidato, PartidoPolitico partidoPolitico,
			String cargoPolitico) {
		this.nomeCandidato = nomeCantidato;
		this.numeroEleitoral = numeroCandidato;
		this.partidoPolitico = partidoPolitico;
		this.cargoPolitico = cargoPolitico;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nomeCandidato;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nomeCandidato = nome;
	}

	/**
	 * @return the numeroCandidato
	 */
	public int getNumeroCandidato() {
		return numeroEleitoral;
	}

	/**
	 * @param numeroCandidato
	 *            the numeroCandidato to set
	 */
	public void setNumeroCandidato(int numeroCandidato) {
		this.numeroEleitoral = numeroCandidato;
	}

	/**
	 * @return the partidoPolitico
	 */
	public PartidoPolitico getPartidoPolitico() {
		return partidoPolitico;
	}

	/**
	 * @param partidoPolitico
	 *            the partidoPolitico to set
	 */
	public void setPartidoPolitico(PartidoPolitico partidoPolitico) {
		this.partidoPolitico = partidoPolitico;
	}

	public String getNomeCantidato() {
		return nomeCandidato;
	}

	public void setNomeCantidato(String nomeCantidato) {
		this.nomeCandidato = nomeCantidato;
	}

	public String getCargoPolitico() {
		return cargoPolitico;
	}

	public void setCargoPolitico(String cargoPolitico) {
		this.cargoPolitico = cargoPolitico;
	}
}

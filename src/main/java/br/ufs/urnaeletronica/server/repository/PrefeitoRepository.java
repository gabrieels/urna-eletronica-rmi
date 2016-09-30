package br.ufs.urnaeletronica.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufs.urnaeletronica.server.model.Prefeito;

public interface PrefeitoRepository extends JpaRepository<Prefeito, Long> {
	
	public Prefeito findByNumeroEleitoral(int numero);
	
	public Prefeito findByNomeCandidato(String nome);

}

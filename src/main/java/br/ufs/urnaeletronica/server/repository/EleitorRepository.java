package br.ufs.urnaeletronica.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ufs.urnaeletronica.server.model.Eleitor;

@Repository
public interface EleitorRepository extends JpaRepository<Eleitor, Long> {
	
	public Eleitor findByNumeroTitulo(String numero);
}
package br.ufs.urnaeletronica.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ufs.urnaeletronica.server.model.PartidoPolitico;

@Repository
public interface PartidoPoliticoRepository extends JpaRepository<PartidoPolitico, Long> {
	public PartidoPolitico findBySiglaPartido(String sigla);
	
	
}

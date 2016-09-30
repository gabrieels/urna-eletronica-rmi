package br.ufs.urnaeletronica.server.repository;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.rmi.server.urnaeletronica.utils.AbstractTest;

import br.ufs.urnaeletronica.server.model.PartidoPolitico;
import br.ufs.urnaeletronica.server.repository.PartidoPoliticoRepository;

public class PartidoPoliticoRepositoryTest extends AbstractTest {

	private static final Logger LOGGER = Logger.getLogger(PartidoPoliticoRepositoryTest.class);

	@Autowired
	private PartidoPoliticoRepository partidoPoliticoRepository;

	@Test
	public void findAllTest() {
		List<PartidoPolitico> partidoPoliticos = this.partidoPoliticoRepository.findAll();

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Test FindAll(): " + partidoPoliticos);
		}
	}

	@Test
	public void findPatidoSiglaTest() {
		PartidoPolitico paPolitico = this.partidoPoliticoRepository.findBySiglaPartido("REDE");

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Test findPatidoSigla(): " + paPolitico);
		}
	}
}

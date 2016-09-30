package br.ufs.urnaeletronica.server.repository;

import static org.junit.Assert.fail;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.rmi.server.urnaeletronica.utils.AbstractTest;

import br.ufs.urnaeletronica.server.model.Eleitor;
import br.ufs.urnaeletronica.server.repository.EleitorRepository;

public class EleitorRepositoryTest extends AbstractTest {
	private static final Logger LOGGER = Logger.getLogger(EleitorRepositoryTest.class);

	@Autowired
	private EleitorRepository eleitorRepository;

	@Test
	public void deletAllEleitor() {
		this.eleitorRepository.deleteAll();
	}
	
	@Test
	public void insertEleitor() {
		Eleitor eleitor = new Eleitor("111111111111", false);

		this.eleitorRepository.save(eleitor);

		LOGGER.info("Test insertEleitor(): " + eleitor);
	}
	
	@Test
	public void insertEleitorDuplicate() {
		try {
			Eleitor eleitor1 = new Eleitor("111111111111", false);
			Eleitor eleitor2 = new Eleitor("111111111111", false);

			this.eleitorRepository.save(eleitor1);
			this.eleitorRepository.save(eleitor2);

			fail("Duplicate entry");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Test
	public void findAll() {
		List<Eleitor> eleitors = this.eleitorRepository.findAll();

		LOGGER.info("Test findAll(): " + eleitors);
	}
}

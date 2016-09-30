package br.ufs.urnaeletronica.server.utils;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public abstract class GenericService<T extends BaseEntity<ID>, ID extends Serializable> {
	
	private final Logger LOGGER = Logger.getLogger(this.getClass());
	
	@Autowired
	protected JpaRepository<T, ID> genericRepository;
	
	public List<T> findAll() {
		this.LOGGER.debug("Requesting all records.");

		return this.genericRepository.findAll();
	}
	
	public T findOne(T entityObject){
		this.LOGGER.debug("Requesting one record.");
		
		return this.genericRepository.findOne(entityObject.getId());
	}
	
	public T insert(T entityObject) {
		this.LOGGER.debug(String.format("Saving the entity [%s].", entityObject));
		
		// add a new entity
		entityObject.setId(null);

		return this.genericRepository.save(entityObject);
	}
	
	public void update(T entityObject) {
		this.LOGGER.debug(String.format("Request to update the record [%s].", entityObject));

		if (entityObject == null) {
			this.LOGGER.error("Entity can not be null.");
			return;
		}

		if (entityObject.getId() == null) {
			this.LOGGER.error("ID can not be null.");
			return;
		}

		this.genericRepository.save(entityObject);
	}
	
	public void delete(T entityObject) {
		this.LOGGER.debug(String.format("Request to delete the record [%s].", entityObject));

		this.genericRepository.delete(entityObject);
	}
}

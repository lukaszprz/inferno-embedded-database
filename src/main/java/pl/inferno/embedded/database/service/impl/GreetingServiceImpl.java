/**
 * File GreetingServiceImpl.java created on 25.07.2016 22:51:54 by Łukasz Przesmycki (lukasz)
 */
package pl.inferno.embedded.database.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.inferno.embedded.database.model.Greeting;
import pl.inferno.embedded.database.repository.GreetingRepository;
import pl.inferno.embedded.database.service.GreetingService;

/**
 * <p>
 * inferno-embedded-database
 * </p>
 * <p>
 * GreetingServiceImpl
 * </p>
 *
 * @author lukasz
 *
 */
@Service
public class GreetingServiceImpl implements GreetingService {

	/**
	 * Field logger of type GreetingServiceImpl
	 */
	private static final Logger logger = LoggerFactory.getLogger(GreetingServiceImpl.class);

	@Autowired
	private GreetingRepository greetingRepository;

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * pl.inferno.embedded.database.service.GreetingService#getGreeting(java.
	 * lang.Long)
	 */
	@Override
	public Greeting getGreeting(Long id) {

		return greetingRepository.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * pl.inferno.embedded.database.service.GreetingService#saveGreeting(pl.
	 * inferno.embedded.database.model.Greeting)
	 */
	@Override
	public Long saveGreeting(Greeting greetingToSave) {
		return greetingRepository.save(greetingToSave).getId();

	}

}

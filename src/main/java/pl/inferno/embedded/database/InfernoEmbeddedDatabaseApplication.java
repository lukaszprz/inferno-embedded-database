/**
 * File InfernoEmbeddedDatabaseApplication.java created on 25.06.2016 00:37:48 by Łukasz Przesmycki (lukasz)
 */
package pl.inferno.embedded.database;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pl.inferno.embedded.database.model.Greeting;
import pl.inferno.embedded.database.service.GreetingService;

/**
 * <p>
 * inferno-embedded-database
 * </p>
 * <p>
 * InfernoEmbeddedDatabaseApplication
 * </p>
 *
 * @author lukasz
 *
 */
@SpringBootApplication
public class InfernoEmbeddedDatabaseApplication {

	/**
	 * Field logger of type InfernoEmbeddedDatabaseApplication
	 */
	private static final Logger logger = LoggerFactory.getLogger(InfernoEmbeddedDatabaseApplication.class);

	@Autowired
	private GreetingService service;

	/**
	 * Method main of type InfernoEmbeddedDatabaseApplication that returns void
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		logger.info("Running InfernoEmbeddedDatabaseApplication...");
		SpringApplication.run(InfernoEmbeddedDatabaseApplication.class, args).close();

		logger.info("===========================================================");
		logger.info("| * * * WARNING! * * *  THIS IS A TEMPLATE PROJECT ONLY!  |");
		logger.info("===========================================================");
		logger.info("The file based database has been set.");
		logger.info("Base database file is placed in /database/data directory.");
		logger.info("===========================================================");
	}

	@PostConstruct
	public void init() {
		Greeting greeting = new Greeting();
		greeting.setContent("Hello World!");
		Long id = service.saveGreeting(greeting);
		logger.info("Test:");
		logger.info("See how the id number increases each time, you run this application...");
		logger.info("Greeting: {}", service.getGreeting(id));
		logger.info("Increased? That means, you have a system independent persistant layer for your application.");
	}

}

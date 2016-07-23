/**
 * File InfernoEmbeddedDatabaseApplication.java created on 25.06.2016 00:37:48 by Łukasz Przesmycki (lukasz)
 */
package pl.inferno.embedded.database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

}

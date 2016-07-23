/**
 * File InfernoEmbeddedDatabaseApplicationTest.java created on 25.06.2016 03:11:25 by Łukasz Przesmycki (lukasz)
 */
package pl.inferno.embedded.database;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p>
 * inferno-embedded-database
 * </p>
 * <p>
 * InfernoEmbeddedDatabaseApplicationTest
 * </p>
 *
 * @author lukasz
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = InfernoEmbeddedDatabaseApplication.class)
public class InfernoEmbeddedDatabaseApplicationTests {

	/**
	 * Field logger of type InfernoEmbeddedDatabaseApplicationTest
	 */
	private static final Logger logger = LoggerFactory.getLogger(InfernoEmbeddedDatabaseApplicationTests.class);

	@Test
	public void contextLoads() {

	}

}

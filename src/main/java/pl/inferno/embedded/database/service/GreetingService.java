/**
 * File GreetingService.java created on 25.07.2016 22:49:18 by Łukasz Przesmycki (lukasz)
 */
package pl.inferno.embedded.database.service;

import pl.inferno.embedded.database.model.Greeting;

/**
 * <p>
 * inferno-embedded-database
 * </p>
 * <p>
 * GreetingService
 * </p>
 *
 * @author lukasz
 *
 */
public interface GreetingService {

	Greeting getGreeting(Long id);

	Long saveGreeting(Greeting greetingToSave);

}

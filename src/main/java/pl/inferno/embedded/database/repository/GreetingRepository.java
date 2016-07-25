/**
 * File GreetingRepository.java created on 25.07.2016 22:47:57 by Łukasz Przesmycki (lukasz)
 */
package pl.inferno.embedded.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.inferno.embedded.database.model.Greeting;

/**
 * <p>
 * inferno-embedded-database
 * </p>
 * <p>
 * GreetingRepository
 * </p>
 *
 * @author lukasz
 *
 */
public interface GreetingRepository extends JpaRepository<Greeting, Long> {

}

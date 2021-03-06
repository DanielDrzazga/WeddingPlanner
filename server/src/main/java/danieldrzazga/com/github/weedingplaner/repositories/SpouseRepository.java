package danieldrzazga.com.github.weedingplaner.repositories;

import danieldrzazga.com.github.weedingplaner.model.Spouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by "Daniel Drzazga" on 24.03.2020
 */
@Repository
public interface SpouseRepository extends JpaRepository<Spouse, Long> {

    Optional<Spouse> findByUsername(String username);

}

package danieldrzazga.com.github.weedingplaner.repositories;

import danieldrzazga.com.github.weedingplaner.model.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by "Daniel Drzazga" on 25.03.2020
 */
@Repository
public interface TokenRepository extends JpaRepository<Token, Long> {

    Optional<Token> findByValue(String value);

}

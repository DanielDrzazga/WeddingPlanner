package danieldrzazga.com.github.weedingplaner.repositories;

import danieldrzazga.com.github.weedingplaner.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by "Daniel Drzazga" on 21.03.2020
 */
@Repository
public interface GuestRepository extends JpaRepository<Guest,Long> {

    Guest findByFirstNameAndLastName(String firstName, String lastName);
}

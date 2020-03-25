package danieldrzazga.com.github.weedingplaner.service;

import danieldrzazga.com.github.weedingplaner.model.Spouse;

import java.util.Optional;

/**
 * Created by "Daniel Drzazga" on 24.03.2020
 */
public interface SpouseService {

    Optional<Spouse> findByUsername(String username);

}

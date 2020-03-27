package danieldrzazga.com.github.weedingplaner.service;

import danieldrzazga.com.github.weedingplaner.model.Spouse;

/**
 * Created by "Daniel Drzazga" on 24.03.2020
 */
public interface SpouseService {

    void createSpouse(Spouse spouse);

    void sentToken(Spouse spouse);

    void updateSpouse(Spouse spouse);
}

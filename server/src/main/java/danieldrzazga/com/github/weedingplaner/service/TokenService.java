package danieldrzazga.com.github.weedingplaner.service;

import danieldrzazga.com.github.weedingplaner.model.Token;

/**
 * Created by "Daniel Drzazga" on 27.03.2020
 */
public interface TokenService {

    Token findByToken(String value);
}

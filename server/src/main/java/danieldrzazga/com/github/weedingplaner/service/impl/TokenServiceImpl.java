package danieldrzazga.com.github.weedingplaner.service.impl;

import danieldrzazga.com.github.weedingplaner.exceptions.TokenNotFoundException;
import danieldrzazga.com.github.weedingplaner.model.Token;
import danieldrzazga.com.github.weedingplaner.repositories.TokenRepository;
import danieldrzazga.com.github.weedingplaner.service.TokenService;
import org.springframework.stereotype.Service;

/**
 * Created by "Daniel Drzazga" on 27.03.2020
 */
@Service
public class TokenServiceImpl implements TokenService {

    private final TokenRepository tokenRepository;

    public TokenServiceImpl(TokenRepository tokenRepository) {
        this.tokenRepository = tokenRepository;
    }

    @Override
    public Token findByToken(String value) {
        return tokenRepository.findByValue(value).orElseThrow( () -> new TokenNotFoundException(value));
    }
}

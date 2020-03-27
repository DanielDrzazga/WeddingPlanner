package danieldrzazga.com.github.weedingplaner.service.impl;

import danieldrzazga.com.github.weedingplaner.model.Spouse;
import danieldrzazga.com.github.weedingplaner.model.Token;
import danieldrzazga.com.github.weedingplaner.repositories.SpouseRepository;
import danieldrzazga.com.github.weedingplaner.repositories.TokenRepository;
import danieldrzazga.com.github.weedingplaner.service.SpouseService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.util.UUID;

/**
 * Created by "Daniel Drzazga" on 24.03.2020
 */
@Service
public class SpouseServiceImp implements SpouseService {

    private final PasswordEncoder passwordEncoder;
    private final MailServiceImpl mailService;
    private final TokenRepository tokenRepository;
    private final SpouseRepository spouseRepository;

    public SpouseServiceImp(PasswordEncoder passwordEncoder, MailServiceImpl mailService, TokenRepository tokenRepository, SpouseRepository spouseRepository) {
        this.passwordEncoder = passwordEncoder;
        this.mailService = mailService;
        this.tokenRepository = tokenRepository;
        this.spouseRepository = spouseRepository;
    }

    @Override
    public void createSpouse(Spouse spouse) {
        spouse.setPassword(passwordEncoder.encode(spouse.getPassword()));
        spouseRepository.save(spouse);
        sentToken(spouse);
    }

    @Override
    public void updateSpouse(Spouse spouse) {
        spouseRepository.save(spouse);
    }

    @Override
    public void sentToken(Spouse spouse) {
        String tokenValue = UUID.randomUUID().toString();
        Token token = new Token();
        token.setValue(tokenValue);
        token.setSpouse(spouse);
        tokenRepository.save(token);

        String url = "http://localhost:8080/token?value=" + tokenValue;

        try {
            mailService.sendMail(spouse.getUsername(),
                    "Confirm registration to the Wedding Planner website",
                    url,
                    false);
        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }
}

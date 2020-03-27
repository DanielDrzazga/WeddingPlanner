package danieldrzazga.com.github.weedingplaner.service.impl;

import danieldrzazga.com.github.weedingplaner.exceptions.SpouseNotFoundException;
import danieldrzazga.com.github.weedingplaner.repositories.SpouseRepository;
import danieldrzazga.com.github.weedingplaner.service.SpouseDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by "Daniel Drzazga" on 24.03.2020
 */
@Service
public class SpouseDetailsServiceImpl implements SpouseDetailsService {

    private final SpouseRepository spouseRepository;

    public SpouseDetailsServiceImpl(SpouseRepository spouseRepository) {
        this.spouseRepository = spouseRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return spouseRepository.findByUsername(username).orElseThrow( () -> new SpouseNotFoundException(username));
    }

}

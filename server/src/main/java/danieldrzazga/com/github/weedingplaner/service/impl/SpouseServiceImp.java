package danieldrzazga.com.github.weedingplaner.service.impl;

import danieldrzazga.com.github.weedingplaner.repositories.SpouseRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by "Daniel Drzazga" on 24.03.2020
 */
@Service
public class SpouseServiceImp implements UserDetailsService {

    private final SpouseRepository spouseRepository;

    public SpouseServiceImp(SpouseRepository spouseRepository) {
        this.spouseRepository = spouseRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return spouseRepository.findByUsername(s).get();
    }
}

package danieldrzazga.com.github.weedingplaner.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by "Daniel Drzazga" on 24.03.2020
 */
@Service
public class SpouseDetailsServiceImp implements UserDetailsService {

    private final SpouseServiceImp spouseService;

    public SpouseDetailsServiceImp(SpouseServiceImp spouseService) {
        this.spouseService = spouseService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return spouseService.loadUserByUsername(username);
    }

}

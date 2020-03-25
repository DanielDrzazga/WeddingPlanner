package danieldrzazga.com.github.weedingplaner.config;

import danieldrzazga.com.github.weedingplaner.service.impl.SpouseServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by "Daniel Drzazga" on 24.03.2020
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private final SpouseServiceImp spouseService;

    public WebSecurityConfig(SpouseServiceImp spouseService) {
        this.spouseService = spouseService;
    }

    @Bean
    public PasswordEncoder getPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(spouseService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //h2
        http.csrf().disable();
        http.headers().disable();
        http.authorizeRequests()
                .antMatchers("/guests").hasRole("ADMIN")
                .and()
                .formLogin().defaultSuccessUrl("/guests");
    }
}

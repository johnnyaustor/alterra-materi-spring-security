package id.alterra.springsecurity.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (!username.equalsIgnoreCase("administrator"))
            throw new UsernameNotFoundException("User Not Found");

        return User.builder()
                .username("administrator")
                // {bcrypt}password
                //.password("{bcrypt}$2a$10$95C6WnLIuHLx14EaSLilfuy6x8q6Pv/KrrLyKz9zK5w9lcdML7rzC")
                .password("$2a$10$95C6WnLIuHLx14EaSLilfuy6x8q6Pv/KrrLyKz9zK5w9lcdML7rzC")
                .roles("USER")
                .build();
    }
}

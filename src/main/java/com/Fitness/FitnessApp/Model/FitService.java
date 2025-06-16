package com.Fitness.FitnessApp.Model;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Collections;

@Service
@AllArgsConstructor
public class FitService implements UserDetailsService {

    private  FitRepo repo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> userOptional = repo.findByEmail(email);

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            return new org.springframework.security.core.userdetails.User(
                    user.getEmail(),
                    user.getPassword(),
                    Collections.emptyList()
            );
        } else {
            throw new UsernameNotFoundException("User not found with email: " + email);
        }
    }
}

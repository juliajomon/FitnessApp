package com.Fitness.FitnessApp.Controller;

import com.Fitness.FitnessApp.Model.FitRepo;
import com.Fitness.FitnessApp.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegistrationController {

    @Autowired
    private FitRepo repo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping(value = "/signup", consumes = "application/json")
    public User createUser(@RequestBody User user) {
        // Encode the plain-text password before saving
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return repo.save(user);
    }
}

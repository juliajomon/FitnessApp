package com.Fitness.FitnessApp.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public  interface FitRepo extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}

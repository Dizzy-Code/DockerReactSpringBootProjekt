package com.example.backend.services;

import com.example.backend.repositories.UserRepository;
import org.springframework.stereotype.Service;

// Logik ausgeführt, wie Validierung, Berechnung, Entscheidung, Regeln umsetzen und Daten aus mehreren Repos zusammenfügen
@Service
public class UserService {

    private final UserRepository userRepository;

    // Constructor Injection (Best Practice)
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getGreeting() {
        return "Hello " + userRepository.findUserName();
    }
}

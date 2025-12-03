package com.example.backend;

import com.example.backend.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Empfängt HTTP-Requests
// Ruft Service auf
//gibt antwort als Json/Text/Objekt zurück
@RestController
@RequestMapping("/api")
public class HelloController {

    private final UserService userService;

    // Again: Spring injects UserService automatically
    public HelloController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/greet")
    public String greet() {
        return userService.getGreeting();
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Spring Boot!";
    }
}

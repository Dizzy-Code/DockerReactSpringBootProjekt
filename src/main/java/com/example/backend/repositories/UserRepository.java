package com.example.backend.repositories;

import org.springframework.stereotype.Repository;

//Hier sprich man die Datenbank an. CRUD mit DB

@Repository
public class UserRepository {

    public String findUserName() {
        return "Marcel";
    }
}

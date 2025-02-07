package com.example.spring_gestionePrenotazioni.service;

import com.example.spring_gestionePrenotazioni.model.User;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    @Qualifier("user")
    ObjectProvider<User> userProvider;

    public User createUser() {
        return userProvider.getObject();
    }

    public void addUser(User user) {
    }
}

package com.example.spring_gestionePrenotazioni.runner;

import com.example.spring_gestionePrenotazioni.model.Person;
import com.example.spring_gestionePrenotazioni.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PersonRunner implements CommandLineRunner {

    @Autowired
    private PersonService personService;

    @Override
    public void run(String... args) throws Exception {
//        Person p = personService.createUser3();
//        personService.savePerson(p);
//        System.out.println("elemento generato e salvato: ");
    }
}

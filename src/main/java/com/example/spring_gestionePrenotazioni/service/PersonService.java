package com.example.spring_gestionePrenotazioni.service;

import com.example.spring_gestionePrenotazioni.model.Person;
import com.example.spring_gestionePrenotazioni.repository.PersonDAOrepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonDAOrepository personDAOrepository;

    @Autowired
    @Qualifier("person")
    ObjectProvider<Person> personProvider;

    public Person createUser() {
        return personProvider.getObject();
    }

    public void savePerson(Person p){
        personDAOrepository.save(p);
    }
}

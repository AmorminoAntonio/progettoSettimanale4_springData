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
    @Qualifier("person1")
    ObjectProvider<Person> person1Provider;
    @Autowired
    @Qualifier("person2")
    ObjectProvider<Person> person2Provider;
    @Autowired
    @Qualifier("person3")
    ObjectProvider<Person> person3Provider;

    public Person createUser1() {
        return person1Provider.getObject();
    }

    public Person createUser2() {
        return person1Provider.getObject();
    }

    public Person createUser3() {
        return person1Provider.getObject();
    }

    public void savePerson(Person p) {
        personDAOrepository.save(p);
    }
}

package com.example.spring_gestionePrenotazioni.repository;

import com.example.spring_gestionePrenotazioni.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDAOrepository extends JpaRepository<Person,Long> {
    Person findById(long id);
}

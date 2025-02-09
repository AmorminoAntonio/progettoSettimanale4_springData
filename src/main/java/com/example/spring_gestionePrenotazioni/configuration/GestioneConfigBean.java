package com.example.spring_gestionePrenotazioni.configuration;

import com.example.spring_gestionePrenotazioni.enumerated.StationType;
import com.example.spring_gestionePrenotazioni.model.Building;
import com.example.spring_gestionePrenotazioni.model.Reservation;
import com.example.spring_gestionePrenotazioni.model.Station;
import com.example.spring_gestionePrenotazioni.model.Person;
import com.example.spring_gestionePrenotazioni.repository.BuildingDAOrepository;
import com.example.spring_gestionePrenotazioni.repository.PersonDAOrepository;
import com.example.spring_gestionePrenotazioni.repository.ReservationDAOrepository;
import com.example.spring_gestionePrenotazioni.repository.StationDAOrepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


import java.time.LocalDate;
import java.util.Locale;

@Configuration
public class GestioneConfigBean {
    Faker faker = new Faker(Locale.ITALY);

    @Autowired
    PersonDAOrepository personDAOrepository;
    @Autowired
    StationDAOrepository stationDAOrepository;
    @Autowired
    BuildingDAOrepository buildingDAOrepository;
    @Autowired
    ReservationDAOrepository reservationDAOrepository;


    @Bean("person1")
    @Scope("prototype")
    public Person p1() {
        return new Person(faker.name().username(), faker.name().firstName(), faker.name().lastName(), faker.internet().emailAddress());
    }

    @Bean("person2")
    @Scope("prototype")
    public Person p2() {
        return new Person(faker.name().username(), faker.name().firstName(), faker.name().lastName(), faker.internet().emailAddress());
    }

    @Bean("person3")
    @Scope("prototype")
    public Person p3() {
        return new Person(faker.name().username(), faker.name().firstName(), faker.name().lastName(), faker.internet().emailAddress());
    }


    @Bean("building1")
    @Scope("prototype")
    public Building b1() {
        return new Building(faker.company().name(), faker.address().fullAddress(), faker.address().city());
    }

    @Bean("building2")
    @Scope("prototype")
    public Building b2() {
        return new Building(faker.company().name(), faker.address().fullAddress(), faker.address().city());
    }

    @Bean("building3")
    @Scope("prototype")
    public Building b3() {
        return new Building(faker.company().name(), faker.address().fullAddress(), faker.address().city());
    }


    @Bean("station1")
    @Scope("prototype")
    public Station s1() {
        return new Station("riunione condominiale", StationType.SALA_RIUNIONI, 50, buildingDAOrepository.findById(1), true);
    }

    @Bean("station2")
    @Scope("prototype")
    public Station s2() {
        return new Station("convento bel sudore", StationType.PRIVATO, 19, buildingDAOrepository.findById(2), true);
    }

    @Bean("station3")
    @Scope("prototype")
    public Station s3() {
        return new Station("sala del trono di chiappacani", StationType.OPEN_SPACE, 120, buildingDAOrepository.findById(3), false);
    }


    @Bean("reservation1")
    @Scope("prototype")
    public Reservation r1() {
        LocalDate reservationDate = LocalDate.of(2025, 2, 10);
        return new Reservation(reservationDate, stationDAOrepository.findById(8), personDAOrepository.findById(3));
    }

    @Bean("reservation2")
    @Scope("prototype")
    public Reservation r2() {
        LocalDate reservationDate = LocalDate.of(2025, 1, 12);
        return new Reservation(reservationDate, stationDAOrepository.findById(7), personDAOrepository.findById(2));
    }

    @Bean("reservation3")
    @Scope("prototype")
    public Reservation r3() {
        LocalDate reservationDate = LocalDate.of(2025, 2, 22);
        return new Reservation(reservationDate, stationDAOrepository.findById(9), personDAOrepository.findById(1));
    }

}

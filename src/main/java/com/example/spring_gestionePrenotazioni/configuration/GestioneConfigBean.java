package com.example.spring_gestionePrenotazioni.configuration;

import com.example.spring_gestionePrenotazioni.enumerated.StationType;
import com.example.spring_gestionePrenotazioni.model.Building;
import com.example.spring_gestionePrenotazioni.model.Reservation;
import com.example.spring_gestionePrenotazioni.model.Station;
import com.example.spring_gestionePrenotazioni.model.User;
import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;
import java.util.Locale;

@Configuration
public class GestioneConfigBean {
    Faker faker = new Faker(Locale.ITALY);


    @Bean()
    public User user1() {
        return new User(faker.name().username(), faker.name().firstName(), faker.name().lastName(), faker.internet().emailAddress());
    }

    @Bean
    public Building building1() {
        return new Building(faker.company().name(), faker.address().fullAddress(), faker.address().city());
    }

    @Bean
    public Station station1() {
        return new Station("convention parrucchieri pelati d'Europa", StationType.SALA_RIUNIONI, 50,building1(), true);
    }

    @Bean
    public Reservation reservation1(){
        LocalDate reservationDate = LocalDate.of(2025,2,10);
        return new Reservation(reservationDate,reservationDate.plusDays(1),station1(),user1());
    }


}

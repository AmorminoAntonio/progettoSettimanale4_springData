package com.example.spring_gestionePrenotazioni.runner;

import com.example.spring_gestionePrenotazioni.repository.PersonDAOrepository;
import com.example.spring_gestionePrenotazioni.service.ReservationService;
import com.example.spring_gestionePrenotazioni.service.StationService;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Locale;

@Component
public class ReservationRunner implements CommandLineRunner {

    Faker faker = new Faker(Locale.ITALY);

    @Autowired
    ReservationService reservationService;
    @Autowired
    StationService stationService;
    @Autowired
    PersonDAOrepository personDAOrepository;

    @Override
    public void run(String... args) throws Exception {

        //reservationService.findReservationNotRiservatedorRiservated(LocalDate.of(2025,1,12));

       //reservationService.addReservation(personDAOrepository.findById(3),stationService.findStation(6),LocalDate.now());

       /* if () {
            Reservation r = reservationService.createReservation1();
            reservationService.saveReservation(r);
        } else {
            System.out.println("la prenotazione non può essere effettuata. " + " La postazione è già stata prenotata.");
        }

        reservationService.findReservationByPersonId(2);*/


    }
}

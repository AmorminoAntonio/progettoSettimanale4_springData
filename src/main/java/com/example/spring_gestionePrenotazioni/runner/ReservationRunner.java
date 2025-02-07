package com.example.spring_gestionePrenotazioni.runner;

import com.example.spring_gestionePrenotazioni.model.Reservation;
import com.example.spring_gestionePrenotazioni.repository.ReservationDAOrepository;
import com.example.spring_gestionePrenotazioni.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReservationRunner implements CommandLineRunner {

    @Autowired
    ReservationService reservationService;

    @Override
    public void run(String... args) throws Exception {
//        Reservation r = reservationService.createReservation();
//        System.out.println("reservation creata: " + r);
//        reservationService.saveReservation(r);
    }
}

package com.example.spring_gestionePrenotazioni.service;

import com.example.spring_gestionePrenotazioni.model.Reservation;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ReservationService {
    @Autowired
    @Qualifier("reservation")
    ObjectProvider<Reservation> reservationProvider;

    public Reservation createReservation() {
        return reservationProvider.getObject();
    }
}

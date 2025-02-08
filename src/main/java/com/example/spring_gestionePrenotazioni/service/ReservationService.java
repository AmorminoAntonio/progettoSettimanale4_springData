package com.example.spring_gestionePrenotazioni.service;

import com.example.spring_gestionePrenotazioni.model.Building;
import com.example.spring_gestionePrenotazioni.model.Reservation;
import com.example.spring_gestionePrenotazioni.repository.ReservationDAOrepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    @Autowired
    ReservationDAOrepository reservationDAOrepository;

    @Autowired
    @Qualifier("reservation")
    ObjectProvider<Reservation> reservationProvider;

    public Reservation createReservation() {
        return reservationProvider.getObject();
    }

    public void saveReservation(Reservation r) {
        reservationDAOrepository.save(r);
    }
}

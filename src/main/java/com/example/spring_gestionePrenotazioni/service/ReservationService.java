package com.example.spring_gestionePrenotazioni.service;

import com.example.spring_gestionePrenotazioni.model.Person;
import com.example.spring_gestionePrenotazioni.model.Reservation;
import com.example.spring_gestionePrenotazioni.model.Station;
import com.example.spring_gestionePrenotazioni.repository.ReservationDAOrepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ReservationService {

    @Autowired
    ReservationDAOrepository reservationDAOrepository;

    @Autowired
    @Qualifier("reservation1")
    ObjectProvider<Reservation> r1Provider;
    @Autowired
    @Qualifier("reservation2")
    ObjectProvider<Reservation> r2Provider;
    @Autowired
    @Qualifier("reservation3")
    ObjectProvider<Reservation> r3Provider;

    public Reservation createReservation3() {
        return r3Provider.getObject();
    }

    public Reservation createReservation1() {
        return r1Provider.getObject();
    }

    public Reservation createReservation2() {
        return r2Provider.getObject();
    }

    public void saveReservation(Reservation r) {
        reservationDAOrepository.save(r);
    }

    public void findReservationByPersonId(long id) {
        reservationDAOrepository.findByPersonId(id);
    }

    public void findReservationNotRiservatedorRiservated(LocalDate d) {
        Reservation r = reservationDAOrepository.findById(16);
        if (r.getReservationDate().isEqual(d)) {
            System.out.println("In questa data c'è già una prenotazione ");
        } else {
            System.out.println("La data è libera. ---> vai pure alla pagina di prenotazione ✌️");
        }
    }

    public void addReservation(Person p, Station s, LocalDate d) {
        boolean exists = reservationDAOrepository.existsByStationAndReservationDate(s, d);
        if (exists) {
            System.out.println("Ci dispiace! - Questa postazione è già occupata, quindi non può essere prenotata.");
        } else {
            Reservation reservation = new Reservation();
            reservation.setPerson(p);
            reservation.setStation(s);
            reservation.setReservationDate(d);
            reservationDAOrepository.save(reservation);
            System.out.println("La prenotazione è avvenuta con successo.");
        }
    }


}

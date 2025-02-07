package com.example.spring_gestionePrenotazioni.repository;

import com.example.spring_gestionePrenotazioni.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationDAOrepository extends JpaRepository<Reservation, Long> {
    Reservation findById(long id);
}

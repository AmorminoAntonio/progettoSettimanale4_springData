package com.example.spring_gestionePrenotazioni.repository;


import com.example.spring_gestionePrenotazioni.model.Reservation;
import com.example.spring_gestionePrenotazioni.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservationDAOrepository extends JpaRepository<Reservation, Long> {
    Reservation findById(long id);

    @Query("SELECT r FROM Reservation r WHERE r.person.idUser = :id")
    List<Reservation> findByPersonId(long id);

    boolean existsByStationAndReservationDate(Station station, LocalDate reservationDate);
}

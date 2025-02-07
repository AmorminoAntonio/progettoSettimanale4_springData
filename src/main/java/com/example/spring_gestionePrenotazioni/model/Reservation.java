package com.example.spring_gestionePrenotazioni.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idReservation;
    private LocalDate reservationDate;

    @ManyToOne
    @JoinColumn(name = "station_id")
    private Station eventStation;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User reservationUser;

    public Reservation(LocalDate startReservation, LocalDate reservationDate, Station eventStation, User reservationUser) {
        this.reservationDate = reservationDate;
        this.eventStation = eventStation;
        this.reservationUser = reservationUser;
    }
}

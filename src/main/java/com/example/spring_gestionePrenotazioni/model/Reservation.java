package com.example.spring_gestionePrenotazioni.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idReservation;

    @Column(nullable = false)
    private LocalDate reservationDate;

    @ManyToOne
    @JoinColumn(name = "station_id")
    private Station station;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    public Reservation(LocalDate reservationDate, Station station, Person person) {
        this.reservationDate = reservationDate;
        this.station = station;
        this.person = person;
    }
}

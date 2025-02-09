package com.example.spring_gestionePrenotazioni.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idReservation;

    @Column
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

    @Override
    public String toString() {
        return "Reservation{" +
                "idReservation=" + idReservation +
                ", reservationDate=" + reservationDate +
                ", station=" + station +
                ", person=" + person +
                '}';
    }
}

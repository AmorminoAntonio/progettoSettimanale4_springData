package com.example.spring_gestionePrenotazioni.model;

import com.example.spring_gestionePrenotazioni.enumerated.StationType;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;



@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity

public class Station {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idStation;

    @Column(nullable = false)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StationType stationType;

    @Column(nullable = false)
    private int maxPartecipants;

    @ManyToOne
    @JoinColumn(name = "building_id")
    private Building buildingForEvent;

    @Column(nullable = false)
    private boolean isReservated;

    @OneToMany(mappedBy = "station")
    private List<Reservation> reservationListForStation = new ArrayList<>();


    public Station(String description, StationType stationType, int maxPartecipants, Building buildingForEvent, boolean isReservated) {
        this.description = description;
        this.stationType = stationType;
        this.maxPartecipants = maxPartecipants;
        this.buildingForEvent = buildingForEvent;
        this.isReservated = isReservated;
    }
}

package com.example.spring_gestionePrenotazioni.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUser;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String lastname;
    @Column(nullable = false)
    private String email;

    @OneToMany(mappedBy = "person")
    private List<Reservation> reservationListForUser = new ArrayList<>();


    public Person(String username, String name, String lastname, String email) {
        this.username = username;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
    }
}

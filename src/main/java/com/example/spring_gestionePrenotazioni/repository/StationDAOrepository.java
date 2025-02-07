package com.example.spring_gestionePrenotazioni.repository;

import com.example.spring_gestionePrenotazioni.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationDAOrepository extends JpaRepository<Station, Long> {
}

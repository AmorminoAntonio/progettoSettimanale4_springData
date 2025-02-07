package com.example.spring_gestionePrenotazioni.repository;

import com.example.spring_gestionePrenotazioni.model.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface buildingDAOrepository extends JpaRepository<Building, Long> {
    Building findById(long id);
}

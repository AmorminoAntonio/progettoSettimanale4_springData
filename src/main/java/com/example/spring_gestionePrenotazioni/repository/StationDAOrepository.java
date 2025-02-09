package com.example.spring_gestionePrenotazioni.repository;

import com.example.spring_gestionePrenotazioni.enumerated.StationType;
import com.example.spring_gestionePrenotazioni.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StationDAOrepository extends JpaRepository<Station, Long> {
    Station findById(long id);

    @Query("SELECT s FROM Station s WHERE s.isRiservated = :riservated")
    List<Station> findStationByReservationStatus(boolean riservated);

    @Query("SELECT s FROM Station s JOIN s.buildingForEvent b WHERE s.stationType = :stationType AND b.city = :city")
    List<Station> findStationsByTypeAndCity(StationType stationType, String city);

}

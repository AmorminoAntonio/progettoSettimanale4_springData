package com.example.spring_gestionePrenotazioni.service;

import com.example.spring_gestionePrenotazioni.model.Building;
import com.example.spring_gestionePrenotazioni.model.Station;
import com.example.spring_gestionePrenotazioni.repository.StationDAOrepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class StationService {

    @Autowired
    StationDAOrepository stationDAOrepository;

    @Autowired
    @Qualifier("station")
    ObjectProvider<Station> stationProvider;

    public Station createStation() {
        return stationProvider.getObject();
    }

    public void saveStation(Station s){
        stationDAOrepository.save(s);
    }
}

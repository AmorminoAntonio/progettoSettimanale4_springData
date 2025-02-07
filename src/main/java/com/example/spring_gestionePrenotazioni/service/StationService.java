package com.example.spring_gestionePrenotazioni.service;

import com.example.spring_gestionePrenotazioni.model.Station;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class StationService {
    @Autowired
    @Qualifier("station")
    ObjectProvider<Station> stationProvider;

    public Station createStation() {
        return stationProvider.getObject();
    }
}

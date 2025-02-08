package com.example.spring_gestionePrenotazioni.runner;

import com.example.spring_gestionePrenotazioni.model.Station;
import com.example.spring_gestionePrenotazioni.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StationRunner implements CommandLineRunner {

    @Autowired
    StationService stationService;

    @Override
    public void run(String... args) throws Exception {
        Station s = stationService.createStation2();
        stationService.saveStation(s);
    }
}

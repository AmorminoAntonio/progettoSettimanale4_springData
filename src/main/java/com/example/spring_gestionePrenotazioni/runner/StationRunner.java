package com.example.spring_gestionePrenotazioni.runner;

import com.example.spring_gestionePrenotazioni.enumerated.StationType;
import com.example.spring_gestionePrenotazioni.model.Station;
import com.example.spring_gestionePrenotazioni.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StationRunner implements CommandLineRunner {

    @Autowired
    StationService stationService;


    @Override
    public void run(String... args) throws Exception {
//        Station s = stationService.findStation(7);
//        stationService.NotRiservatedList();
       stationService.findStationByCityAndType(StationType.PRIVATO,"Borgo Giordano");



       // stationService.saveStation(s);

    }
}

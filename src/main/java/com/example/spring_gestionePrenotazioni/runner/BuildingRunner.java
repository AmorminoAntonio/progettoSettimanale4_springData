package com.example.spring_gestionePrenotazioni.runner;

import com.example.spring_gestionePrenotazioni.model.Building;
import com.example.spring_gestionePrenotazioni.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BuildingRunner implements CommandLineRunner {

    @Autowired
    BuildingService buildingService;


    @Override
    public void run(String... args) throws Exception {
//        Building b = buildingService.createBuilding3();
//        buildingService.saveBuilding(b);
//        System.out.println("elemento generato: ");
    }
}

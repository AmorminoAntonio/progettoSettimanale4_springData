package com.example.spring_gestionePrenotazioni.service;

import com.example.spring_gestionePrenotazioni.model.Building;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BuildingService {
    @Autowired
    @Qualifier("building")
    ObjectProvider<Building> buildingProvider;

    public Building createBuilding() {
        return buildingProvider.getObject();
    }
}

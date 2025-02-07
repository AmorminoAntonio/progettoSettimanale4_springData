package com.example.spring_gestionePrenotazioni.service;

import com.example.spring_gestionePrenotazioni.model.Building;
import com.example.spring_gestionePrenotazioni.repository.buildingDAOrepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BuildingService {

    @Autowired
    buildingDAOrepository buildingDAOrepository;

    @Autowired
    @Qualifier("building")
    ObjectProvider<Building> buildingProvider;

    public Building createBuilding() {
        return buildingProvider.getObject();
    }

    public void saveBuilding(Building b){
        buildingDAOrepository.save(b);
    }
}

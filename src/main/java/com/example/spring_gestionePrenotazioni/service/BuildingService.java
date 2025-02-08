package com.example.spring_gestionePrenotazioni.service;

import com.example.spring_gestionePrenotazioni.model.Building;
import com.example.spring_gestionePrenotazioni.repository.BuildingDAOrepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BuildingService {

    @Autowired
    @Qualifier("building1")
    ObjectProvider<Building> b1Provider;
    @Autowired
    @Qualifier("building2")
    ObjectProvider<Building> b2Provider;
    @Autowired
    @Qualifier("building3")
    ObjectProvider<Building> b3Provider;

    @Autowired
    BuildingDAOrepository buildingDAOrepository;


    public Building createBuilding1() {
        return b1Provider.getObject();
    }

    public Building createBuilding2() {
        return b2Provider.getObject();
    }

    public Building createBuilding3() {
        return b3Provider.getObject();
    }

    public void saveBuilding(Building b) {
        buildingDAOrepository.save(b);
    }
}

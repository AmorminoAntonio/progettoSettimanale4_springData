package com.example.spring_gestionePrenotazioni.service;

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
    @Qualifier("station1")
    ObjectProvider<Station> s1Provider;
    @Autowired
    @Qualifier("station2")
    ObjectProvider<Station> s2Provider;
    @Autowired
    @Qualifier("station3")
    ObjectProvider<Station> s3Provider;

    public Station createStation1() {
        return s1Provider.getObject();
    }

    public Station createStation2() {
        return s2Provider.getObject();
    }

    public Station createStation3() {
        return s3Provider.getObject();
    }

    public void saveStation(Station s) {
        stationDAOrepository.save(s);
    }
}

package com.example.spring_gestionePrenotazioni.service;

import com.example.spring_gestionePrenotazioni.enumerated.StationType;
import com.example.spring_gestionePrenotazioni.model.Station;
import com.example.spring_gestionePrenotazioni.repository.StationDAOrepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.example.spring_gestionePrenotazioni.enumerated.StationType.*;

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


    public Station findStation(long id) {
        return stationDAOrepository.findById(id);
    }

    public void findStationByCityAndType(StationType type, String city) {
        if ("Milano".equals(city) && (type.equals(SALA_RIUNIONI) || type.equals(OPEN_SPACE) || type.equals(PRIVATO))) {
            List<Station> lista = new ArrayList<>(stationDAOrepository.findStationsByTypeAndCity(type, city));
            if (lista.isEmpty()) {
                System.out.println("Nessuna postazione trovata per il tipo e la città specificata.");
            } else {
                System.out.println("Ecco a te la lista delle postazioni che hai ricercato per tipo di postazione e città: " + lista);
            }
        } else if ("Roma".equals(city) && (type.equals(SALA_RIUNIONI) || type.equals(OPEN_SPACE) || type.equals(PRIVATO))) {
            List<Station> lista = new ArrayList<>(stationDAOrepository.findStationsByTypeAndCity(type, city));
            if (lista.isEmpty()) {
                System.out.println("Nessuna postazione trovata per il tipo e la città specificata.");
            } else {
                System.out.println("Ecco a te la lista delle postazioni che hai ricercato per tipo di postazione e città: " + lista);
            }
        } else if ("Torino".equals(city) && (type.equals(SALA_RIUNIONI) || type.equals(OPEN_SPACE) || type.equals(PRIVATO))) {
            List<Station> lista = new ArrayList<>(stationDAOrepository.findStationsByTypeAndCity(type, city));
            if (lista.isEmpty()) {
                System.out.println("Nessuna postazione trovata per il tipo e la città specificata.");
            } else {
                System.out.println("Ecco a te la lista delle postazioni che hai ricercato per tipo di postazione e città: " + lista);
            }
        } else {
            System.out.println("Nessun riscontro per questa città e tipo postazione.");
        }
    }


}

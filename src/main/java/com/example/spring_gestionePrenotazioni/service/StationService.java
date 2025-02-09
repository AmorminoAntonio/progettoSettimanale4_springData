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

    public void NotRiservatedList() {
        stationDAOrepository.findStationByReservationStatus(false);
    }

    public Station findStation(long id) {
        return stationDAOrepository.findById(id);
    }

    public void findStationByCityAndType(StationType type, String city) {
        if (type.equals(SALA_RIUNIONI) && city.equals("Quarto Oreste calabro") || type.equals(OPEN_SPACE) && city.equals("Rizzi salentino") || type.equals(PRIVATO) && city.equals("Borgo Giordano")) {
            System.out.println("i risultati per tipo e città sono: ");
            List<Station> lista = new ArrayList<>(stationDAOrepository.findStationsByTypeAndCity(type, city));
            System.out.println(lista);
        } else {
            System.out.println("nessun riscontro per questa città e tipo postazione.");
        }
    }
}

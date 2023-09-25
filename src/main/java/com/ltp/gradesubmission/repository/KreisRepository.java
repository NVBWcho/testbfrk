package com.ltp.gradesubmission.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.ltp.gradesubmission.entities.HaltestelleTypes;
import org.springframework.stereotype.Repository;

import com.ltp.gradesubmission.entities.Haltestelle;
import com.ltp.gradesubmission.entities.Kreis;

@Repository
public class KreisRepository {

    private List<Kreis> kreisList = new ArrayList<Kreis>();

    public List<Kreis> getAllKreis() {
        return kreisList;

    }

    public void addKries(Kreis kries) {
        kreisList.add(kries);
    }

    public Kreis getKreisById(String id) {
        List<Kreis> matchingKries = kreisList.stream().filter(k -> k.getKreisId().equals(id))
                .collect(Collectors.toList());
        return matchingKries.get(0);
    }

    public List<Haltestelle> getAllÖPNVinKries(String id) {
        Kreis searchedKries = getKreisById(id);

        List<Haltestelle> allHaltestelles = searchedKries.getHaltestelles();
        List<Haltestelle> ÖPNVHaltestelles = allHaltestelles.stream()
                .filter(h -> h.getType().equals(HaltestelleTypes.ÖPNV)).collect(Collectors.toList());

        return ÖPNVHaltestelles;

    }

    public List<Haltestelle> getAllSPNVinKries(String id) {
        Kreis searchedKries = getKreisById(id);

        List<Haltestelle> allHaltestelles = searchedKries.getHaltestelles();
        List<Haltestelle> SPNVHaltestelles = allHaltestelles.stream()
                .filter(h -> h.getType().equals(HaltestelleTypes.SPNV)).collect(Collectors.toList());

        return SPNVHaltestelles;

    }

}

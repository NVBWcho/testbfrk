package com.ltp.gradesubmission.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.ltp.gradesubmission.entities.Haltestelle;
import com.ltp.gradesubmission.entities.HaltestelleUtilities;

@Repository
public class HaltestelleRepository {

    private List<Haltestelle> allHaltestelles=new ArrayList<Haltestelle>();

    public void addHaltestelle(Haltestelle haltestelle){
        allHaltestelles.add(haltestelle);
    }

    public Haltestelle getHaltestelleById(String id){
        return allHaltestelles.stream().filter(h->h.getId().equals(id)).collect(Collectors.toList()).get(0);


    }


    public List<HaltestelleUtilities> getAllUtilitiesAtHaltestelle(String id){
        return null;

        
    }
    
}

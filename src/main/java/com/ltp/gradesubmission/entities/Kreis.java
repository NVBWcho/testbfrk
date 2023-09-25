package com.ltp.gradesubmission.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Kreis {

    private String kreisId;
    private String name;

    List<Haltestelle> haltestelles;
    private int numOfOPNVHaltestelles;
    private int numOfSPNVHaltestelles;

    public Kreis(String kreisId, String name) {
        this.kreisId = kreisId;
        this.name = name;
        this.haltestelles=new ArrayList<Haltestelle>();
    }

   


    




    public String getKreisId() {
        return kreisId;
    }









    public void setKreisId(String kreisId) {
        this.kreisId = kreisId;
    }









    public String getName() {
        return name;
    }









    public void setName(String name) {
        this.name = name;
    }









    public List<Haltestelle> getHaltestelles() {
        return haltestelles;
    }









    public void setHaltestelles(List<Haltestelle> haltestelles) {
        this.haltestelles = haltestelles;
    }









    public int getNumOfOPNVHaltestelles() {
        return numOfOPNVHaltestelles;
    }









    public void setNumOfOPNVHaltestelles(int numOfOPNVHaltestelles) {
        this.numOfOPNVHaltestelles = numOfOPNVHaltestelles;
    }









    public int getNumOfSPNVHaltestelles() {
        return numOfSPNVHaltestelles;
    }









    public void setNumOfSPNVHaltestelles(int numOfSPNVHaltestelles) {
        this.numOfSPNVHaltestelles = numOfSPNVHaltestelles;
    }









    public void updateKriesInfo(){

        List<Haltestelle> allÖPNV=haltestelles.stream().filter(h->h.getHaltestelleType().equals(HaltestelleTypes.ÖPNV)).
                                  collect(Collectors.toList());
        numOfOPNVHaltestelles=allÖPNV.size();
        
        List<Haltestelle> allSNPV=haltestelles.stream().filter(
                                          h->h.getHaltestelleType().equals(HaltestelleTypes.SPNV)
        ).collect(Collectors.toList());

        numOfSPNVHaltestelles=allSNPV.size();

    }

    

    

}

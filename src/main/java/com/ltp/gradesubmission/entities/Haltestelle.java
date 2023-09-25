package com.ltp.gradesubmission.entities;

import java.util.ArrayList;
import java.util.List;

public class Haltestelle {

    private String id;
    private  HaltestelleTypes type;
    private String dhid;
    private String hstName;
    private String ortsteil;
    private String osmId;


    
    public String getOsmId() {
        return osmId;
    }

    public void setOsmId(String osmId) {
        this.osmId = osmId;
    }

    private Kreis parentKreis;
    private String regionalkey;
    private HaltestelleTypes haltestelleType ;

    private List<HaltestelleUtilities> locationUtilities;

    private Point location;

    public Haltestelle(String id, String dhid, String hstName, String ortsteil, Kreis parentKreis, String regionalkey,
            HaltestelleTypes haltestelleType, Point location) {
        this.id = id;
        this.dhid = dhid;
        this.hstName = hstName;
        this.ortsteil = ortsteil;
        this.parentKreis = parentKreis;
        updateParentKriesHaltestelles(this);
        this.regionalkey = regionalkey;
        this.haltestelleType = haltestelleType;
        this.location = location;
        this.locationUtilities=new ArrayList<HaltestelleUtilities>();
        this.type=haltestelleType;
        this.osmId="osm";
        
    }

    public void updateParentKriesHaltestelles(Haltestelle haltestelle){
        System.out.println("updating parents");
        parentKreis.getHaltestelles().add(haltestelle);

    }

    public String getId() {
        return id;
    }

    public void setType(HaltestelleTypes type) {
        this.type = type;
    }

    public void setDhid(String dhid) {
        this.dhid = dhid;
    }

    public void setHstName(String hstName) {
        this.hstName = hstName;
    }

    public void setOrtsteil(String ortsteil) {
        this.ortsteil = ortsteil;
    }

    public void setParentKreis(Kreis parentKreis) {
        this.parentKreis = parentKreis;
    }

    public void setRegionalkey(String regionalkey) {
        this.regionalkey = regionalkey;
    }

    public void setHaltestelleType(HaltestelleTypes haltestelleType) {
        this.haltestelleType = haltestelleType;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public String getDhid() {
        return dhid;
    }

    public String getHstName() {
        return hstName;
    }

    public String getOrtsteil() {
        return ortsteil;
    }

    public Kreis getParentKreis() {
        return parentKreis;
    }

    public String getRegionalkey() {
        return regionalkey;
    }

    public HaltestelleTypes getHaltestelleType() {
        return haltestelleType;
    }

    public Point getLocation() {
        return location;

    }

    public HaltestelleTypes getType() {
        System.out.print(type);
        return type;
    }

    public List<HaltestelleUtilities> getLocationUtilities() {
        return locationUtilities;
    }

    

    

    


    
    



    
}

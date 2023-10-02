package com.ltp.gradesubmission.entities;

public abstract class HaltestelleUtilities {

    private String objectId;
    public String type;
    private Haltestelle parentHaltestelle;
    private String osmId;

    public String description;
    public String getDescription() {
        return description;
    }

    public String getObjectId() {
        return objectId;
    }

    public abstract  void generateDescription();



    
    public HaltestelleUtilities(String objectId, String type, Haltestelle parentHaltestelle, String osmId) {
        this.objectId = objectId;
        this.type = type;
        this.parentHaltestelle = parentHaltestelle;
        this.osmId = osmId;
        this.description="Keine Informationen verfügbar";
        System.out.println("created object of type:"+type);
        UpdateParentHaltestelle(this);
    }


    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Haltestelle getParentHaltestelle() {
        return parentHaltestelle;
    }
    public void setParentHaltestelle(Haltestelle parentHaltestelle) {
        this.parentHaltestelle = parentHaltestelle;
    }
    public String getOsmId() {
        return osmId;
    }
    public void setOsmId(String osmId) {
        this.osmId = osmId;
    }

    public void UpdateParentHaltestelle(HaltestelleUtilities haltestelleUtility){
        System.out.println("updating parent haltestellen");
        parentHaltestelle.getLocationUtilities().add(haltestelleUtility);
        
    }
    
    
}

package com.ltp.gradesubmission.entities;

public class Fahrradanlage extends HaltestelleUtilities {

    private int stellplatzanzahl;
    private String anlagetype;
    private Boolean beleuchtet;
    private Boolean uberwacht;
    private String hinderniszufahrt;
    private Boolean kostenpflichtig;
    private String kostenpflichtignotiz;
    private String notiz;
    private String objekt_Foto;
    private String weg_Foto;

    private Point location;

    private String besonderheiten_Foto;

    private String hinderniszufahrt_Foto;


    @Override
    public void generateDescription() {
        super.description="Fahrrad anlage mit"+stellplatzanzahl+" anlageplatz";
    }

    public Fahrradanlage(String objectId, String type, Haltestelle parHaltestelle, String osmId){
        super(objectId, type, parHaltestelle, osmId);

    }




    public int getStellplatzanzahl() {
        return stellplatzanzahl;
    }




    public void setStellplatzanzahl(int stellplatzanzahl) {
        this.stellplatzanzahl = stellplatzanzahl;
    }




    public String getAnlagetype() {
        return anlagetype;
    }




    public void setAnlagetype(String anlagetype) {
        this.anlagetype = anlagetype;
    }




    public Boolean getBeleuchtet() {
        return beleuchtet;
    }




    public void setBeleuchtet(Boolean beleuchtet) {
        this.beleuchtet = beleuchtet;
    }




    public Boolean getUberwacht() {
        return uberwacht;
    }




    public void setUberwacht(Boolean uberwacht) {
        this.uberwacht = uberwacht;
    }




    public String getHinderniszufahrt() {
        return hinderniszufahrt;
    }




    public void setHinderniszufahrt(String hinderniszufahrt) {
        this.hinderniszufahrt = hinderniszufahrt;
    }




    public Boolean getKostenpflichtig() {
        return kostenpflichtig;
    }




    public void setKostenpflichtig(Boolean kostenpflichtig) {
        this.kostenpflichtig = kostenpflichtig;
    }




    public String getKostenpflichtignotiz() {
        return kostenpflichtignotiz;
    }




    public void setKostenpflichtignotiz(String kostenpflichtignotiz) {
        this.kostenpflichtignotiz = kostenpflichtignotiz;
    }




    public String getNotiz() {
        return notiz;
    }




    public void setNotiz(String notiz) {
        this.notiz = notiz;
    }




    public String getObjekt_Foto() {
        return objekt_Foto;
    }




    public void setObjekt_Foto(String objekt_Foto) {
        this.objekt_Foto = objekt_Foto;
    }




    public String getWeg_Foto() {
        return weg_Foto;
    }




    public void setWeg_Foto(String weg_Foto) {
        this.weg_Foto = weg_Foto;
    }




    public Point getLocation() {
        return location;
    }




    public void setLocation(Point location) {
        this.location = location;
    }




    public String getBesonderheiten_Foto() {
        return besonderheiten_Foto;
    }




    public void setBesonderheiten_Foto(String besonderheiten_Foto) {
        this.besonderheiten_Foto = besonderheiten_Foto;
    }




    public String getHinderniszufahrt_Foto() {
        return hinderniszufahrt_Foto;
    }




    public void setHinderniszufahrt_Foto(String hinderniszufahrt_Foto) {
        this.hinderniszufahrt_Foto = hinderniszufahrt_Foto;
    }

    
    
}

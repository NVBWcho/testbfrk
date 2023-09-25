package com.ltp.gradesubmission.entities;

public class Aufzug extends HaltestelleUtilities {

    private int turweite;
    private int grundflaechenlaenge_cm;
    private int grundflaechenbreite_cm;
    private String verbindungsfunktion;
    private String ebene1_Foto;
    private String ebene2_Foto;
    private String ebene3_Foto;
    private String bedieneelement_Foto;
    private String schild_Foto;
    private String stoerungkontakt_Foto;


    


   public Aufzug(String objectId,String type, Haltestelle parHaltestelle,String osmId){
    super(objectId, type, parHaltestelle, osmId);

   }


public int getTurweite() {
    return turweite;
}


public void setTurweite(int turweite) {
    this.turweite = turweite;
}


public int getGrundflaechenlaenge_cm() {
    return grundflaechenlaenge_cm;
}


public void setGrundflaechenlaenge_cm(int grundflaechenlaenge_cm) {
    this.grundflaechenlaenge_cm = grundflaechenlaenge_cm;
}


public int getGrundflaechenbreite_cm() {
    return grundflaechenbreite_cm;
}


public void setGrundflaechenbreite_cm(int grundflaechenbreite_cm) {
    this.grundflaechenbreite_cm = grundflaechenbreite_cm;
}


public String getVerbindungsfunktion() {
    return verbindungsfunktion;
}


public void setVerbindungsfunktion(String verbindungsfunktion) {
    this.verbindungsfunktion = verbindungsfunktion;
}


public String getEbene1_Foto() {
    return ebene1_Foto;
}


public void setEbene1_Foto(String ebene1_Foto) {
    this.ebene1_Foto = ebene1_Foto;
}


public String getEbene2_Foto() {
    return ebene2_Foto;
}


public void setEbene2_Foto(String ebene2_Foto) {
    this.ebene2_Foto = ebene2_Foto;
}


public String getEbene3_Foto() {
    return ebene3_Foto;
}


public void setEbene3_Foto(String ebene3_Foto) {
    this.ebene3_Foto = ebene3_Foto;
}


public String getBedieneelement_Foto() {
    return bedieneelement_Foto;
}


public void setBedieneelement_Foto(String bedieneelement_Foto) {
    this.bedieneelement_Foto = bedieneelement_Foto;
}


public String getSchild_Foto() {
    return schild_Foto;
}


public void setSchild_Foto(String schild_Foto) {
    this.schild_Foto = schild_Foto;
}


public String getStoerungkontakt_Foto() {
    return stoerungkontakt_Foto;
}


public void setStoerungkontakt_Foto(String stoerungkontakt_Foto) {
    this.stoerungkontakt_Foto = stoerungkontakt_Foto;
}

   
    
}

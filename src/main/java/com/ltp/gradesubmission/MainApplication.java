package com.ltp.gradesubmission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ltp.gradesubmission.entities.Aufzug;
import com.ltp.gradesubmission.entities.Fahrradanlage;
import com.ltp.gradesubmission.entities.Haltestelle;
import com.ltp.gradesubmission.entities.HaltestelleTypes;
import com.ltp.gradesubmission.entities.Kreis;
import com.ltp.gradesubmission.entities.Point;
import com.ltp.gradesubmission.repository.HaltestelleRepository;
import com.ltp.gradesubmission.repository.KreisRepository;
import com.ltp.gradesubmission.service.GradeService;

import java.text.SimpleDateFormat;


@SpringBootApplication
public class MainApplication implements CommandLineRunner {


    @Autowired
    private GradeService gradeService;

    @Autowired

    private KreisRepository kreisRepository;

    @Autowired
    private HaltestelleRepository haltestelleRepository;

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        Kreis kries0=new Kreis("A1", "Stuttgart");
        Kreis kries1=new Kreis("A2","Esslingen");

        kreisRepository.addKries(kries0);
        kreisRepository.addKries(kries1);

        HaltestelleTypes öpnv=HaltestelleTypes.ÖPNV;
        HaltestelleTypes spnv=HaltestelleTypes.SPNV;
        Point stuttgarthbfcoods=new Point(48.4, 5.2);
        Point esslingenbahnhofcood=new Point(48.2,5.1);



        Haltestelle h0=new Haltestelle("dhid:001", "dhid:001", "hauptbahnhof", "mitte", kries0, "A001", spnv, stuttgarthbfcoods);
        System.out.println("h0 is"+h0.getType());
        Haltestelle h1=new Haltestelle("dhid:002", "dhid:002", "hauptbahnhof_U", "mitte", kries0, "A001", öpnv, stuttgarthbfcoods);

        Haltestelle h2=new Haltestelle("dhid:003", "dhid:003", "bahnhof", "mitte", kries1, "A002", öpnv, esslingenbahnhofcood);

        System.out.println("created Haltestelles");

        kries0.updateKriesInfo();
        kries1.updateKriesInfo();

        System.out.println("updated kries information");

        haltestelleRepository.addHaltestelle(h1);
        haltestelleRepository.addHaltestelle(h2);
        haltestelleRepository.addHaltestelle(h0);


        Aufzug aufzug0=new Aufzug("Lift1","Aufzug", h0, "osm");
        Aufzug aufzug1=new Aufzug("Lift2","Aufzug", h0, "osm");
        aufzug0.setVerbindungsfunktion("Von 0 bis 1");
        aufzug1.setVerbindungsfunktion("von 0 bis 2");
        aufzug0.generateDescription();
        aufzug1.generateDescription();
        Fahrradanlage fahrradanlage0=new Fahrradanlage("FA1","Fahrradanlage", h0, "osm");

        Fahrradanlage fahrradanlage1=new Fahrradanlage("FA2","Fahrradanlage", h0, "osm");

        Aufzug aufzug2=new Aufzug("Lift1","Aufzug", h2, "osm");
        aufzug2.setVerbindungsfunktion("von 0 bis 3");
        aufzug2.generateDescription();
       

        Fahrradanlage fahrradanlage2=new Fahrradanlage("FA1","Fahrradanlage", h2, "osm");

        kreisRepository.getAllSPNVinKries("A1");








    }


}

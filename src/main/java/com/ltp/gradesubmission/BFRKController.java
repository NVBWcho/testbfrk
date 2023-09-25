package com.ltp.gradesubmission;



import com.ltp.gradesubmission.achive.Grade;
import com.ltp.gradesubmission.entities.Haltestelle;
import com.ltp.gradesubmission.entities.HaltestelleUtilities;
import com.ltp.gradesubmission.entities.Kreis;
import com.ltp.gradesubmission.repository.HaltestelleRepository;
import com.ltp.gradesubmission.repository.KreisRepository;
import com.ltp.gradesubmission.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

import javax.validation.Valid;

@Controller
public class BFRKController {

    @Autowired
    GradeService gradeService;

    @Autowired
    KreisRepository kreisRepository;

    @Autowired
    HaltestelleRepository haltestelleRepository;



    @GetMapping("/")
    public String getForm(Model model, @RequestParam(required = false) String id) {

        model.addAttribute("grade", gradeService.getGradeById(id));
        model.addAttribute("subjects", gradeService.getSubjects());

        return "landingPage";
    }

    @GetMapping("/landingPage")
    public String getLandingPage(Model model) {

        return "landingPage";
    }

    @PostMapping("/handleSubmit")
    public String submitForm(@Valid Grade grade, BindingResult result, RedirectAttributes redirectAttributes,
                             Model model) {

        gradeService.submitGrade(grade);

        if (result.hasErrors()) {
            model.addAttribute("subjects", gradeService.getSubjects());
            return "form";
        }

        redirectAttributes.addFlashAttribute("newGrade", grade);
        redirectAttributes.addFlashAttribute("message", "Added successfully.");

        return "redirect:/success";
    }






    @GetMapping("/KriesOPNV")
    public String getÖPNVKries(Model model) {
        model.addAttribute("grades", gradeService.getGrades());

        List<Kreis> allkreis=kreisRepository.getAllKreis();
        model.addAttribute("kriesOPNV", allkreis);
        for (Kreis kreis:allkreis){
            System.out.println(kreis.getName());
            System.out.println("num of ÖPNV "+kreis.getNumOfOPNVHaltestelles());

        }

        return "kriesopnv";
    }



    @GetMapping("/KriesSPNV")
    public String getSPNVKries(Model model) {
        model.addAttribute("grades", gradeService.getGrades());

        List<Kreis> allkreis=kreisRepository.getAllKreis();
        model.addAttribute("kriesOPNV", allkreis);
        for (Kreis kreis:allkreis){
            System.out.println(kreis.getName());
            System.out.println("num of ÖPNV "+kreis.getNumOfSPNVHaltestelles());

        }

        return "kreisspnv";
    }

    @GetMapping("/OPNVatKries/{id}")
    public String getOPNVforKries(Model model,@PathVariable String id){
        System.out.println(id);

        Kreis thiKreis=kreisRepository.getKreisById(id);

        List<Haltestelle> haltestellesatKries=kreisRepository.getAllÖPNVinKries(id);

        model.addAttribute("stopsAtKreis", haltestellesatKries)/* */;
        model.addAttribute("kreisname", thiKreis);
        System.out.println(model.getAttribute("kreisname"));

        for (Haltestelle h:haltestellesatKries){
            System.out.println(h.getHstName());
            System.out.println(h.getDhid());
            System.out.println(h.getOsmId());
        }

        System.out.println(id);
        return "showstations";
    }


    @GetMapping("/SPNVatKries/{id}")

    public String getSPNVforKries(Model model,@PathVariable String id){
        System.out.println(id);

        Kreis thiKreis=kreisRepository.getKreisById(id);

        List<Haltestelle> haltestellesatKries=kreisRepository.getAllSPNVinKries(id);

        model.addAttribute("stopsAtKreis", haltestellesatKries)/* */;

        for (Haltestelle h:haltestellesatKries){
            System.out.println(h.getHstName());
            System.out.println(h.getDhid());
            System.out.println(h.getOsmId());
        }

        System.out.println(id);
        return "showstations";
    }


    @GetMapping("/Facility/{id}")
    public String getEinrichtugen(Model model,@PathVariable String id){
        System.out.println(id);
        System.out.println("hello from facilities");

        Haltestelle thiHaltestelle=haltestelleRepository.getHaltestelleById(id);
        List<HaltestelleUtilities> utilitiesAtSite=thiHaltestelle.getLocationUtilities();

        if(utilitiesAtSite.isEmpty()){

            System.out.println("No utilities at the site");
            return "noinformationalert";

        }

        model.addAttribute("utilities", utilitiesAtSite);

        String stopname=thiHaltestelle.getParentKreis().getName()+" "+thiHaltestelle.getHstName();

        model.addAttribute("stopname", stopname);

        System.out.println(thiHaltestelle.getParentKreis().getName());
        System.out.println(thiHaltestelle.getHstName());

        System.out.println(utilitiesAtSite.get(0).getObjectId());
        System.out.println(utilitiesAtSite.get(0).getType());
        System.out.println(utilitiesAtSite.get(0).getOsmId());




        return "showutilities";
    }

}
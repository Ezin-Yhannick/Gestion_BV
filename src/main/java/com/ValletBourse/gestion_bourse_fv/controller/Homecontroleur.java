package com.ValletBourse.gestion_bourse_fv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homecontroleur {

    @GetMapping("/") // Permet de mapper la requete GET à l'url racine
    public String homePage(){
        //Il retourne la vue vers la page d'ailleurs
        return "index";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }
}

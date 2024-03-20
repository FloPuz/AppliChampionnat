package com.example.applichampionnat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EquipeController {

    @GetMapping("/equipes")
    public ModelAndView showListEquipes(){

        return null;
    }

    @GetMapping("/equipes/{id}/equipesDetail")
    public ModelAndView showDetailEquipe(@PathVariable Long id){

        //Redirect sur l'équipe avec ces details
        return null;
    }
}

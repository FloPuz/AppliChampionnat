package com.example.applichampionnat.controller;

import com.example.applichampionnat.pojos.Equipe;
import com.example.applichampionnat.services.EquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EquipeController {

    @Autowired
    EquipeService equipeService;

    @GetMapping("/equipes")
    public ModelAndView showListEquipes(){

        return null;
    }

    @GetMapping("/equipes/{id}/equipesDetail")
    public String showDetailEquipe(@PathVariable Long id, Model model){

        Equipe equipe = equipeService.getEquipeById(id);
        model.addAttribute("equipe", equipe);

        //Redirect sur l'équipe avec ces details
        return null;
    }
}

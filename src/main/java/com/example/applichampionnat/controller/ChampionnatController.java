package com.example.applichampionnat.controller;

import com.example.applichampionnat.pojos.Championnat;
import com.example.applichampionnat.pojos.Equipe;
import com.example.applichampionnat.services.ChampionnatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ChampionnatController {

    @Autowired
    private ChampionnatService championnatService;



    @GetMapping("/championnats")
    public String showListChampionnats(Model model){
        List<Championnat> championnats = championnatService.getAllChampionnats();
        model.addAttribute("champs", championnats);
        return "championnats";
    }

    @GetMapping("/championnats/{id}")
    public String showchampioonatsList(Model model, @PathVariable Long id) {
        List<Equipe> equipes = championnatService.getClassementByChampionnat(id);
        Championnat championnat = championnatService.getChampionnatById(id);
        model.addAttribute("classementChamp", equipes);
        model.addAttribute("championnat", championnat);

        return "championnatDetails";
    }

    @GetMapping("/championnats/{id}/journees")
    public ModelAndView showJourneesChampionnat(@PathVariable Long id){

        //Redirect sur les journées avec la liste de toutes les journées cliquable
        return null;
    }
}

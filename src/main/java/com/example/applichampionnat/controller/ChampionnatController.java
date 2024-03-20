package com.example.applichampionnat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChampionnatController {


    @GetMapping("/championnats")
    public ModelAndView showListChampionnats(){

        return null;
    }

    @GetMapping("/championnats/{id}/journees")
    public ModelAndView showJourneesChampionnat(@PathVariable Long id){

        //Redirect sur les journées avec la liste de toutes les journées cliquable
        return null;
    }
}

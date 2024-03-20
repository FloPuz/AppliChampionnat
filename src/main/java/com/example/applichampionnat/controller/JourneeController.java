package com.example.applichampionnat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JourneeController {


    @GetMapping("/journees")
    public ModelAndView showListJournees(){

        return null;
    }

    @GetMapping("/journees/{id}/games")
    public ModelAndView showDetailJourneesListGame(@PathVariable Long id){

        //List les différents matches de la journée,
        // au clic de ces match redirection vers le detail du match(GameController)
        return null;
    }

}

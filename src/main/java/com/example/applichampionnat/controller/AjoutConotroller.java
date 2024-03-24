package com.example.applichampionnat.controller;

import com.example.applichampionnat.pojos.*;
import com.example.applichampionnat.services.*;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.rmi.dgc.Lease;
import java.util.List;
import java.util.Stack;

@Controller
public class AjoutConotroller {


    @Autowired
    private HttpSession httpSession;

    @Autowired
    private GameService gameService;

    @Autowired
    private ChampionnatService championnatService;

    @Autowired
    private EquipeService equipeService;

    @Autowired
    private JourneeService journeeService;

    @Autowired
    private StadeService stadeService;

    @Autowired
    private PaysService paysService;

    @GetMapping("/addGame")
    public String showAddGameForm (Model model) {
        List<Journee> journees = journeeService.getAllJournees();
        List<Equipe> equipes = equipeService.getAllEquipes();
        model.addAttribute("journees", journees);
        model.addAttribute("game", new Game());
        model.addAttribute("equipes", equipes);
       return "addGame";
    }

    @GetMapping("/addTeam")
    public String showAddTeamForm (Model model) {
        List<Championnat> championnats = championnatService.getAllChampionnats();
        List<Stade> stades = stadeService.getAllStades();
        model.addAttribute("stades", stades);
        model.addAttribute("leagues", championnats);
        model.addAttribute("equipe", new Equipe());
        return "addTeam";
    }

    @GetMapping("/addLeague")
    public String showAddLeagueForm (Model model) {
        model.addAttribute("league", new Championnat());
        List<Pays> payss = paysService.getAllPays();
        model.addAttribute("payss", payss);
        return "addLeague";
    }

    @GetMapping("/addJourney")
    public String showAddJourneyForm (Model model) {
        List<Championnat> championnats = championnatService.getAllChampionnats();
        model.addAttribute("journee", new Journee());
        model.addAttribute("championnats", championnats);
        return "addJourney";
    }

    @PostMapping("/addGame")
    public String addGame(@ModelAttribute Game game, Model model) {
        gameService.addGame(game);
        return "redirect:/home";
    }

    @PostMapping("/addTeam")
    public String addTeam(@ModelAttribute Equipe equipe, Model model) {
        equipeService.addEquipe(equipe);
        return "redirect:/home";
    }

    @PostMapping("/addLeague")
    public String addLeague(@ModelAttribute Championnat championnat, Model model) {
        championnatService.addChampionnat(championnat);
        return "redirect:/home";
    }

    @PostMapping("/addJourney")
    public String addJourney(@ModelAttribute Journee journee, Model model) {
        journeeService.addJournee(journee);
        return "redirect:/home";
    }



}

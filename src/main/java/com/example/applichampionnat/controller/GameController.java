package com.example.applichampionnat.controller;

import com.example.applichampionnat.pojos.Game;
import com.example.applichampionnat.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
class GameController {

    @Autowired
    GameService gameService;

    @GetMapping("/games")
    public ModelAndView showListGames(){

        return null;
    }

    @GetMapping("/games/{id}/detail")
    public String showDetailGames(@PathVariable Long id, Model model){
        Game game = gameService.getGameById(id);
        model.addAttribute("game", game);
        //List les différents matches de la journée,
        // au clic de ces match redirection vers le detail du match(GameController)
        return "gameDetails";
    }
}

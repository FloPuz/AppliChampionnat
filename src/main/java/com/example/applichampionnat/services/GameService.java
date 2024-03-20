package com.example.applichampionnat.services;

import com.example.applichampionnat.pojos.Equipe;
import com.example.applichampionnat.pojos.Game;
import com.example.applichampionnat.pojos.Journee;
import com.example.applichampionnat.pojos.Stade;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GameService {
    Game addGame(Game game);
    Game getGameById(Long id);
    List<Game> getAllGames();
    void updateGame(Game game);
    void deleteGame(Long id);
    List<Game> getGamesByEquipe(Long idEquipe);
    List<Game> getGamesByJournee(Long idJournee);
    List<Game> getGamesByStade(Long idStade);
    List<Equipe> getTeamsByGame(Long idGame);
    Journee getJourneeByGame(Long idGame);
    Stade getStadeByGame(Long idGame);
}

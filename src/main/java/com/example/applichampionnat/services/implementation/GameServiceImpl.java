package com.example.applichampionnat.services.implementation;

import com.example.applichampionnat.dao.ChampionnatDao;
import com.example.applichampionnat.dao.EquipeDao;
import com.example.applichampionnat.dao.GameDao;
import com.example.applichampionnat.dao.StadeDao;
import com.example.applichampionnat.pojos.Equipe;
import com.example.applichampionnat.pojos.Game;
import com.example.applichampionnat.pojos.Journee;
import com.example.applichampionnat.pojos.Stade;
import com.example.applichampionnat.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class GameServiceImpl implements GameService {


    @Autowired
    private GameDao gameDao;

    @Autowired
    private EquipeDao equipeDao;

    @Autowired
    private StadeDao stadeDao;

    @Autowired
    private ChampionnatDao championnatDao;

    @Override
    public Game addGame(Game game) {
        return null;
    }

    @Override
    public Game getGameById(Long id) {
        return null;
    }

    @Override
    public List<Game> getAllGames() {
        return null;
    }

    @Override
    public void updateGame(Game game) {

    }

    @Override
    public void deleteGame(Long id) {

    }

    @Override
    public List<Game> getGamesByEquipe(Long idEquipe) {
        return null;
    }

    @Override
    public List<Game> getGamesByJournee(Long idJournee) {
        return null;
    }

    @Override
    public List<Game> getGamesByStade(Long idStade) {
        return null;
    }

    @Override
    public List<Equipe> getTeamsByGame(Long idGame) {
        return null;
    }

    @Override
    public Journee getJourneeByGame(Long idGame) {
        return null;
    }

    @Override
    public Stade getStadeByGame(Long idGame) {
        return null;
    }
}

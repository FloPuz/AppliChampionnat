package com.example.applichampionnat.services.implementation;

import com.example.applichampionnat.dao.ChampionnatDao;
import com.example.applichampionnat.dao.EquipeDao;
import com.example.applichampionnat.dao.GameDao;
import com.example.applichampionnat.dao.StadeDao;
import com.example.applichampionnat.pojos.Equipe;
import com.example.applichampionnat.pojos.Game;
import com.example.applichampionnat.pojos.Stade;
import com.example.applichampionnat.services.StadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class StadeServiceImpl implements StadeService {

    @Autowired
    private GameDao gameDao;

    @Autowired
    private EquipeDao equipeDao;

    @Autowired
    private StadeDao stadeDao;

    @Autowired
    private ChampionnatDao championnatDao;

    @Override
    public Stade addStade(Stade stade) {
        return null;
    }

    @Override
    public Stade getStadeById(Long id) {
        return null;
    }

    @Override
    public List<Stade> getAllStades() {
        return null;
    }

    @Override
    public void updateStade(Stade stade) {

    }

    @Override
    public void deleteStade(Long id) {

    }

    @Override
    public List<Equipe> getEquipesByStade(Long idStade) {
        return null;
    }

    @Override
    public List<Game> getGamesByStade(Long idStade) {
        return null;
    }
}

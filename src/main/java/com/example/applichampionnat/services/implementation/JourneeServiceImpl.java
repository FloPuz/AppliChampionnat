package com.example.applichampionnat.services.implementation;

import com.example.applichampionnat.dao.*;
import com.example.applichampionnat.pojos.Championnat;
import com.example.applichampionnat.pojos.Game;
import com.example.applichampionnat.pojos.Journee;
import com.example.applichampionnat.services.JourneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class JourneeServiceImpl implements JourneeService {

    @Autowired
    private JourneeDao journeeDao;

    @Autowired
    private GameDao gameDao;

    @Autowired
    private EquipeDao equipeDao;

    @Autowired
    private StadeDao stadeDao;

    @Autowired
    private ChampionnatDao championnatDao;

    @Override
    public Journee addJournee(Journee journee) {
        return journeeDao.save(journee);
    }

    @Override
    public Journee getJourneeById(Long id) {
        return null;
    }

    @Override
    public List<Journee> getAllJournees() {
        return journeeDao.findAll();
    }

    @Override
    public void updateJournee(Journee journee) {

    }

    @Override
    public void deleteJournee(Long id) {

    }

    @Override
    public List<Game> getGamesByJournee(Long idJournee) {
        return null;
    }

    @Override
    public Championnat getChampionnatByJournee(Long idJournee) {
        return null;
    }
}

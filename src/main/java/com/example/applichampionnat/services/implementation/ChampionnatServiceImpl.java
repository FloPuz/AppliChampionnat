package com.example.applichampionnat.services.implementation;

import com.example.applichampionnat.dao.ChampionnatDao;
import com.example.applichampionnat.dao.EquipeDao;
import com.example.applichampionnat.dao.JourneeDao;
import com.example.applichampionnat.pojos.Championnat;
import com.example.applichampionnat.pojos.Equipe;
import com.example.applichampionnat.pojos.Journee;
import com.example.applichampionnat.services.ChampionnatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ChampionnatServiceImpl implements ChampionnatService {

    @Autowired
    private ChampionnatDao championnatDao;

    @Autowired
    private EquipeDao equipeDao;

    @Autowired
    private JourneeDao journeeDao;

    @Override
    public Championnat addChampionnat(Championnat championnat) {
        return null;
    }

    @Override
    public Championnat getChampionnatById(Long id) {
        return null;
    }

    @Override
    public List<Championnat> getAllChampionnats() {
        return null;
    }

    @Override
    public void updateChampionnat(Championnat championnat) {

    }

    @Override
    public void deleteChampionnat(Long id) {

    }

    @Override
    public List<Equipe> getEquipesByChampionnat(Long idChampionnat) {
        return null;
    }

    @Override
    public List<Journee> getJourneesByChampionnat(Long idChampionnat) {
        return null;
    }

    @Override
    public List<Equipe> getClassementByChampionnat(Long idChampionnat) {
        return null;
    }

    @Override
    public List<Equipe> getAllEquipes() {
        return null;
    }

    @Override
    public List<Journee> getAllJournees() {
        return null;
    }

    @Override
    public List<Equipe> getEquipesNotInChampionnat(Long idChampionnat) {
        return null;
    }

    @Override
    public List<Championnat> getChampionnatsByEquipe(Long idEquipe) {
        return null;
    }

    @Override
    public List<Championnat> getChampionnatsByPays(Long idPays) {
        return null;
    }
}

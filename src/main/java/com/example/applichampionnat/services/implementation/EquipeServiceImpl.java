package com.example.applichampionnat.services.implementation;

import com.example.applichampionnat.dao.ChampionnatDao;
import com.example.applichampionnat.dao.EquipeDao;
import com.example.applichampionnat.dao.StadeDao;
import com.example.applichampionnat.pojos.Championnat;
import com.example.applichampionnat.pojos.Equipe;
import com.example.applichampionnat.pojos.Stade;
import com.example.applichampionnat.services.EquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipeServiceImpl implements EquipeService {
    @Autowired
    private EquipeDao equipeDao;

    @Autowired
    private StadeDao stadeDao;

    @Autowired
    private ChampionnatDao championnatDao;

    @Override
    public Equipe addEquipe(Equipe equipe) {
        return equipeDao.save(equipe);
    }

    @Override
    public Equipe getEquipeById(Long id) {
        return equipeDao.findById(id).orElse(null);
    }

    @Override
    public List<Equipe> getAllEquipes() {
        return equipeDao.findAll();
    }

    @Override
    public void updateEquipe(Equipe equipe) {

    }

    @Override
    public void deleteEquipe(Long id) {

    }

    @Override
    public List<Championnat> getChampionnatsByEquipe(Long idEquipe) {
        return null;
    }

    @Override
    public List<Equipe> getEquipesByChampionnat(Long idChampionnat) {
        return null;
    }

    @Override
    public Stade getStadeByEquipe(Long idEquipe) {
        return null;
    }
}

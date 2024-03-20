package com.example.applichampionnat.services.implementation;

import com.example.applichampionnat.dao.ChampionnatDao;
import com.example.applichampionnat.dao.ChampionnatEquipeDao;
import com.example.applichampionnat.dao.EquipeDao;
import com.example.applichampionnat.dao.JourneeDao;
import com.example.applichampionnat.enums.TypeClassement;
import com.example.applichampionnat.pojos.Championnat;
import com.example.applichampionnat.pojos.ChampionnatEquipe;
import com.example.applichampionnat.pojos.Equipe;
import com.example.applichampionnat.pojos.Journee;
import com.example.applichampionnat.services.ChampionnatService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChampionnatServiceImpl implements ChampionnatService {

    @Autowired
    private ChampionnatDao championnatDao;

    @Autowired
    private ChampionnatEquipeDao championnatEquipeDao;

    @Autowired
    private EquipeDao equipeDao;

    @Autowired
    private JourneeDao journeeDao;

    @Override
    public Championnat addChampionnat(Championnat championnat) {
        return championnatDao.save(championnat);
    }

    @Override
    public Championnat getChampionnatById(Long id) {
        return championnatDao.findById(id).orElse(null);
    }

    @Override
    public List<Championnat> getAllChampionnats() {
        return championnatDao.findAll();
    }

    @Override
    public void updateChampionnat(Championnat championnat) {
        championnatDao.save(championnat);
    }

    @Override
    public void deleteChampionnat(Long id) {
        championnatDao.deleteById(id);
    }

    @Override
    public List<Equipe> getEquipesByChampionnat(Long idChampionnat) {
        return equipeDao.findEquipesByChampionnatId(idChampionnat);
    }

    @Override
    public List<Journee> getJourneesByChampionnat(Long idChampionnat) {
        return journeeDao.findJourneesByChampionnatId(idChampionnat);
    }

    @Override
    public List<Equipe> getClassementByChampionnat(Long idChampionnat) {
        List<ChampionnatEquipe> championnatEquipes = championnatEquipeDao.findByChampionnatId(idChampionnat);

        championnatEquipes.sort(Comparator.comparingInt(ChampionnatEquipe::getPoints).reversed());

        return championnatEquipes.stream()
                .map(ChampionnatEquipe::getEquipe)
                .collect(Collectors.toList());
    }


    @Override
    public List<Equipe> getClassementByChampionnat(Long idChampionnat, TypeClassement typeClassement) {
        List<ChampionnatEquipe> championnatEquipes = championnatEquipeDao.findByChampionnatId(idChampionnat);

        // Appliquer le classement en fonction du type spécifié
        // Implémenter les methodes si nécessaire (Premier temps on filtre pas)
        /*
        switch (typeClassement) {
            case GoalScored:
                championnatEquipes.sort(Comparator.comparingInt(ChampionnatEquipe::getButsMarques).reversed());
                break;
            case GoalConceded:
                championnatEquipes.sort(Comparator.comparingInt(ChampionnatEquipe::getButsEncaisses));
                break;
            case GoalDiff:
                championnatEquipes.sort(Comparator.comparingInt(equipe -> equipe.getButsMarques() - equipe.getButsEncaisses()).reversed());
                break;
            case DefeatAmount:
                championnatEquipes.sort(Comparator.comparingInt(ChampionnatEquipe::getNombreDefaites));
                break;
            default:
                // Par défaut, trier par points
                championnatEquipes.sort(Comparator.comparingInt(ChampionnatEquipe::getPoints).reversed());
                break;
        }

        return championnatEquipes.stream()
                .map(ChampionnatEquipe::getEquipe)
                .collect(Collectors.toList());
        */
        return null;
    }
    @Override
    public List<Equipe> getAllEquipes() {
        return equipeDao.findAll();
    }

    @Override
    public List<Journee> getAllJournees() {
        return journeeDao.findAll();
    }

    @Override
    public List<Equipe> getEquipesNotInChampionnat(Long idChampionnat) {
        return null;
    }

    @Override
    public List<Championnat> getChampionnatsByEquipe(Long idEquipe) {
        return championnatDao.findByEquipeId(idEquipe);
    }

    @Override
    public List<Championnat> getChampionnatsByPays(Long idPays) {
        return championnatDao.findByPaysId(idPays);
    }


    @Override
    public void addEquipeToChampionnat(Long championnatId, Long equipeId) {
        Championnat championnat = championnatDao.findById(championnatId).orElseThrow(() -> new EntityNotFoundException("Championnat not found"));
        Equipe equipe = equipeDao.findById(equipeId).orElseThrow(() -> new EntityNotFoundException("Equipe not found"));

        championnat.getEquipes().add(equipe);
        championnatDao.save(championnat);
    }

    @Override
    public void removeEquipeFromChampionnat(Long championnatId, Long equipeId) {
        Championnat championnat = championnatDao.findById(championnatId).orElseThrow(() -> new EntityNotFoundException("Championnat not found"));
        Equipe equipe = equipeDao.findById(equipeId).orElseThrow(() -> new EntityNotFoundException("Equipe not found"));

        championnat.getEquipes().remove(equipe);
        championnatDao.save(championnat);
    }
}

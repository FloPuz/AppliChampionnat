package com.example.applichampionnat.services;

import com.example.applichampionnat.enums.TypeClassement;
import com.example.applichampionnat.pojos.Championnat;
import com.example.applichampionnat.pojos.Equipe;
import com.example.applichampionnat.pojos.Journee;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface ChampionnatService {

    Championnat addChampionnat(Championnat championnat);
    Championnat getChampionnatById(Long id);
    List<Championnat> getAllChampionnats();
    void updateChampionnat(Championnat championnat);
    void deleteChampionnat(Long id);
    List<Equipe> getEquipesByChampionnat(Long idChampionnat);
    List<Journee> getJourneesByChampionnat(Long idChampionnat);
    List<Equipe> getClassementByChampionnat(Long idChampionnat);
    List<Equipe> getAllEquipes();
    List<Journee> getAllJournees();
    List<Equipe> getEquipesNotInChampionnat(Long idChampionnat);
    List<Championnat> getChampionnatsByEquipe(Long idEquipe);
    List<Championnat> getChampionnatsByPays(Long idPays);


}




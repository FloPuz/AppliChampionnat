package com.example.applichampionnat.services;

import com.example.applichampionnat.pojos.Championnat;
import com.example.applichampionnat.pojos.Equipe;
import com.example.applichampionnat.pojos.Stade;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EquipeService {
    Equipe addEquipe(Equipe equipe);
    Equipe getEquipeById(Long id);
    List<Equipe> getAllEquipes();
    void updateEquipe(Equipe equipe);
    void deleteEquipe(Long id);
    List<Championnat> getChampionnatsByEquipe(Long idEquipe);
    List<Equipe> getEquipesByChampionnat(Long idChampionnat);
    Stade getStadeByEquipe(Long idEquipe);
}

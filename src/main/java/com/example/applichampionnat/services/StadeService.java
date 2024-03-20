package com.example.applichampionnat.services;

import com.example.applichampionnat.pojos.Equipe;
import com.example.applichampionnat.pojos.Game;
import com.example.applichampionnat.pojos.Stade;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StadeService {
    Stade addStade(Stade stade);
    Stade getStadeById(Long id);
    List<Stade> getAllStades();
    void updateStade(Stade stade);
    void deleteStade(Long id);
    List<Equipe> getEquipesByStade(Long idStade);
    List<Game> getGamesByStade(Long idStade);
}

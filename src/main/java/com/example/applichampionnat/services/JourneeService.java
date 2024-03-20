package com.example.applichampionnat.services;

import com.example.applichampionnat.pojos.Championnat;
import com.example.applichampionnat.pojos.Game;
import com.example.applichampionnat.pojos.Journee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface JourneeService {
    Journee addJournee(Journee journee);
    Journee getJourneeById(Long id);
    List<Journee> getAllJournees();
    void updateJournee(Journee journee);
    void deleteJournee(Long id);
    List<Game> getGamesByJournee(Long idJournee);
    Championnat getChampionnatByJournee(Long idJournee);
}

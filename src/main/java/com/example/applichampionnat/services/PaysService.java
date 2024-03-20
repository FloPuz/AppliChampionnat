package com.example.applichampionnat.services;

import com.example.applichampionnat.pojos.Championnat;
import com.example.applichampionnat.pojos.Pays;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PaysService {
    Pays addPays(Pays pays);
    Pays getPaysById(Long id);
    List<Pays> getAllPays();
    void updatePays(Pays pays);
    void deletePays(Long id);
    List<Championnat> getChampionnatsByPays(Long idPays);
}

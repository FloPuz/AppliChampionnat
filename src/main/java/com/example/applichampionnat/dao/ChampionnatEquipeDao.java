package com.example.applichampionnat.dao;

import com.example.applichampionnat.pojos.ChampionnatEquipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChampionnatEquipeDao extends JpaRepository<ChampionnatEquipe, Long> {

    List<ChampionnatEquipe> findByChampionnat(Long championnatId);

    void deleteByChampionnatIdAndEquipeId(Long championnatId, Long equipeId);

    List<ChampionnatEquipe> findByChampionnatId(Long idChampionnat);
}


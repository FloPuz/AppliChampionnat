package com.example.applichampionnat.dao;

import com.example.applichampionnat.pojos.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipeDao extends JpaRepository<Equipe,Long> {
    List<Equipe> findEquipesByChampionnatId(Long idChampionnat);

    List<Equipe> findEquipesByChampionnatIdO(Long idChampionnat);
}

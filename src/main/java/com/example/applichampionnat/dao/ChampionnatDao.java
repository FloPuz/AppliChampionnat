package com.example.applichampionnat.dao;

import com.example.applichampionnat.pojos.Championnat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChampionnatDao extends JpaRepository<Championnat,Long> {

    List<Championnat> findByEquipeId(Long idEquipe);

    List<Championnat> findByPaysId(Long idPays);
}

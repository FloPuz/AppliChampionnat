package com.example.applichampionnat.dao;

import com.example.applichampionnat.pojos.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipeDao extends JpaRepository<Equipe,Long> {
    @Query("SELECT e FROM Equipe e " +
            "INNER JOIN ChampionnatEquipe ce ON e.id = ce.equipe.id " +
            "INNER JOIN Championnat c ON ce.championnat.id = c.id " +
            "WHERE c.id = :championnatId")
    List<Equipe> findEquipesByChampionnatId(@Param("championnatId") Long championnatId);


}

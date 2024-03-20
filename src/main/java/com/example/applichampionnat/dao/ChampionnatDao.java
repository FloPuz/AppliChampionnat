package com.example.applichampionnat.dao;

import com.example.applichampionnat.pojos.Championnat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChampionnatDao extends JpaRepository<Championnat,Long> {

    @Query("SELECT c FROM Championnat c " +
            "INNER JOIN ChampionnatEquipe ce ON c.id = ce.championnat.id " +
            "INNER JOIN Equipe e ON ce.equipe.id = e.id " +
            "WHERE e.id = :equipeId")
    List<Championnat> findByEquipeId(@Param("equipeId") Long equipeId);

    List<Championnat> findByPaysId(Long idPays);
}

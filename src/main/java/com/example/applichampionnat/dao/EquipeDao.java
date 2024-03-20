package com.example.applichampionnat.dao;

import com.example.applichampionnat.pojos.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipeDao extends JpaRepository<Equipe,Long> {
}

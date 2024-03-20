package com.example.applichampionnat.dao;

import com.example.applichampionnat.pojos.Championnat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChampionnatDao extends JpaRepository<Championnat,Long> {
}

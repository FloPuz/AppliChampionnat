package com.example.applichampionnat.dao;

import com.example.applichampionnat.pojos.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameDao extends JpaRepository<Game,Long> {
}

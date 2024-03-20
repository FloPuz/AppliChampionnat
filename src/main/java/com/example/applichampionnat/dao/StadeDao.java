package com.example.applichampionnat.dao;

import com.example.applichampionnat.pojos.Stade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StadeDao extends JpaRepository<Stade,Long> {
}

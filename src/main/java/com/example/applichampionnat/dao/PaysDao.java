package com.example.applichampionnat.dao;

import com.example.applichampionnat.pojos.Pays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaysDao extends JpaRepository<Pays,Long> {
}

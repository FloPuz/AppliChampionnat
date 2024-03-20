package com.example.applichampionnat.dao;

import com.example.applichampionnat.pojos.Journee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JourneeDao extends JpaRepository<Journee,Long> {
}

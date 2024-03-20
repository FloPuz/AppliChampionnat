package com.example.applichampionnat.services.implementation;

import com.example.applichampionnat.dao.ChampionnatDao;
import com.example.applichampionnat.dao.EquipeDao;
import com.example.applichampionnat.dao.JourneeDao;
import com.example.applichampionnat.services.ChampionnatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChampionnatServiceImpl implements ChampionnatService {

    @Autowired
    private ChampionnatDao championnatDao;

    @Autowired
    private EquipeDao equipeDao;

    @Autowired
    private JourneeDao journeeDao;
}

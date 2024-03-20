package com.example.applichampionnat.services.implementation;

import com.example.applichampionnat.dao.*;
import com.example.applichampionnat.services.JourneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class JourneeServiceImpl implements JourneeService {

    @Autowired
    private JourneeDao journeeDao;

    @Autowired
    private GameDao gameDao;

    @Autowired
    private EquipeDao equipeDao;

    @Autowired
    private StadeDao stadeDao;

    @Autowired
    private ChampionnatDao championnatDao;

}

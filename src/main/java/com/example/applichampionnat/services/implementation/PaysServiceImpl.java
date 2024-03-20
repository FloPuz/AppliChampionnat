package com.example.applichampionnat.services.implementation;

import com.example.applichampionnat.dao.*;
import com.example.applichampionnat.services.PaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class PaysServiceImpl implements PaysService {

    @Autowired
    private PaysDao paysDao;

    @Autowired
    private ChampionnatDao championnatDao;
}

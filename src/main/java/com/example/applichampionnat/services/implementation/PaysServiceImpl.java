package com.example.applichampionnat.services.implementation;

import com.example.applichampionnat.dao.*;
import com.example.applichampionnat.pojos.Championnat;
import com.example.applichampionnat.pojos.Pays;
import com.example.applichampionnat.services.PaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class PaysServiceImpl implements PaysService {

    @Autowired
    private PaysDao paysDao;

    @Autowired
    private ChampionnatDao championnatDao;

    @Override
    public Pays addPays(Pays pays) {
        return null;
    }

    @Override
    public Pays getPaysById(Long id) {
        return null;
    }

    @Override
    public List<Pays> getAllPays() {
        return null;
    }

    @Override
    public void updatePays(Pays pays) {

    }

    @Override
    public void deletePays(Long id) {

    }

    @Override
    public List<Championnat> getChampionnatsByPays(Long idPays) {
        return null;
    }
}

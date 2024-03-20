package com.example.applichampionnat.services.implementation;

import com.example.applichampionnat.dao.UserDao;
import com.example.applichampionnat.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
}

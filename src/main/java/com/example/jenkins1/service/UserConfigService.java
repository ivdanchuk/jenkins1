package com.example.jenkins1.service;

import com.example.jenkins1.model.User;

public class UserConfigService {
    public void configUser (User user){
        user.setId(UserIdGeneratorService.generateId());
    }

    public UserConfigService() {
    }
}

package com.infosys.service;

import com.infosys.repo.UserRepo;

public class UserService {

    private UserRepo userRepository;

    public UserService(UserRepo userRepository) {
        this.userRepository = userRepository;
    }

    public String getUserName(int userId) {
        return userRepository.findNameById(userId);
    }
}

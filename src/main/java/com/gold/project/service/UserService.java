package com.gold.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gold.project.entity.Admin;

import com.gold.project.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public boolean authenticateUser(String email, String password) {
        Admin admin = userRepository.findByEmailAndPassword(email, password);
        return admin != null;
    }
}
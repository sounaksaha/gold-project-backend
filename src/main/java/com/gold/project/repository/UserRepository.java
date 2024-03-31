package com.gold.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gold.project.entity.Admin;


public interface UserRepository extends JpaRepository<Admin, Long> {
    Admin findByEmailAndPassword(String email, String password);
}
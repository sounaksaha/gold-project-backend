package com.gold.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gold.project.entity.GoldQuantity_Entity;

public interface GoldQuantity_Repo extends JpaRepository<GoldQuantity_Entity, Long> {
	
}
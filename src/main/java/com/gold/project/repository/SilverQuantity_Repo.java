package com.gold.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gold.project.entity.GoldQuantity_Entity;
import com.gold.project.entity.SilverQuantity_Entity;

public interface SilverQuantity_Repo extends JpaRepository<SilverQuantity_Entity, Long> {
	
}
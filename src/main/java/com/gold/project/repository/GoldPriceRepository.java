package com.gold.project.repository;


import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gold.project.entity.GoldPrice_Entity;

public interface GoldPriceRepository extends JpaRepository<GoldPrice_Entity, Long> {
    Optional<GoldPrice_Entity> findByDate(Date date);
    List<GoldPrice_Entity> findFirstByOrderByDateDesc();
}
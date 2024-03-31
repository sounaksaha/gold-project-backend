package com.gold.project.repository;

import com.gold.project.entity.SilverPrice_Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface SilverPriceRepository extends JpaRepository<SilverPrice_Entity, Long> {
    Optional<SilverPrice_Entity> findByDate(Date date);
    List<SilverPrice_Entity> findFirstByOrderByDateDesc();
}
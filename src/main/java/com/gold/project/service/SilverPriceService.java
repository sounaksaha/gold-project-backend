package com.gold.project.service;

import java.util.List;

import com.gold.project.entity.SilverPrice_Entity;

public interface SilverPriceService {
    SilverPrice_Entity saveSilverPrice(SilverPrice_Entity silverPrice);

    List<SilverPrice_Entity> getAllSilverPrices();
    List <SilverPrice_Entity>getLastSilverPrice();
}
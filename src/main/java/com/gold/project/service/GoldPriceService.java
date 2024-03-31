package com.gold.project.service;

import java.util.List;

import com.gold.project.entity.GoldPrice_Entity;
import com.gold.project.entity.SilverPrice_Entity;

public interface GoldPriceService {
    GoldPrice_Entity saveGoldPrice(GoldPrice_Entity goldPrice);

    List<GoldPrice_Entity> getAllGoldPrices();
    List <GoldPrice_Entity>getLastGoldPrice();
}
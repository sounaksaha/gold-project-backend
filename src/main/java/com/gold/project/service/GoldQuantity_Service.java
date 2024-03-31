package com.gold.project.service;

import com.gold.project.entity.GoldQuantity_Entity;

public interface GoldQuantity_Service {
    double getTotals();
    GoldQuantity_Entity addQuantities(double gold);
    GoldQuantity_Entity editQuantities(double gold);
}

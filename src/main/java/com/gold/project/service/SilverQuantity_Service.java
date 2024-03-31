package com.gold.project.service;

import com.gold.project.entity.GoldQuantity_Entity;
import com.gold.project.entity.SilverQuantity_Entity;

public interface SilverQuantity_Service {

	double getTotals();

	SilverQuantity_Entity addQuantities(double silver);
	SilverQuantity_Entity editQuantities(double silver);
}

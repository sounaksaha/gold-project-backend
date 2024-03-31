package com.gold.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gold.project.entity.SilverQuantity_Entity;

import com.gold.project.repository.SilverQuantity_Repo;

import com.gold.project.service.SilverQuantity_Service;

@Service
public class SilverQuantity_ServiceImpl implements SilverQuantity_Service {

	@Autowired
	private final SilverQuantity_Repo silverQuantityRepo;

	public SilverQuantity_ServiceImpl(SilverQuantity_Repo silverQuantityRepo) {
		this.silverQuantityRepo = silverQuantityRepo;
	}

	@Override
	public double getTotals() {
		SilverQuantity_Entity quantity = getOrCreateQuantity();

		return quantity.getSilverQuantity();
	}

	@Override
	public SilverQuantity_Entity addQuantities(double silver) {
		SilverQuantity_Entity quantity = getOrCreateQuantity();
		quantity.setSilverQuantity(quantity.getSilverQuantity() + silver);
		return silverQuantityRepo.save(quantity);
	}

	private SilverQuantity_Entity getOrCreateQuantity() {
		return silverQuantityRepo.findAll().stream().findFirst().orElse(new SilverQuantity_Entity());
	}

	@Override
	public SilverQuantity_Entity editQuantities(double silver) {
		silverQuantityRepo.deleteAll();
		SilverQuantity_Entity quantity = new SilverQuantity_Entity();
		quantity.setSilverQuantity(silver);
		return silverQuantityRepo.save(quantity);
	}

}

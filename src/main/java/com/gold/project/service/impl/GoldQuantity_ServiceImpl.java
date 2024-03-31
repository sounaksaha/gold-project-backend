package com.gold.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gold.project.entity.GoldQuantity_Entity;
import com.gold.project.repository.GoldQuantity_Repo;
import com.gold.project.service.GoldQuantity_Service;

@Service
public class GoldQuantity_ServiceImpl implements GoldQuantity_Service {
	
   @Autowired
	private final GoldQuantity_Repo goldQuantityRepo;
	
	
	public GoldQuantity_ServiceImpl(GoldQuantity_Repo goldQuantityRepo) {
	this.goldQuantityRepo = goldQuantityRepo;
}

	@Override
	public double getTotals() {
		GoldQuantity_Entity quantity = getOrCreateQuantity();
		
		return quantity.getGoldQuantity();
	}

	@Override
	public GoldQuantity_Entity addQuantities(double gold) {
		//System.out.print(gold);
		GoldQuantity_Entity quantity = getOrCreateQuantity();
		quantity.setGoldQuantity(quantity.getGoldQuantity() + gold);
		return goldQuantityRepo.save(quantity);
	}
	 private GoldQuantity_Entity getOrCreateQuantity() {
		 return goldQuantityRepo.findAll().stream().findFirst().orElse(new GoldQuantity_Entity());
	    }
	 
	

	@Override
	public GoldQuantity_Entity editQuantities(double gold) {
		goldQuantityRepo.deleteAll();

        // Create a new entity with the updated gold quantity
        GoldQuantity_Entity quantity = new GoldQuantity_Entity();
        quantity.setGoldQuantity(gold);

        // Save the updated quantity
        return goldQuantityRepo.save(quantity);
	}

}

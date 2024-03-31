package com.gold.project.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gold.project.entity.GoldPrice_Entity;
import com.gold.project.repository.GoldPriceRepository;
import com.gold.project.service.GoldPriceService;

@Service
public class GoldPriceServiceImpl implements GoldPriceService {

	
	@Autowired
	private final GoldPriceRepository goldPriceRepository;

    
    public GoldPriceServiceImpl(GoldPriceRepository goldPriceRepository) {
        this.goldPriceRepository = goldPriceRepository;
    }

    @Override
    public GoldPrice_Entity saveGoldPrice(GoldPrice_Entity goldPrice) {
        Optional<GoldPrice_Entity> existingGoldPrice = goldPriceRepository.findByDate(goldPrice.getDate());

       if (existingGoldPrice.isPresent()) {
       	
          GoldPrice_Entity updatedGoldPrice = existingGoldPrice.get();
          updatedGoldPrice.setGoldPrice(goldPrice.getGoldPrice());
            return goldPriceRepository.save(goldPrice);
       }
       
       else {
        	
            return goldPriceRepository.save(goldPrice);
        }
    }
	
	@Override
    public List<GoldPrice_Entity> getAllGoldPrices() {
        return goldPriceRepository.findAll();
    }

	@Override
	public List<GoldPrice_Entity> getLastGoldPrice() {
		
		return goldPriceRepository.findFirstByOrderByDateDesc();
	}
}

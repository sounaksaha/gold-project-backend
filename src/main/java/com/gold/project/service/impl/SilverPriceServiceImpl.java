package com.gold.project.service.impl;

import com.gold.project.entity.SilverPrice_Entity;
import com.gold.project.repository.SilverPriceRepository;
import com.gold.project.service.SilverPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SilverPriceServiceImpl implements SilverPriceService {

	@Autowired
	private final SilverPriceRepository silverPriceRepository;

	public SilverPriceServiceImpl(SilverPriceRepository silverPriceRepository) {
		this.silverPriceRepository = silverPriceRepository;

	}

	@Override
	public SilverPrice_Entity saveSilverPrice(SilverPrice_Entity silverPrice) {
		Optional<SilverPrice_Entity> existingSilverPrice = silverPriceRepository.findByDate(silverPrice.getDate());

		if (existingSilverPrice.isPresent()) {

			SilverPrice_Entity updatedSilverPrice = existingSilverPrice.get();
			updatedSilverPrice.setSilverPrice(silverPrice.getSilverPrice());
			return silverPriceRepository.save(updatedSilverPrice);
		}

		else {
			
			return silverPriceRepository.save(silverPrice);
		}
	}

	@Override
	public List<SilverPrice_Entity> getAllSilverPrices() {
		return silverPriceRepository.findAll();
	}

	

	@Override
	public List<SilverPrice_Entity> getLastSilverPrice() {
		// TODO Auto-generated method stub
		return silverPriceRepository.findFirstByOrderByDateDesc();
	}
}
package com.gold.project.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gold.project.entity.SilverPrice_Entity;
import com.gold.project.service.SilverPriceService;

@RestController
@RequestMapping("/api/silverprices")
@CrossOrigin(origins = "http://localhost:5173")
public class SilverPriceController {

	@Autowired
	private final SilverPriceService silverPriceService;

	
	
	public SilverPriceController(SilverPriceService silverPriceService) {
		this.silverPriceService = silverPriceService;
	}

	@PostMapping
	public SilverPrice_Entity addSilverPrice(@RequestBody SilverPrice_Entity silverPrice) {
		return silverPriceService.saveSilverPrice(silverPrice);
	}

	@GetMapping
	public List<SilverPrice_Entity> getLastSilverPrices() {
		return silverPriceService.getLastSilverPrice();
	}
	@GetMapping("/allsilver")
	public List<SilverPrice_Entity> getAllSilverPrices() {
		return silverPriceService.getAllSilverPrices();
	}
}

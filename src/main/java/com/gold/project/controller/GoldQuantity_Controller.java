package com.gold.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gold.project.entity.GoldQuantity_Entity;
import com.gold.project.service.GoldQuantity_Service;

@RestController
@RequestMapping("/api/goldquantity")
@CrossOrigin(origins = "http://localhost:5173")
public class GoldQuantity_Controller {

	@Autowired
	private GoldQuantity_Service goldQuantityService;

	
	    @GetMapping
	    public double getTotals() {
	        return goldQuantityService.getTotals();
	    }

	    @PostMapping
	    public GoldQuantity_Entity addQuantities(@RequestBody double goldQuantity) {
//	    	System.out.println( goldQuantity);
	        return goldQuantityService.addQuantities(goldQuantity);
	    }
	    @PostMapping("/edit")
	    public GoldQuantity_Entity editQuantities(@RequestBody double goldQuantity) {
//	    	System.out.println( goldQuantity);
	        return goldQuantityService.editQuantities(goldQuantity);
	    }
	
}

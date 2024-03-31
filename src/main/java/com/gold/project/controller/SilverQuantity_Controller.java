package com.gold.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.gold.project.entity.GoldQuantity_Entity;
import com.gold.project.entity.SilverQuantity_Entity;
import com.gold.project.service.SilverQuantity_Service;

@RestController
@RequestMapping("/api/silverquantity")
@CrossOrigin(origins = "http://localhost:5173")
public class SilverQuantity_Controller {

	@Autowired
	private SilverQuantity_Service silverQuantityService;

	
	    @GetMapping
	    public double getTotals() {
	        return silverQuantityService.getTotals();
	    }

	    @PostMapping
	    public SilverQuantity_Entity addQuantities(@RequestBody double silverQuantity) {
	        return silverQuantityService.addQuantities(silverQuantity);
	    }
	    @PostMapping("/edit")
	    public SilverQuantity_Entity editQuantities(@RequestBody double silverQuantity) {
//	    	System.out.println( goldQuantity);
	        return silverQuantityService.editQuantities(silverQuantity);
	    }
}

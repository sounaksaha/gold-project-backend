package com.gold.project.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gold.project.entity.GoldPrice_Entity;
import com.gold.project.entity.SilverPrice_Entity;
import com.gold.project.service.GoldPriceService;

@RestController
@RequestMapping("/api/goldprices")
@CrossOrigin(origins = "http://localhost:5173")
public class GoldPriceController {
	
	@Autowired
    private final GoldPriceService goldPriceService;

    
    public GoldPriceController(GoldPriceService goldPriceService) {
        this.goldPriceService = goldPriceService;
    }

    @PostMapping
    public GoldPrice_Entity addGoldPrice(@RequestBody GoldPrice_Entity goldPrice) {
        return goldPriceService.saveGoldPrice(goldPrice);
    }

    @GetMapping("/allgold")
    public List<GoldPrice_Entity> getAllGoldPrices() {
        return goldPriceService.getAllGoldPrices();
    }
    @GetMapping
	public List<GoldPrice_Entity> getLastGoldPrices() {
		return goldPriceService.getLastGoldPrice();
	}
}
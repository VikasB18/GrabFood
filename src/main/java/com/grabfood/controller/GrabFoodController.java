package com.grabfood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grabfood.model.Restaurant;
import com.grabfood.service.GrabFoodScraperService;

@RestController
public class GrabFoodController {
	
	 private GrabFoodScraperService scraperService;
	
	    @Autowired
	    public GrabFoodController(GrabFoodScraperService scraperService) {
	        this.scraperService = scraperService;
	    }

	    @GetMapping("/scrape")
	    public List<Restaurant> scrapeRestaurantData() {
	        return scraperService.scrapeRestaurantData();
	    }

	 
}

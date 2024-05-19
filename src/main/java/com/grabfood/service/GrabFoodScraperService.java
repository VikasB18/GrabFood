package com.grabfood.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.grabfood.model.Restaurant;

import ch.qos.logback.core.boolex.Matcher;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;



@Service
public class GrabFoodScraperService {
	
	private static final ObjectMapper objectMapper = new ObjectMapper();

	public List<Restaurant> scrapeRestaurantData() {
		List<Restaurant> restaurantList = new ArrayList<>();
		String url = " https://food.grab.com/sg/en";
		try {
			// Connect to the Grab Food website
			Document document = Jsoup.connect(url).get();

			// Extract restaurant elements
			Elements restaurantElements = document.select("div.swiper-slide.slide___q2S4n");
		

			// Iterate over each restaurant element and extract data
			for (Element restaurantElement : restaurantElements) {
				Restaurant restaurant = new Restaurant();
				restaurant.setName(restaurantElement.select(".name___2epcT").text());
				// System.out.println("Extracted Restaurant Name: " + restaurant.getName());

				restaurant.setCuisine(restaurantElement.select(".basicInfoRow___UZM8d.cuisine___T2tCh").text());
				// System.out.println("Extracted Cuisine: " + restaurant.getCuisine());
				restaurant.setRating(restaurantElement.select("div.basicInfoRow___UZM8d.numbers___2xZGn")
						.select("div.numbersChild___2qKMV").text());
//				System.out.println("Extracted Rating: " + restaurant.getRating());

//	                String ratingIconUrl = restaurantElement.select("div.medium___3F_Er.ratingStar.infoItemIcon___23Zvv")
//                            .attr("style")
//                            .replaceAll(".*url\\(['\"]?(.*?)['\"]?\\).*", "$1");
//restaurant.setRating(ratingIconUrl);
//
//System.out.println("Extracted Rating Icon URL: " + ratingIconUrl)
				restaurant.setOffer(restaurantElement.select("span").text());
//				System.out.println("Extracted Offer: " + restaurant.getOffer());

				restaurant.setNotice(restaurantElement.select(".notice").text());

//	                restaurant.setImageLink(restaurantElement.select("div.restoPhoto___3nncy > img.realImage___2TyNE").attr("src"));
//	                System.out.println("Extracted Image Link: " + restaurant.getImageLink());
//	                
//	                Matcher matcher = pattern.matcher(imageLink);
//	                if (matcher.find()) {
//	                    restaurant.setRestaurantId(matcher.group(1));
//	                }
				Element imageElement = restaurantElement
						.selectFirst("div.restoPhoto___3nncy > img.realImage___2TyNE.show___3oA6B");
				if (imageElement != null) {
					String imageSrc = imageElement.attr("src");
					restaurant.setImageLink(imageSrc);
					System.out.println("Extracted Image Link: " + imageSrc);
				} else {
					System.out.println("Image element not found for restaurant: " + restaurant.getName());
				}

				restaurant.setPromoAvailable(!restaurant.getOffer().isEmpty()); // Check if there's any offer
				

				// Add the restaurant to the list
				restaurantList.add(restaurant);
			}
		} catch (IOException e) {
			// Handle exception
			e.printStackTrace();
		}
		return restaurantList;
	}
	

}

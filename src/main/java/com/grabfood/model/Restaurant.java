package com.grabfood.model;

import java.util.Objects;

public class Restaurant {
	 private String name;
	    private String cuisine;
	    private String rating;
	    private String deliveryTime;
	    private String distance;
	    private String offer;
	    private String notice;
	    private String imageLink;
	    private boolean isPromoAvailable;
	    private String restaurantId;
	    private String latitude;
	    private String longitude;
	    private String deliveryFee;

	    // Constructor, getters, setters, equals, and hashCode methods

	    public Restaurant() {
	    }

	    public Restaurant(String name, String cuisine, String rating, String deliveryTime, String distance, String offer, String notice, String imageLink, boolean isPromoAvailable, String restaurantId, String latitude, String longitude, String deliveryFee) {
	        this.name = name;
	        this.cuisine = cuisine;
	        this.rating = rating;
	        this.deliveryTime = deliveryTime;
	        this.distance = distance;
	        this.offer = offer;
	        this.notice = notice;
	        this.imageLink = imageLink;
	        this.isPromoAvailable = isPromoAvailable;
	        this.restaurantId = restaurantId;
	        this.latitude = latitude;
	        this.longitude = longitude;
	        this.deliveryFee = deliveryFee;
	    }

	    // Getters and setters

	    // Equals and hashCode methods to compare objects based on unique attributes

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Restaurant that = (Restaurant) o;
	        return restaurantId.equals(that.restaurantId);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(restaurantId);
	    }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCuisine() {
			return cuisine;
		}

		public void setCuisine(String cuisine) {
			this.cuisine = cuisine;
		}

		public String getRating() {
			return rating;
		}

		public void setRating(String rating) {
			this.rating = rating;
		}

		public String getDeliveryTime() {
			return deliveryTime;
		}

		public void setDeliveryTime(String deliveryTime) {
			this.deliveryTime = deliveryTime;
		}

		public String getDistance() {
			return distance;
		}

		public void setDistance(String distance) {
			this.distance = distance;
		}

		public String getOffer() {
			return offer;
		}

		public void setOffer(String offer) {
			this.offer = offer;
		}

		public String getNotice() {
			return notice;
		}

		public void setNotice(String notice) {
			this.notice = notice;
		}

		public String getImageLink() {
			return imageLink;
		}

		public void setImageLink(String imageLink) {
			this.imageLink = imageLink;
		}

		public boolean isPromoAvailable() {
			return isPromoAvailable;
		}

		public void setPromoAvailable(boolean isPromoAvailable) {
			this.isPromoAvailable = isPromoAvailable;
		}

		public String getRestaurantId() {
			return restaurantId;
		}

		public void setRestaurantId(String restaurantId) {
			this.restaurantId = restaurantId;
		}

		public String getLatitude() {
			return latitude;
		}

		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}

		public String getLongitude() {
			return longitude;
		}

		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}

		public String getDeliveryFee() {
			return deliveryFee;
		}

		public void setDeliveryFee(String deliveryFee) {
			this.deliveryFee = deliveryFee;
		}

}

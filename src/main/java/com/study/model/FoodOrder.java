package com.study.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FoodOrder {
	
	FoodOrder(){
	}
	
	FoodOrder(String d, String o) {
		this.dishName = d;
		this.orderedBy = o;
	}
	
	private String dishName;
	private String orderedBy;

	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public String getOrderedBy() {
		return orderedBy;
	}
	public void setOrderedBy(String orderedBy) {
		this.orderedBy = orderedBy;
	}

}

package com.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.study.model.FoodOrder;
import com.study.service.FoodCustom;

@RestController
public class FoodController {
	
	@Autowired
	FoodCustom fc;
	
	@RequestMapping(value="/foodForThought", method=RequestMethod.POST)
	public @ResponseBody String createFoodOrder(@RequestBody FoodOrder foodOrder) {
		fc.foodOrder().send(MessageBuilder.withPayload(foodOrder).build());
		return "food is ordered";
	}

}

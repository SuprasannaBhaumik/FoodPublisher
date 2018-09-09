package com.study.service;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface FoodCustom {
	
	@Output("foodOrdersChannel")
	MessageChannel foodOrder();

}

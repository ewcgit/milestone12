package com.freshapples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.freshapples.services.OrdersBusinessService;
import com.freshapples.services.OrdersBusinessServiceInterface;

@Configuration
public class SpringConfig{
	// There are multiple OrderBusinessServices so this will help set the primary.
	@Bean(name="ordersBusinessService")
	public OrdersBusinessServiceInterface getOrdersBusiness(){
	return new OrdersBusinessService();
	}
}
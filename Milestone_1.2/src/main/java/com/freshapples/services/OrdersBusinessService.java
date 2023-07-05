package com.freshapples.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.freshapples.model.OrderModel;

public class OrdersBusinessService implements OrdersBusinessServiceInterface {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		// Placeholder, unnecessary.
		System.out.println("OrderBusinessService is working now!");
		
	}

	@Override
	public List<OrderModel> getOrders() { // Hardcoded list.
		List<OrderModel> orders = new ArrayList<OrderModel>();
		orders.add(new OrderModel(0L, "000", "Superman", "Superhero", 1500.0f));
		orders.add(new OrderModel(1L, "001", "Batman", "Superhero", 1500.0f));
		orders.add(new OrderModel(2L, "002", "Flash", "Superhero", 1500.0f));
		orders.add(new OrderModel(3L, "003", "Terminator", "Action", 1500.0f));
		orders.add(new OrderModel(4L, "004", "Alien", "Horror", 1500.0f));
		orders.add(new OrderModel(5L, "005", "Aliens", "Action", 1500.0f));
		orders.add(new OrderModel(6L, "006", "Morbius", "Superhero", 1500.0f));
		orders.add(new OrderModel(7L, "007", "Predator", "Action", 1500.0f));
		orders.add(new OrderModel(8L, "008", "Godfather", "Crime", 1500.0f));
		orders.add(new OrderModel(9L, "009", "Scarface", "Crime", 1500.0f));
		orders.add(new OrderModel(1L, "010", "Incredibles", "Animation", 2.0f));
		
		return orders; // Success.
	}

}
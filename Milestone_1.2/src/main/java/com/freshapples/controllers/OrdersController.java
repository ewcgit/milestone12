package com.freshapples.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;
import com.freshapples.model.*;
import com.freshapples.controllers.*;
import com.freshapples.services.*;

@Controller
public class OrdersController {
	
	@Autowired // Redundant, left in case it is later needed.
	public OrdersController(OrdersBusinessServiceInterface service) {
		// Constructor paired with SpringConfig.java.
		super();
		this.service = service;
	}
	
	OrdersBusinessServiceInterface service;
	@GetMapping("/orders")
	public String showAllOrders(Model model){ // For display of orders.
		
		List<OrderModel> orders = service.getOrders();
	
		model.addAttribute("title", "Movies sold");
		model.addAttribute("orders", orders);
		
		return "orders.html";
	}
}
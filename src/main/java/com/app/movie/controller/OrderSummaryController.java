package com.app.movie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/movieapp")
public class OrderSummaryController {

	@GetMapping("/order-summary")
	public String viewOrderSummary() {
		return "orderSummary";
	}
	
}

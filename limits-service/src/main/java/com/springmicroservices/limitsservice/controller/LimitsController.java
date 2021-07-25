package com.springmicroservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmicroservices.limitsservice.bean.Limits;
import com.springmicroservices.limitsservice.configuration.LimitConfiguration;

@RestController
public class LimitsController {
	
	@Autowired
	private LimitConfiguration limitConfig;

	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(limitConfig.getMinimum(), limitConfig.getMaximum());
	}
}

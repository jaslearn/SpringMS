package com.jasdhir.sp.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jasdhir.sp.ms.bean.Limits;
import com.jasdhir.sp.ms.configuration.Configuration;

@RestController
public class LimitsController {
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(configuration.getMinimum(), 	configuration.getMaximum());
		//return new Limits(1,1000);
	}
}

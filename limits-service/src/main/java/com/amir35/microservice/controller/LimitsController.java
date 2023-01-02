package com.amir35.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amir35.microservice.bean.Limits;
import com.amir35.microservice.configuration.Configuration;

@RestController
@RefreshScope
public class LimitsController {
	
	@Autowired
	private Configuration configuration;

	@GetMapping("/limits/hardcode")
	public Limits retrieveLimitsFromConfigurationsHardCode() {
		return new Limits(1000, 1);
	}


	@GetMapping("/limits")
	public Limits retrieveLimitsFromConfigurations() {

		//getting values from the properties file
		return new Limits(configuration.getMaximum(), configuration.getMinimum());
	}


	@GetMapping("/limits/configserver")
	public Limits retrieveLimitsFromConfigServer() {
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
	}

}

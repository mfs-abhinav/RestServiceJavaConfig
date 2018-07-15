package com.abhi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.service.FacilityService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "facility", description = "Rest API for facility operations", tags = "User API")
public class FacilityController {

	@Autowired
	FacilityService facilityService;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ApiOperation(value = "Display greeting message", response = String.class)
	public String welcome() {
		return "Welcome to RestTemplate Example.";
	}

	@RequestMapping(value = "/getConfig/{facilityId}/{configName}", method = RequestMethod.GET)
	@ApiOperation(value = "Display facility config value", response = String.class)
	public String getFacilityConfig(@PathVariable("facilityId") Long facilityId,
			@PathVariable("configName") String configName) {
		return facilityService.getFacilityConfig(facilityId, configName);

	}
	
}

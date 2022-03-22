package com.ibm.convertcurrency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.convertcurrency.clients.ConvertionFactorClient;

@RestController
@RequestMapping("/ConvertCurrency")
public class ConvertCurrencyController {
	
	@Autowired
	ConvertionFactorClient client;

	@GetMapping("/convert")
	public Double convertCurreny(String countryCode, Double amount) {
		Double convertedAmount = amount * (client.getConversionFactorUsingGET(countryCode));
		return convertedAmount;
	}

}

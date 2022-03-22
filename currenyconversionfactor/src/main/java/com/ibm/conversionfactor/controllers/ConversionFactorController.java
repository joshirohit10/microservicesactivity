package com.ibm.conversionfactor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.conversionfactor.entities.Currency;
import com.ibm.conversionfactor.repositories.ConversionFactorRepository;

@RestController
@RequestMapping("/ConversionFactor")
public class ConversionFactorController {
	
	@Autowired
	ConversionFactorRepository factorRepository;
	
	@PostMapping("/add")
	public ResponseEntity<Currency> addConversionFactor(@RequestBody Currency currency) {
		return new ResponseEntity<Currency>(factorRepository.save(currency), HttpStatus.CREATED);
	}
	
	@PostMapping("/update")
	public ResponseEntity<Currency> updateConversionFactor(@RequestBody Currency currency) {
		return new ResponseEntity<Currency>(factorRepository.save(currency), HttpStatus.CREATED);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<Currency>> getAll(){
		return ResponseEntity.ok(factorRepository.findAll());		
	}
	
	@GetMapping("/getConversionFactor")
	public Double getConversionFactor(@RequestParam("countryCode") String countryCode){
		Currency currency = factorRepository.getByCountryCode(countryCode);
		return currency.getConvertionFactor();
	}

}

package com.ibm.convertcurrency.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="CURRENCYCONVERTIONFACTOR", url="http://localhost:8080")
public interface ConvertionFactorClient {
	
	@RequestMapping(value = "/ConversionFactor/getConversionFactor",
			produces = {"*/*"},
			method = RequestMethod.GET)
	Double getConversionFactorUsingGET(@RequestParam("countryCode") String countryCode);

}

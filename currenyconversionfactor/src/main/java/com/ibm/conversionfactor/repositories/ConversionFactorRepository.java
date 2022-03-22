package com.ibm.conversionfactor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.conversionfactor.entities.Currency;

@Repository
public interface ConversionFactorRepository extends JpaRepository<Currency, Integer> {
	
	Currency getByCountryCode(String countryCode);

}

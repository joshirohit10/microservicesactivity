package com.ibm.conversionfactor.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Currency {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String countryCode;
	private Double convertionFactor;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Double getConvertionFactor() {
		return convertionFactor;
	}

	public void setConvertionFactor(Double convertionFactor) {
		this.convertionFactor = convertionFactor;
	}


}

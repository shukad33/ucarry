package com.amoebiq.ucarry.service;

import java.util.List;

import com.amoebiq.ucarry.model.Country;

public interface CountryService {
	
	public void addCountry(Country country);
	public List<Country> listCountries();
		
}

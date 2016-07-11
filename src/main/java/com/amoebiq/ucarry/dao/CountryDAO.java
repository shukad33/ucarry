package com.amoebiq.ucarry.dao;

import java.util.List;

import com.amoebiq.ucarry.model.Country;

public interface CountryDAO {
	
	public void addCountry(Country country);
	public List<Country> listCountries();
	
	
	
}

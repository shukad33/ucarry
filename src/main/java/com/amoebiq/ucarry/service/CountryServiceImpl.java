package com.amoebiq.ucarry.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amoebiq.ucarry.dao.CountryDAO;
import com.amoebiq.ucarry.model.Country;

@Service
public class CountryServiceImpl implements CountryService{
	
	private CountryDAO countryDAO ;
	
	public void setCountryDAO(CountryDAO cDAO) {
		this.countryDAO = cDAO;
	}
	
	@Override
	@Transactional
	public void addCountry(Country country) {
		// TODO Auto-generated method stub
		this.countryDAO.addCountry(country);
		
		
	}

	@Override
	@Transactional
	public List<Country> listCountries() {
		// TODO Auto-generated method stub
		return this.countryDAO.listCountries();
	}
	
	
	
}

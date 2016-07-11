package com.amoebiq.ucarry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amoebiq.ucarry.model.Country;
import com.amoebiq.ucarry.service.CountryService;

@RestController
public class CountryController {
	
	private CountryService countryService;
		
	@Autowired
	@Qualifier(value="countryService")
	public void setCountryService(CountryService cs){
		this.countryService = cs;
	}
	
	@RequestMapping(value="/country/add",method=RequestMethod.POST)
	public String addCountry(@RequestBody Country country) {
		this.countryService.addCountry(country);
		return "success";
	}
	
	@RequestMapping(value="/countries",method=RequestMethod.GET,headers="Accept=application/json")
	public List<Country> allCountries() {
		return this.countryService.listCountries();
	}
	
}

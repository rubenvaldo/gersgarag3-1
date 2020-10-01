package ie.cct.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ie.cct.springboot.models.Country;
import ie.cct.springboot.repositories.CountryRepository;

import java.util.List;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	// Return list of countries
	public List<Country> getCountries(){
		return countryRepository.findAll(); 
		
	}

}

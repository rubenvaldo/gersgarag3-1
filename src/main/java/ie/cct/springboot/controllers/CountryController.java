package ie.cct.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ie.cct.springboot.models.Country;
import ie.cct.springboot.services.CountryService;

@Controller
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	
	@GetMapping("/countries")
	public String getCountries(Model model) { // to pass sth across the html, you need a Model (Model as parameter of the function that returns a hmtl page) 
		
		List<Country> countryList = countryService.getCountries();
		
		model.addAttribute("countries", countryList);
		
		return "country";
	}
	
	

}

package ie.cct.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CountryController {
	
	
	@GetMapping("/country")
	public String getCountries() {
		return "country";
	}
	
	

}

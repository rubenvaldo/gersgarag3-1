package ie.cct.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ApplicationController {
	
	
	@GetMapping("/index")
	public String goHome() {
		return "index";
	}
	
	
	/*
	@GetMapping("/countries")
	public String getCountries() {
		return "country";
	}
	
	/*
	
	@GetMapping("/client")
	public String getClient() {
		return "client";
	}
	
	*/
	


}


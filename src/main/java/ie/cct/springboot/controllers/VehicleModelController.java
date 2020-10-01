package ie.cct.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleModelController {
	
	@GetMapping("/vehiclemodels")
	public String getVehicleModel() {
		return "vehiclemodel";
	}

}

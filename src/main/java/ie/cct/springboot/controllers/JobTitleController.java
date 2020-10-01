package ie.cct.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobTitleController {
	
	@GetMapping("/jobtitles")
	public String getJobTitle() {
		return "jobtitle";
	}

}

package com.tcs.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@RequestMapping
public class WelcomeController {
	
	@GetMapping
	public String invite(Model map) {
		//map.addAttribute("location","Chennai1");
		return "registrationform";
	}
	

}
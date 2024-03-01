package com.tcs.boot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/reg")
public class FormRegistrationController {
	
	@PostMapping
	public String processForm(@RequestParam String lname,@RequestParam String mobile,@RequestParam String email, Model model) {
		model.addAttribute("Name=",lname);
		model.addAttribute("Mobile=",mobile);
		model.addAttribute("Email=",email);
	
		return "home";
	}

}

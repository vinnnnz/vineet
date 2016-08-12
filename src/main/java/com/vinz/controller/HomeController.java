package com.vinz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String goHome() {
		return "index";
	}

	@RequestMapping("/aboutme")
	public String aboutMe() {
		return "aboutme";
	}
	
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
}

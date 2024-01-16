package com.SpEEdysm1des.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	//return a string from url
	@GetMapping("/")
	public String printHello() {
		return "home";
	}
}

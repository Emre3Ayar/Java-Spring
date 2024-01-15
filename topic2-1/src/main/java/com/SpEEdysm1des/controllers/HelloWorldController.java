package com.SpEEdysm1des.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	//return a string from url
	@ResponseBody
	@GetMapping("/test1")
	public String printHello() {
		return "Hello world";
	}
	@GetMapping("/test2")
	public String showHelloPage(Model model) {
		model.addAttribute("message", "Have a great day");
		return "helloPage";
	}
}

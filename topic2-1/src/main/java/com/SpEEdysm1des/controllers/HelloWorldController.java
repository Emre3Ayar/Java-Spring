package com.SpEEdysm1des.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.SpEEdysm1des.models.Person;

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
	@GetMapping("/test3")
	public ModelAndView printHelloAgain() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Have a super day");
		mv.addObject("rating", 55);
		mv.setViewName("hellopage");
		return mv;
	}
	@GetMapping("/test4")
	public String showHelloPage4(@RequestParam("message") String message, Model model) {
		//model.addAttribute("message", "Have a great day");
		model.addAttribute("message", message);
		return "helloPage";
	}
	@GetMapping("/people")
	public String showFriends(Model model) {
		List<Person> friends = new ArrayList<Person>();
		
		friends.add(new Person(0, "Emre", 22, 142.2f));
		friends.add(new Person(1, "Bob", 42, 52.5f));
		friends.add(new Person(2, "James", 27, 134.2f));
		friends.add(new Person(3, "Denise", 27, 172.5f));
		
		System.out.println(friends);
		model.addAttribute("people", friends);
		return "printFriends";
	}
	@GetMapping("/peopleJSON")
	@ResponseBody
	public List<Person> showFriendsJSON(Model model) {
		List<Person> friends = new ArrayList<Person>();
		
		friends.add(new Person(0, "Emre", 22, 142.2f));
		friends.add(new Person(1, "Bob", 42, 52.5f));
		friends.add(new Person(2, "James", 27, 134.2f));
		friends.add(new Person(3, "Denise", 27, 172.5f));
		
		//System.out.println(friends);
		//model.addAttribute("people", friends);
		return friends;
	}
}

package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.domain.Greeting;
import com.domain.User;

@Controller 
public class GreetingController { 
	@GetMapping("/greeting") 
	public String greetingForm(Model model) { 
		model.addAttribute("user", new User()); 
		return "greeting"; 
		} 
	@PostMapping("/greeting") 
	public String greetingSubmit(@ModelAttribute User greeting) { 
		System.out.println(greeting.getName());
		return "result"; 
		} 
	} 




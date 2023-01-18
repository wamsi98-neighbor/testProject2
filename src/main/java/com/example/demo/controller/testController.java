package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {   

	@RequestMapping("/test")
	public String test1(Model model) {
		
		model.addAttribute("testMsg", "Thymeleaf Test . ");
		
		return "test";
	}  
	
} 


package com.codingdojo.greet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class GreetingController {
	@RequestMapping("")
	public String hello(@RequestParam(value="name", defaultValue="Welcome") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
}

	



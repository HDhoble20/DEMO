package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class DemoController {
	
	@GetMapping("/hello")
	public String sayHello(Model theModel)
	{
		theModel.addAttribute("theDate", new java.util.Date());
		return "helloWorld";
	}

}

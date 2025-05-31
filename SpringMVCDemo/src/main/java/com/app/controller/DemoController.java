package com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DemoController {
	
	//@RequestMapping(path = "/",method = RequestMethod.GET)
	@RequestMapping("/")
	public String helloWorld()
	{
		return "index"; // /WEB-INF/views/index.jsp
	}
	
	
	

}

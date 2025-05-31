package com.app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	@GetMapping("/")
	public String getCalled()
	{
		return "Get Method Called";
	}
	
	@PostMapping("/")
	public String Called()
	{
		return "Post Method Called";
	}

}

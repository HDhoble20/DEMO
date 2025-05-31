package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/api")
public class HomeController {
	
	@RequestMapping("/login")
	public String helloWorld()
	{
		return "login"; // /WEB-INF/views/index.jsp
	}
	
	/*
	 * @RequestMapping("/welcome") 
	 * public String welcomePage(HttpServletRequest request,Model model) 
	 * { String user = request.getParameter("txtUsername");
	 * String pwd = request.getParameter("txtPassword"); 
	 * user = user.toUpperCase();
	 * model.addAttribute("uname", user);
	 *  return "student-confirmation"; }
	 */
	
	@RequestMapping("/welcome")
	public String welcomePage(@RequestParam("txtUsername") String user,Model model)
	{
		user = user.toUpperCase();
		model.addAttribute("uname", user);
		return "student-confirmation";
	}

}

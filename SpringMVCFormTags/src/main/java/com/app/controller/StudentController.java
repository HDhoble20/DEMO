package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model)
	{
		Student s = new Student();
		model.addAttribute("theStudent", s);
		return "student-form";
	}
	
	@RequestMapping("/studentConfirm")
	public String studentConfirm(@ModelAttribute("theStudent") Student stud)
	{
		System.out.println(stud);
		return "student-confirmation";
	}

}

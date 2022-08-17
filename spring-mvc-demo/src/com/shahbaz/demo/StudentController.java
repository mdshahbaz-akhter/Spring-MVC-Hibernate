package com.shahbaz.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model themodel) {
		
		Student theStudent= new Student();
		
		themodel.addAttribute("student",theStudent);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent){
		
		System.out.println("Student Name: "+theStudent.getFirstName()+
				" "+theStudent.getLastName());
		return "student-confirmation";
	}
		
}

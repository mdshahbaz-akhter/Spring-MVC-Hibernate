package com.shahbaz.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
	}
	
	//method to read form data and add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request,Model model)
	{
	//read request parameter from html form
	String theName=request.getParameter("studentName");
	theName=theName.toUpperCase();
	String result="This is "+theName;
	//add message to moodel
	model.addAttribute("message",result);
	return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName,Model model)
	{

	theName=theName.toUpperCase();
	String result="This is "+theName+" enjoy reading spring";
	//add message to moodel
	model.addAttribute("message",result);
	return "helloworld";
	}
	
}

package com.javabycode.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FirstController {

	@RequestMapping(path="/introduces",method = RequestMethod.GET)
	public String dispalyMsg(ModelMap model) {
		model.addAttribute("message", "Hello World, This is the Spring 4 MVC framework");
		return "display";
	}


	@RequestMapping(path="/introduce", method = RequestMethod.GET)
	public String dispalyInstroduction(ModelMap model) {
		model.addAttribute("message", "The Spring 4 MVC frameworks is great to build web application");
		return "display";
	}

}

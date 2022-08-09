package com.melissacurylo.omikuji.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	@RequestMapping("/")
	public String form() {
		return "form.jsp";
	}
	
	
	@RequestMapping("/formSubmit")
	public String formNew(
			@RequestParam(value="pickNumber") Integer pickNumber,
			@RequestParam(value="city") String city, 
			@RequestParam(value="name") String name,
			@RequestParam(value="profession") String profession,
			@RequestParam(value="livingThing") String livingThing,
			@RequestParam(value="beNice") String beNice,
			HttpSession session) {
		session.setAttribute("pickNumber", pickNumber);
		session.setAttribute("city", city);
		session.setAttribute("name", name);
		session.setAttribute("profession", profession);
		session.setAttribute("livingThing", livingThing);
		session.setAttribute("beNice", beNice);
		
		return "redirect:/displayResult";
	}
	
	// make sure method="POST" in jps as method="GET" will display session in url bar
	
	
	@GetMapping("/displayResult")
	public String display() {	
		return "showResult.jsp";
	}

}

package com.melissacurylo.formsubmission.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	
	@RequestMapping("/login")
	public String login( @RequestParam(value="email") String email, 
						 @RequestParam(value="password") String password,
						 HttpSession session) {
		session.setAttribute("email", email);
		return "redirect:/home";
	}
	
	// make sure method="POST" in jps as method="GET" will display session in url bar
	
	@RequestMapping("/home")
	public String home() {
		return "welcome.jsp";
	}

	

}

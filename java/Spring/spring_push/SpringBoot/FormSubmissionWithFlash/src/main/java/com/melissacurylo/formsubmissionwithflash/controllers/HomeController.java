package com.melissacurylo.formsubmissionwithflash.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() { 
		return "index.jsp";
	}
		
		
	@RequestMapping("/login")
	public String login( @RequestParam(value="email") String email, 
						 @RequestParam(value="password") String password,
						 HttpSession session, RedirectAttributes redirectAttributes) {
		if( password.length() < 5 ) {
			redirectAttributes.addFlashAttribute("error", "The password must be 5 or more characters!");
			return "redirect:/";
		}
		session.setAttribute("email", email);
		return "redirect:/home";
	}
	
	
	// make sure method="POST" in jps as method="GET" will display session in url bar
	
	@RequestMapping("/home")
	public String home() {
		return "welcome.jsp";
	}

	
	@RequestMapping("/createError")
		public String flashMessage(RedirectAttributes redirectAttributes) {
			redirectAttributes.addFlashAttribute("error", "This is a test error!");
			return "redirect:/";
		}
	

	}
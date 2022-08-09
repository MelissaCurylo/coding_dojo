package com.melissacurylo.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	
	@GetMapping("/")
	public String counterHome(HttpSession session, Model model) {
		
		if(session.getAttribute("count")== null) { // Check if count is in session
			session.setAttribute("count", 0);  // if not in session, set at zero
		} 
		
		// Need to cast Integer onto session as the session attribute is not specified and is an object
		// Assign data type wanted to be received from session; session will deliver an unspecified object
		Integer newCount = (Integer) session.getAttribute("count"); 
		newCount++; // Increment the count in session
		session.setAttribute("count", newCount); // Set session with the updated count in newCount
		return("index.jsp");
	}
	
	
	
	@GetMapping("/counted")
	public String counterUpdated(HttpSession session, Model model) {
		Integer newCount = 0;
		
		if(session.getAttribute("count")== null) { 
			session.setAttribute("count", 0);  
		} else {
			newCount = (Integer) session.getAttribute("count");
		} 
		model.addAttribute("count", newCount);
			session.setAttribute("count", newCount); // Set session with the updated count in newCount

		return("counter.jsp");
	}
	
	
	@GetMapping("/counted2")
	public String counted2(HttpSession session, Model model) {
		
		if(session.getAttribute("count")== null) { 
			session.setAttribute("count", 0);  
		} else {
			Integer newCount = (Integer) session.getAttribute("count");
			newCount +=2;
			session.setAttribute("count", newCount);
		} 
		return("countBy2.jsp");
	}
	
	
	
	@GetMapping("/reset")
	public String counterReset(HttpSession session) {
		session.setAttribute("count", 0);
		return"redirect:/counted";
	}
	
	
	
//	@GetMapping("/count2")
//	public String count2(HttpSession session) {
//		
//		if (session.isNew()) {
//			session.setAttribute("count2", 0);
//		} else {
//			Integer newCount2 = (Integer) session.getAttribute("count2");
//			newCount2 += 2;
//			session.setAttribute("count2", newCount2);
//		}
//		return("countBy2.jsp");
//	}
	
}

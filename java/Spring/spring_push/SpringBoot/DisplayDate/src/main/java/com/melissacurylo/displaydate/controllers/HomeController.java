package com.melissacurylo.displaydate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(Model model) {
		return ("index.jsp");
	}
	
	@RequestMapping("/date1")
	public String date1(Model model, String date) {
		// addAttribute adds values in Model to be globally identified
		model.addAttribute("date1", new java.util.Date());	
		return ("date1.jsp");
	}
	
	@RequestMapping("/date2")
	public String date2(Model model) {
		Date date2 = new Date();
		
		SimpleDateFormat date2Format = new SimpleDateFormat("EEE MMM d zzz YYYY");
		String date2Formatted = date2Format.format(date2);
		model.addAttribute("date2", date2Formatted);		
		return ("date2.jsp");
	}
	
	@RequestMapping("time1")
	public String time1(Model model) {
		SimpleDateFormat newTime1 = new SimpleDateFormat("h:mm a");
		
		Date date = new Date();
		String time1 = newTime1.format(date);
		model.addAttribute("time1", time1 );
		return ("time1.jsp");
	}
	
	@RequestMapping("time2")
	public String time2(Model model, String Time) {
		DateTimeFormatter newTime2 = DateTimeFormatter.ofPattern("HH:mm a");
		model.addAttribute("time2", java.time.LocalTime.now().format(newTime2));	
		return ("time2.jsp");
	}
	
	
	
	

}

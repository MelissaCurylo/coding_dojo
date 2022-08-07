package com.melissacurylo.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // decorator
public class HomeController {
	
	@RequestMapping("/")
	public String first(
			@RequestParam(value="firstName", required=false) String firstName) {
		if (firstName == null) {
			return "Hello Human";
		}else {
			return "Hello " + firstName;
		}
	}
	
	@RequestMapping("/second")
	public String second(
			@RequestParam(value="firstName", required=false) String firstName, 
			@RequestParam(value="lastName", required=false) String lastName) {
		if (firstName == null) {
			return "Hello Human";
		}if (lastName == null ) {
			return "Hello Human";
		}else {
			return "Hello " + firstName + " " + lastName;
		}
	}
	
	@RequestMapping("/third")
	public String third(
			@RequestParam(value="firstName", required=false) String firstName, 
			@RequestParam(value="lastName", required=false) String lastName,
			@RequestParam(value="times", required=false) Integer times){  
		if (times != null && times > 0) {
			String giveMeSomething = "";
			for( int i =0; i < times; i++ ) {
				if( firstName != null && lastName != null) {
					giveMeSomething += "Hello " + firstName + " " + lastName + " ";
				}else if ( firstName != null ) {
					giveMeSomething += "Hello " + firstName + " ";
				}else if ( lastName != null ) {
					giveMeSomething += "Hello " + lastName + " ";
				}else {
					giveMeSomething += "Hello Human "; }
			} 
			return giveMeSomething;	
		}
		if (firstName != null && lastName != null) {
			return "Hello " + firstName + " " + lastName;
		}else if ( firstName != null ) {
			return "Hello " + firstName;
		}else if ( lastName != null ) {
			return "Hello " + lastName; 
		}
		return "Hello Human";
	}			
}

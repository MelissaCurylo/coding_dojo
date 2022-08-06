package com.melissacurylo.daikichipathvar.controllers;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiController {
	
	@RequestMapping("/daikichi")
	public String daikichi() {
		return "Welcome";
	}
	
	@RequestMapping("/daikichi/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/daikichi/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
		
	
	@RequestMapping("/daikichi/travel/{city}")
    public String travelTest(@PathVariable("city") String city){
    	return "You will soon travel too"+ " "  + city;
    }
	
	@RequestMapping("/daikichi/lotto/{guess}")
    public String lottoTest(@PathVariable("guess") String guess){
		int newNum = Integer.parseInt(guess);
		
		if ( newNum % 2 == 1 ){
			return("You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.");			
		}
		return("You will take a grand journey in the near future, but be weary of tempting offers");
    }


}

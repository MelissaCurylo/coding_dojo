package com.melissacurylo.ninjagoldgame.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {	
	private int goldInAccount;


	@GetMapping("/")
	public String index(HttpSession session) {
	return "goldDash.jsp";
	}
	
	
	@PostMapping("/findGold")
	public String findGold(HttpSession session, Model model, 
				@RequestParam(value="locations", required=true) String locations) {
	
	String timeUpdate = new SimpleDateFormat("MMMM dd yyyy HH:mm a").format(new Date());
	//	System.out.println(timeUpdate); //  test
	
//	Integer goldInAccount = 0;
//	//	System.out.println(goldInAccount);  //  test
	
	ArrayList<String> activity = new ArrayList<>();
	
	if (goldInAccount < -50) {
		return "redirect:/jail";
		
	}else if(session.getAttribute("goldInAccount") == null) {
		session.setAttribute("goldInAccount", 0);
		session.setAttribute("activity", activity);
		
	} else {
		goldInAccount = (Integer) session.getAttribute("goldInAccount");  
		activity = (ArrayList<String>) session.getAttribute("activity");
		session.setAttribute("activity", activity);
	}
	
	
	if(locations.equals("farm")) {
		Integer gold = ThreadLocalRandom.current().nextInt(9, 19 + 1);
		gold += goldInAccount;
		session.setAttribute("goldInAccount", gold += goldInAccount);
		
		activity.add(0, "Nice work on the farm! " + gold + " in gold added to your account. (" + timeUpdate + ")" ); 
		return "redirect:/";
	}
			
	if(locations.equals("cave")) {
		Integer gold = ThreadLocalRandom.current().nextInt(4, 9 + 1);
		gold += goldInAccount;
		session.setAttribute("goldInAccount", gold += goldInAccount);
		
		activity.add(0, "Nice work, you found cave treasure! " + gold + " in gold added to your account. (" + timeUpdate + ")" ); 
		return "redirect:/";
	}
	
	
	if(locations.equals("house")) {
		Integer gold = ThreadLocalRandom.current().nextInt(1, 5 + 1);
		gold += goldInAccount;
		session.setAttribute("goldInAccount", gold += goldInAccount);
		
		activity.add(0, "Nice work on the house! " + gold + " in gold added to your account. (" + timeUpdate + ")" ); 
		return "redirect:/";
	}
	
	if(locations.equals("quest")) {
		Integer gold = ThreadLocalRandom.current().nextInt(-50, 49 + 1);
		gold += goldInAccount;
		session.setAttribute("goldInAccount", gold += goldInAccount);
		
		if( gold <= 0) {
			activity.add(0, "Uh Oh! Quest failed... " + (gold) + " in gold has been deducted. (" + timeUpdate + ")" ); 
		}else {
			activity.add(0, "Quest Success! " + gold + " in gold added to your account. (" + timeUpdate + ")" ); 
		}
		return "redirect:/";
	}
	
	if(locations.equals("spa")) {
		Integer gold = ThreadLocalRandom.current().nextInt(-19, -4 + 1);
		goldInAccount = (Integer) session.getAttribute("goldInAccount");
		session.setAttribute("goldInAccount", gold += goldInAccount);
		activity.add(0, "How relaxing! " + gold + " in gold has been deducted, your balance is now: " + goldInAccount + " (" + timeUpdate + ")" ); 
		return "redirect:/";
	}
	
	
	return "redirect:/";
	}
	
	
	
	@RequestMapping(value="/reset")
	public String reset(HttpSession session) {
		session.setAttribute("goldInAccount", 0);
		session.setAttribute("activity", new ArrayList<String>());
		return "redirect:/";
	}
	
	@GetMapping("/activity")
	public String activity() {
		return "activity.jsp";
	}
	
	
	@GetMapping("/jail")
	public String jail() {
	return "jail.jsp";
	}
}







//if(activity.equals("farm")) {
//// Usages of this class should typically be of the 
//// form: ThreadLocalRandom.current().nextX(...) (where X is Int, Long, etc).
//	Integer gold = ThreadLocalRandom.current().nextInt(9, 19 + 1);
//	gold += goldInAccount;
//
//	session.setAttribute("goldInAccount", goldInAccount);
//	activity.add(0, "You helped build a farm and have earned " + gold + " in gold. (" + timeUpdate + ")" );  
//	return "redirect:/findGold";
//} 

//else if (activity.equals("cave")) {
//	Integer gold = ThreadLocalRandom.current().nextInt(4, 9 + 1);
//	gold += goldInAccount;
//
//	session.setAttribute("goldInAccount", goldInAccount);
//	activity.add(0, ""Nice work, you found cave treasure and earned " + gold + " in gold. (" + timeUpdate + ")" );  
//	return "redirect:/findGold";

//} 

//else if (activity.equals("house")) {
//	Integer gold = ThreadLocalRandom.current().nextInt(1, 4 + 1);
//	gold += goldInAccount;
//
//	session.setAttribute("goldInAccount", goldInAccount);
//	activity.add(0, "You helped build a house and have earned " + gold + " in gold. (" + timeUpdate + ")" );  
//	return "redirect:/findGold";


//else if(activity.equals ("quest")) {
//	Integer gold = ThreadLocalRandom.current().nextInt(-1, 49 + 1);
//	gold += goldInAccount;
//	session.setAttribute("goldInAccount", goldInAccount);
//		if( gold <= 0) {
//			activity.add(0, "Uh Oh! Quest failed and you lose " + (gold * -1) + " in gold. (" + timeUpdate + ")" ); 
//		}else {
//			activity.add(0, "Quest Success, you earned " + gold + " in gold. (" + timeUpdate + ")" ); 
//		}
//		return "redirect:/findGold";
//}


//else if(activity.equals ("spa")) {
//	Integer gold = ThreadLocalRandom.current().nextInt(4, 19 + 1);
//	gold -= goldInAccount;
//	session.setAttribute("goldInAccount", goldInAccount);
//	activity.add(0, "How relaxing, it cost you" + gold + " in gold. (" + timeUpdate + ")" ); 
//	return "redirect:/findGold";
//}


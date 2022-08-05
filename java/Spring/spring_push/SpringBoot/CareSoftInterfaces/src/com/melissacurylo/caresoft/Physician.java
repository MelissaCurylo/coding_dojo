package com.melissacurylo.caresoft;
import java.util.ArrayList;
import java.util.Date;


public class Physician extends User implements HIPAACompliantUser {
//... imports class definition...
    
    // Inside class:    
    private ArrayList<String> patientNotes;


	public Physician(Integer id) {   // calling id from User class (parent) importing to children Admin/Physician
		super(id);
	}


	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }


	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}


	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}


	@Override
	public boolean assignPin(int pin) {
		String convertPin = Integer.toString(pin);
		if(convertPin.length() == 4) {
			return true;
		}else {
		return false;
		}
	}


	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if(this.id == confirmedAuthID) {
			return true;
		} else {
			return false;
		}
	}
}
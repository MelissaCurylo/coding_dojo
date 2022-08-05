package com.melissacurylo.caresoft;

public class User {
	
	/// attributes
    protected Integer id;
    protected int pin;
    
    //constructor
	public User(Integer id) {
		super();				/// super makes new object
		this.id = id;
	}
	
	// setters/getters for id 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	// setters/getters for id 
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
}


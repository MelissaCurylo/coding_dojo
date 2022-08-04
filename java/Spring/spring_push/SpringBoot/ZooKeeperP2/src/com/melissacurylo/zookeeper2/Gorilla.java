package com.melissacurylo.zookeeper2;

public class Gorilla extends Mammal {
	public String Name = "Gorilla George";
	
	public void throwSomething() {
		System.out.println("Why did you throw that" + " " + Name + " !!");
		energyLevel -= 5;
	}
	
	public void climb() {
		System.out.println("Look. " + Name + " " + "Climbed the wall!");
		energyLevel -= 10;
	}
	
	public void eatBananas() {
		System.out.println("Oh look how happy " + Name + " " + "is, eating those delicious bananas :-)");
		energyLevel += 10;
	}
}
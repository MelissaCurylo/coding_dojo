package com.melissacurylo.zookeeper2;

public class BatTest {

	public static void main(String[] args) {
		Bat bat = new Bat();

		bat.displayEnergy();
		System.out.println("\n");
		
		bat.attackTown();
		bat.attackTown();
		bat.attackTown();
		bat.displayEnergy();
		System.out.println("\n");
		
		bat.eatHuman();
		bat.eatHuman();
		bat.displayEnergy();
		System.out.println("\n");
		
		bat.fly();
		bat.fly();
		bat.displayEnergy();
		
	}	

}

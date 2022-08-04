package com.melissacurylo.zookeeper2;

public class Bat extends Mammal {
	public String Name = "BatBat Attack";
	public String Noise = "screeeech, screeech, need hooman food";
	public String FlyNoise = "screeeech, screeech, lift off";
	public String Attack = "It's back, ruuuunnn!!";
	public String Food = "yummmy hooman";
	
	public Bat() {
		setEnergyLevel(300); 
	}
	
	public Bat(int energyLevel) {
		setEnergyLevel(energyLevel);
	}
	
	public void eatHuman() {
		energyLevel += 25;
		System.out.println(Noise + ", " + Food );
	}
	
	public void attackTown() {
		energyLevel -= 100;
		System.out.println(Name + ", " + Attack );
	}
	
	public void fly() {
		energyLevel -= 25;
		System.out.println(FlyNoise );
	}
	
	

}

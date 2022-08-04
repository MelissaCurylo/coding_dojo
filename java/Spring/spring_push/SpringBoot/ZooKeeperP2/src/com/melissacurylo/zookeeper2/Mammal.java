package com.melissacurylo.zookeeper2;

	// leading file (parent -- inheritance from this file)

	public class Mammal {
		
		public int energyLevel = 100;    // cannot make this private but can make this protected
		
		public Mammal(){}   // empty constructor
		
		public Mammal(int energyLevel){    // overloading constructor
			this.energyLevel = energyLevel;
		}
		
		
		public int displayEnergy() {
			System.out.println("Energy Level: " + energyLevel);
			return energyLevel;
		}
		
		public int getEnergyLevel() {
			return energyLevel;
		}
		public void setEnergyLevel(int energyLevel) {
			this.energyLevel = energyLevel;
		}
	}

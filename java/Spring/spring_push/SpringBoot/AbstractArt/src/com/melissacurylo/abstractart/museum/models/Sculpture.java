package com.melissacurylo.abstractart.museum.models;

import com.melissacurylo.abstractart.Art;

public class Sculpture extends Art {
	
	
	// member variable
	private String sculptureMaterial;

	public Sculpture(String title, String author, String description, String sculptureMaterial) {
		super(title, author, description);
		this.sculptureMaterial = sculptureMaterial;
	}

	// criteria for creating a new sculpture that is pulled into museum
	public void viewArt() {
		String newSculpture = "";
//		System.out.println("Sculpture Added to Museum" + "\n");
		newSculpture += "Title: " + getTitle() + " " + "Author: " + getAuthor() + " " + "Description: " + getDescription() + " " + "Material : " + sculptureMaterial;
		System.out.println("New Sculpture: " + newSculpture + "\n");
	}


	// Getter and Setter for sculpture material
	public String getSculptureMaterial() {
		return sculptureMaterial;
	}
	public void setSculptureMaterial(String sculptureMaterial) {
		this.sculptureMaterial = sculptureMaterial;
	}
}

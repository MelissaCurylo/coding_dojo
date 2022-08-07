package com.melissacurylo.abstractart.museum.models;

import com.melissacurylo.abstractart.Art;

public class Painting extends Art {
	
	// member variable
	private String paintMaterial;
	
	public Painting(String title, String author, String description, String paintMaterial) {
		super(title, author, description);
		this.paintMaterial = paintMaterial;
	}

	public void viewArt() {
		String newPainting = "";
//		System.out.println("Painting Added to Museum" + "\n");
		newPainting += "Title: " + getTitle() + " " + "Author: " + getAuthor() + " " + "Description: " + getDescription() + " " + "Painting Material: " + paintMaterial;
		newPainting += getAuthor();
		newPainting += getDescription();
		newPainting += paintMaterial;
		System.out.println("New Painting: " + newPainting + "\n");
	}

	public String getPaintMaterial() {
		return paintMaterial;
	}
	public void setPaintMaterial(String paintMaterial) {
		this.paintMaterial = paintMaterial;
	}
}

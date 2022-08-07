package com.melissacurylo.abstractart;

public abstract class Art {
	
	// member variables
	private String title;
	private String author;
	private String description;	
	
	public Art(String title, String author, String description) {
		this.setTitle(title);
		this.setAuthor(author);
		this.setDescription(description);			
	}
	
	
	// void view art method implement in the child classes to print/us member variables
	public abstract void viewArt();


	// member variables getter/setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	} 
	
	
	
	
	

}

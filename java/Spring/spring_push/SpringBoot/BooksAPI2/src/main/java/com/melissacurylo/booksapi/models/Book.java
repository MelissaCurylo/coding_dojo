package com.melissacurylo.booksapi.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity 
@Table(name="books")
public class Book {
	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	
	@NotNull
	@Size(min = 5, max = 200)
	private String title;
	
	@NotNull
	@Size(min = 5, max = 200)
	private String description;
	
	@NotNull
	@Size(min = 5, max = 50)
	private String language;
	
	@NotNull(message="Must not be blank")
	@Min(value=10, message="Book must be at minimum 10 pages")
	private Integer numberOfPages;
	
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	//empty constructor
	public Book() {}
	
	
	public Book(String title, String description, String language, Integer numberOfPages) {
		this.title = title;
		this.description = description;
		this.language = language;
		this.numberOfPages = numberOfPages;		// pages		
	}
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	public Integer getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumOfPages(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	
	
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

}
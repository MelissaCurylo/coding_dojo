package com.melissacurylo.mvcpractice.models;

import java.util.Date;


// every table in MySQL will require a separate file with attributes, constructors, and getter/setters
//    not possible to put all tables in one 

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

@Entity // make sure to import the persistence.entity when it pops up
@Table(name="books")
public class Book {
    @Id  // id key will be auto generated
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    
    // attributes should be private it's good OOP practice
    // also when attributes are private then will need getters/setters
    private Long id;
    @NotNull
    @Size(min = 5, max = 200)
    private String title;
    @NotNull
    @Size(min = 5, max = 200)
    private String description;
    @NotNull
    @Size(min = 3, max = 40)
    private String language;
    @NotNull
    @Min(100)
    private Integer numOfPages;
    
    
    // This will not allow the createdAt column to be updated after creation
    // Means the createdAt will not update on every same
    // want to keep data just as it is once object is created
    @Column(updatable=false)
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;   // make sure to add the PrePersist method at the end
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;   // make sure to add the PreUpdate method at the end
    
    
    // always create an empty constructor with no arguments 
    // empty constructor allows for spring to use getters/setters when 
    // 		working/creating with empty object 
    // empty constructor is necessary as eliminates a lot of bugs
    public Book() { }

    
    public Book(String title, String description, String language, int numOfPages) {
        this.title = title;
        this.description = description;
        this.language = language;
        this.numOfPages = numOfPages;
    }
    
    
    
    // other getters and setters removed for brevity
    // means that right before the object is created, save the date that the 
    // object is created at and on every update save the date that the object is
    // being updated at
    
    
 // whenever something is being created a PrePersist takes place which means that
    // a new date will be added at the time the item was created
    @PrePersist   
    protected void onCreate(){
        this.createdAt = new Date();
    }
    
    
    // whenever something is being updated a PreUpdate takes place which means that
    // a new date will be added at the time the item was updated
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
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
	public Integer getNumOfPages() {
		return numOfPages;
	}
	public void setNumOfPages(Integer numOfPages) {
		this.numOfPages = numOfPages;
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
    
   
    
}
package com.melissacurylo.projectManager.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="projects")
public class Project {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
			
		@NotNull(message="Title is required")
		@Size(min=1, message="Title is required")
		private String title;
		
		@NotNull
		@Size(min=1, message="Description is required")
		private String description;
		
		@Future(message="Date can only be todays date or a future date")
		@NotNull(message="Date is required")
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		private Date dueDate;
		
		
		@Column(updatable=false)
		@DateTimeFormat(pattern="yyyy-MM-dd")
		private Date createdAt;
		@DateTimeFormat(pattern="yyyy-MM-dd")
		private Date updatedAt;

		@PrePersist
		protected void onCreate() {
			this.createdAt = new Date();
		}
		@PreUpdate
		protected void onUpdate() {
			this.updatedAt = new Date();
		}
		
		
		
//		//relationship to User model 
//		//project table // many projects to one teamlead
//		@ManyToOne(fetch = FetchType.LAZY)
//		@JoinColumn(name="teamlead_id") //creates foreign key
//		private User teamlead;
    
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name="project_id") //creates foreign key
		private User teamlead;
		
	
		 @ManyToMany(fetch = FetchType.LAZY)
			@JoinTable(
					name = "users_projects",  //table name must be the same in User
					joinColumns = @JoinColumn(name = "project_id"), // join at project id // creates adjoining fk
					inverseJoinColumns = @JoinColumn(name = "user_id")
			)
	    private List<User> users; // list of users
		
		 
		 
		 
	    public Project() {}
	    
	    
	    
	    
	    
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
		public Date getDueDate() {
			return dueDate;
		}
		public void setDueDate(Date dueDate) {
			this.dueDate = dueDate;
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
		public User getTeamlead() {
			return teamlead;
		}
		public void setTeamlead(User teamlead) {
			this.teamlead = teamlead;
		}
		public List<User> getUsers() {
			return users;
		}
		public void setUsers(List<User> users) {
			this.users = users;
		}	    
	    
}
	    
	    
		
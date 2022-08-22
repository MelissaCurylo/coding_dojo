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
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="users")
public class User {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
		
		
		@NotEmpty(message="First Name is required!")
	    @Size(min=3, message="First Name must be at least 3 characters")
	    private String firstName;
		
		
		@NotEmpty(message="Last Name is required!")
	    @Size(min=3, message="Last Name must be at least 3 characters")
	    private String lastName;
		
		
		@NotEmpty(message="Email is required!")
	    @Email(message="Please enter a valid email!")
	    private String email;
	    
	    @NotEmpty(message="Password is required!")
	    @Size(min=8, message="Password must be at least 8 characters long")
	    private String password;
	    
	    @Transient
	    @NotEmpty(message="Confirm Password is required!")
	    @Size(min=8, message="Password must be at least 8 characters long")
	    private String confirm;
    
	    
	    
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
    
		
		
//		// relationship to Project model
//		@OneToMany(mappedBy="teamlead", fetch = FetchType.LAZY)
//		private List<Project> projects; // Projects list is that each teamlead owns
//    
    
		
		@ManyToMany(fetch = FetchType.LAZY)
		@JoinTable(
				name = "users_projects",  /// table name must be the same in Project
				joinColumns = @JoinColumn(name = "user_id"), // join at user id // creates adjoining fk
				inverseJoinColumns = @JoinColumn(name = "project_id")
		)
	    private List<Project> projects; // list of projects in ManyToMany
	    
		
		
	    @Column(updatable=false)
	    @OneToMany(mappedBy="teamlead", fetch = FetchType.LAZY)
	    private List<Project> projectsLead; // list of projects connected to teamlead
		
		
		
		
	    public User() {}
	    
	    
	    
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getConfirm() {
			return confirm;
		}
		public void setConfirm(String confirm) {
			this.confirm = confirm;
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
		public List<Project> getProjects() {
			return projects;
		}
		public void setProjects(List<Project> projects) {
			this.projects = projects;
		}
		public List<Project> getProjectsLead() {
			return projectsLead;
		}
		public void setProjectsLead(List<Project> projectsLead) {
			this.projectsLead = projectsLead;
		}
	    
}
package com.melissacurylo.projectManager.services;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.melissacurylo.projectManager.models.LoginUser;
import com.melissacurylo.projectManager.models.Project;
import com.melissacurylo.projectManager.models.User;
import com.melissacurylo.projectManager.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	
	
	// Register
	// register uses the form:form -- will need newUser from form and BindingResult
	public User register(User newUser, BindingResult result) {   
				
		Optional<User> optionalUser = userRepo.findByEmail(newUser.getEmail()); // getting email user entered
		
		
		if(optionalUser.isPresent()) {  // boolean condition; returns true if email present
			result.rejectValue("email", "Email already registered"); //reject if email is taken (email in db)
		}
		if(!newUser.getPassword().equals(newUser.getConfirm())) { // getting and comparing passwords typed in by user 
			result.rejectValue("confirm", "matches", "Passwords do not match"); // reject if password doesn't match pw confirmation
		}
		
		if(result.hasErrors()) { // if any errors occur return null and exit method
			return null;
		}
		
		String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt()); // hash and set password, save user to db
		newUser.setPassword(hashed);
		return userRepo.save(newUser);  // register newUser as there were no errors
	}
	
	
	
	// Login
	public User login(LoginUser newLogin, BindingResult result) {

		Optional<User> potentialUser = userRepo.findByEmail(newLogin.getEmail());  // find user in db by email
		
		if(!potentialUser.isPresent()) {  // check if user is in db
			result.rejectValue("email", "unique", "Email is not registerd, please register."); // if email is not present in db, reject
			return null;
		}
		User user = potentialUser.get(); // user exists // retrieve user from db
		
		if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) { // if BCrypt pw match fails
			result.rejectValue("password", "Matches", "Invalid password" ); // reject
		}
		if(result.hasErrors()) { // if any errors return null
			return null;
		}
		return user; // no errors occurred and user in db is returned
		
	}
	
	
	
	/// find all
		public List<User> allUsers(){
			return userRepo.findAll();
		}
		
		
	/// find all assigned and unassgined
		public List<User> getAssignedProjects(Project project){
			return userRepo.findAllByProjects(project);
		}
		
		public List<User> getUnassignedProjects(Project project){
			return userRepo.findByProjectsNotContains(project);
		}
		

	
	///find one by id
		public User oneUser(Long id) {
			Optional<User> optionalUser = userRepo.findById(id);
			if(optionalUser.isPresent()) {
				return optionalUser.get();
			}else {
				return null;
			}
		}	
	
		/// update
		public User updateUser(User user){
			return userRepo.save(user);
		}


}
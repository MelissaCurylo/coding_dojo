package com.melissacurylo.projectManager.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.melissacurylo.projectManager.models.Project;
import com.melissacurylo.projectManager.models.User;
import com.melissacurylo.projectManager.repositories.ProjectRepository;

@Service
public class ProjectServices {
	
	@Autowired
	private ProjectRepository projectRepo;
	
	
	
	///find all
		public List<Project> allProjects(){
			return projectRepo.findAll();
		}
			
		
	///find one by id
		public Project oneProject(Long id) {
			Optional<Project> optionalProject = projectRepo.findById(id);
			if(optionalProject.isPresent()) {
				return optionalProject.get();
			}else {
				return null;
			}
		}
		
	
	/// find all assigned and unassgined
		public List<Project> getAssignedUsers(User user){
			return projectRepo.findAllByUsers(user);
		}
		
		public List<Project> getUnassignedUsers(User user){
			return projectRepo.findByUsersNotContains(user);
		}
		
		
		
	///create 
		public Project createProject(Project project) {
			return projectRepo.save(project);
		}	
		
	///update 
		public Project updateProject(Project project) {
			return projectRepo.save(project);
		}
		
		
		
	///delete
		public void deleteProject(Long id) {
			projectRepo.deleteById(id);
		}
	
	
	

}

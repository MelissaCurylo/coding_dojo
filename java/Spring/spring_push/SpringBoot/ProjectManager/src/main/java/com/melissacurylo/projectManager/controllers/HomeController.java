package com.melissacurylo.projectManager.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.melissacurylo.projectManager.models.LoginUser;
import com.melissacurylo.projectManager.models.Project;
import com.melissacurylo.projectManager.models.User;
import com.melissacurylo.projectManager.services.ProjectServices;
import com.melissacurylo.projectManager.services.UserService;


@Controller
public class HomeController {
	
		@Autowired
		private UserService userService;
		
		@Autowired
		private ProjectServices projectServices;
		
		
		@GetMapping("/")
		public String index(Model model) {   /// adding jsp objects via Model model
			model.addAttribute("newUser", new User());  // creating empty objects
			model.addAttribute("newLogin", new LoginUser()); // creating empty objects
			return "index.jsp";
		}
		
		
		
		
		@PostMapping("/register")  // route matches index.jsp form:form action
		public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, HttpSession session, Model model) {
			User user = userService.register(newUser, result);  // calling UserService, enter newUser and result into UserService
			
			if(result.hasErrors()) {
				model.addAttribute("newLogin", new LoginUser()); 
				return "index.jsp";
			} else {
				session.setAttribute("userId", user.getId()); // grabbing id from userService.register user instance
				session.setAttribute("firstName", user.getFirstName());
				return "redirect:/dashboard"; 
			}
		}
		
		
		
		@PostMapping("/login")
		public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin,
				BindingResult result, HttpSession session, Model model) {
			User user = userService.login(newLogin, result);
			
			if(result.hasErrors() || user == null) {
				model.addAttribute("newUser", new User());
				return "index.jsp";
			}else {
				session.setAttribute("userId", user.getId()); // grabbing id from userService.register user instance
				session.setAttribute("firstName", user.getFirstName());
				return "redirect:/dashboard"; 
			}
		}
		
		
		

		@GetMapping("/logout")
			public String logout(HttpSession session) {
				session.invalidate();  // clears session, logs user out, redirect to main page
				return "redirect:/";
			}
		
		
		
		@GetMapping("/dashboard")   // need this route as second security that session cleared
		public String dashboard(HttpSession session, Model model) {
			if(session.getAttribute("userId") == null) {  // user not logged in, redirect to log back in
				return "redirect:/logout";
			}
			Long userId = (Long) session.getAttribute("userId");
			model.addAttribute("user", userService.oneUser(userId));
			model.addAttribute("unassignedProjects", projectServices.getUnassignedUsers(userService.oneUser(userId)));
			model.addAttribute("assignedProjects", projectServices.getAssignedUsers(userService.oneUser(userId)));
			//			model.addAttribute("projectList", projectServices.allProjects());
			return "dashboard.jsp";
		}
		/// ^^update to dashboard route^^
		//after create page and create project logic 
		//added Model model  // model.addAttribute 
		//pulling projects into a list in dashboard then build dashboard
		
		
		
		/// join team button
		@RequestMapping("/dashboard/join/{id}")
		public String joinTeam(@PathVariable("id") Long id, HttpSession session, Model model) {
			
			if(session.getAttribute("userId") == null) {
				return"redirect:/logout";
			}
			Long userId = (Long) session.getAttribute("userId");
			
			Project project = projectServices.oneProject(id);
			User user = userService.oneUser(userId);
			
			user.getProjects().add(project);
			userService.updateUser(user);
			
			model.addAttribute("user", userService.oneUser(userId));
			model.addAttribute("unassignedProjects", projectServices.getUnassignedUsers(user));
			model.addAttribute("assignedProjects", projectServices.getAssignedUsers(user));
			
			return "redirect:/dashboard";
		}
		
	
	
	@RequestMapping("/dashboard/leave/{id}")
	public String leaveTeam(@PathVariable("id") Long id, HttpSession session, Model model) {
		
		if(session.getAttribute("userId") == null) {
			return "redirect:/logout";
		}
		Long userId = (Long) session.getAttribute("userId");
		
		Project project = projectServices.oneProject(id);
		User user = userService.oneUser(userId);
		
		user.getProjects().remove(project);
		userService.updateUser(user);
		
		model.addAttribute("user", userService.oneUser(userId));
		model.addAttribute("unassignedProjects", projectServices.getUnassignedUsers(user));
		model.addAttribute("assignedProjects", projectServices.getAssignedUsers(user));
		
		return "redirect:/dashboard";
	}

		
		
		
		
		// CREATE part 1
			// render form 
		@GetMapping("/projects/add")
		public String renderCreateProject(@ModelAttribute("project") Project project, HttpSession session) {
			if(session.getAttribute("userId") == null) {  // user not logged in, redirect to log back in
				return "redirect:/"; 
			}
			return "createProject.jsp";
		}
		
		
		
		// CREATE part 2
			// process form
		@PostMapping("/projects/add")
		public String processCreateProject(@Valid @ModelAttribute("project") Project project, 
						BindingResult result, HttpSession session) {
			if(session.getAttribute("userId") == null) {  // user not logged in, redirect to log back in
				return "redirect:/"; 
			}		
			
			if(result.hasErrors()) {
				return "createProject.jsp";
			}else {
				//TODO my own task not on assignment: add later: validate user logged in via session in controller
					// if want to get user // grab user using session
					// project.setUser to set the session user
				projectServices.createProject(project);
				return "redirect:/dashboard";
			}
		}
		
		
		
		// DETAILS // Find one
		@GetMapping("projects/{id}")
		public String projectDetails(@PathVariable("id")Long id, HttpSession session, Model model) {
			
			if(session.getAttribute("userId") == null) { 
				return "redirect:/";					
			}
			model.addAttribute("oneProject", projectServices.oneProject(id));
			return "projectDetails.jsp";
		}
		
		
		
		
		
		// EDIT
		// EDIT part 1
				// render form 
				@GetMapping("/projects/edit/{id}")
				public String renderEditProject(@PathVariable("id") Long id, Model model, HttpSession session) {
					if(session.getAttribute("userId") == null) {  // user not logged in, redirect to log back in
						return "redirect:/"; 
					}
					Project project = projectServices.oneProject(id); // second security check if editing user != to project id
					if(project.getTeamlead().getId() != (Long)session.getAttribute("userId")) {  // then logout
						return "redirect:/";
					}
						
					model.addAttribute("project", projectServices.oneProject(id));
					return "editProject.jsp";
				}
				
		
		// EDIT
		// EDIT part 2
				// process form 
				@PutMapping("/projects/edit/{id}")
				public String processEditProject(@Valid @ModelAttribute("project") Project project, 
						BindingResult result, HttpSession session) {
					if(session.getAttribute("userId") == null) {  // user not logged in, redirect to log back in
						return "redirect:/"; 
					} 
					if(project.getTeamlead().getId() != (Long)session.getAttribute("userId")) {  // second security check if editing user != to project id
						return "redirect:/"; // then logout
					}
					
					if(result.hasErrors()) {
						return "editProject.jsp";
					}else {
						// TODO my own task not on assignment: add later: validate user logged in via session in controller
							// if want to get user // grab user using session
							// project.setUser to set the session user
						projectServices.updateProject(project);
						return "redirect:/dashboard";
					}
				}
		
		
		
		
		
		
		//DELETE   // matches to delete button in projectDetails
		@DeleteMapping("/projects/delete/{id}")
		public String deleteProject(@PathVariable("id")Long id, HttpSession session) {
			if(session.getAttribute("userId") == null) {  // user not logged in, redirect to log back in
				return "redirect:/"; 
			}
			//conditional rendering added via c:if 
			projectServices.deleteProject(id);
			return "redirect:/dashboard";
		}
		
}

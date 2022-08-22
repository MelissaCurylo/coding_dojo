package com.melissacurylo.projectManager.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.melissacurylo.projectManager.models.Project;
import com.melissacurylo.projectManager.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	List<User>findAll();
	User findByIdIs(Long id);
	Optional<User> findByEmail(String email);
	List<User> findAllByProjects(Project project);   /// need to pull list of projects per users
	List<User> findByProjectsContains(Project project);
	List<User> findByProjectsNotContains(Project project);

}

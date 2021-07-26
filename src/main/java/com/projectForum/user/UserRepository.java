package com.projectForum.user;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UserRepository extends JpaRepository<User, Integer>{
	
	@Query("SELECT u FROM User u WHERE u.email = ?1")
	User findByEmail(String email);
	
	@Query("SELECT u FROM User u WHERE u.username = ?1")
	User findByUsername(String username);
	
	
	//TODO: FINISH THIS CLASS!
	
	//Search user by username
	//User getUserByUsername(String username);
	
	//Seach User by UserID
	//User GetUserByid(Long id);
	
	//Search User by Email
	//User getUserByEmail(String email);
	
	//List<User> findAll();
	
	//Add QUERYS!
}

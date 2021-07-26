package com.projectForum.index;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.projectForum.user.User;
import com.projectForum.user.UserRepository;

@Controller
public class IndexController {
	
	//Autowired - Spring framework automaticlly create a new instance of user repository and inject it into this class
	@Autowired
	private UserRepository userReop;
	
	//Defining the homepage of our application.
	@GetMapping("")
	public String viewHomePage() {
		return "index";
	}
	@GetMapping("/index")
	public String returnHomePage() {
		return "index";
	}
	
	//register procces
	//Sending user to register page
	//We are using Model to send user object
	@GetMapping("/register")
	public String showRegisterForm(Model model) {
		model.addAttribute("user", new User());
		return "register_form";
	}
	
	@PostMapping("/process_register")
	public String processRegistration(User user) {
		userReop.save(user);
		return "register_success";
	}
	
	//Users page
	@GetMapping("/list_users")
	public String viewUserList() {
		return "users";
	}
	
}

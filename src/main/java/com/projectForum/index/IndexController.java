package com.projectForum.index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.projectForum.user.User;
import com.projectForum.user.UserRepository;

@Controller
public class IndexController {
	
	
	@Autowired
	private UserRepository userReop;
	
	//Defining the homepage of our application.
	@GetMapping("")
	public String viewHomePage() {
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
}

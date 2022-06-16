package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Login {
	@RequestMapping("/login.do")
	public String login(Model model) {
		model.addAttribute("loginKey", "HyeongjuPARK");
		
		return "login";	// login.jsp
	}
}

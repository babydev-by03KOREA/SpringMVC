package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Resume {
	@RequestMapping("/resume.do")
	public String login(Model model) {
		model.addAttribute("Developer", "HyeongjuPARK");
		model.addAttribute("Language", "Java");
		model.addAttribute("FrameWork", "Spring");
		
		return "resume";	// login.jsp
	}
}

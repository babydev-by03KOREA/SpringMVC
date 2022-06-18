package com.spring.mvc.member_controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.member.MemberDTO;

@Controller
public class memberController {
//	@Resource(name="memService")
	MemberService service;
	
	@RequestMapping(value="userJoin.do", method = RequestMethod.POST)
	public String memJoin(Model model, HttpServletRequest request) {
		String userID = request.getParameter("userID");
		String userPassword = request.getParameter("userPassword");
		String userName = request.getParameter("userName");
		String userGender = request.getParameter("userGender");
		String userEmail = request.getParameter("userEmail");
		String userAgreement = request.getParameter("userAgreement");
		
		service.memberRegister(userID, userPassword, userName, userGender, userEmail, userAgreement);
		
		model.addAttribute("userID", userID);
		model.addAttribute("userPassword", userPassword);
		model.addAttribute("userName", userName);
		model.addAttribute("userGender", userGender);
		model.addAttribute("userEmail", userEmail);
		model.addAttribute("userAgreement", userAgreement);
		
		return "memberPro";	// memberPro.jsp
	}
	
	@RequestMapping(value="userLogin.do", method = RequestMethod.POST)
	public String memLogin(Model model, HttpServletRequest request) {
		String userID = request.getParameter("userID");
		String userPassword = request.getParameter("userPassword");
		
		MemberDTO member = service.memberSearch(userID, userPassword);
		
		try {
			model.addAttribute("userID", member.getUserID());
			model.addAttribute("userPassword", member.getUserPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "memberPro";	// memberPro.jsp
	}
}

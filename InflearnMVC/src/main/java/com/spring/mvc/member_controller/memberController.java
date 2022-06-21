package com.spring.mvc.member_controller;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.member.MemberDTO;
import com.spring.mvc.member_service.MemberService;

@Controller
public class memberController {
//	@Resource(name="memService")
	@Autowired
	MemberService service;	
	// MemberService service = new MemberService();도 가능 
	// RequestMapping("/member") 공통된부분 추출
	@RequestMapping(value="/userJoin.do", method = RequestMethod.POST)
	public String memJoin(MemberDTO member) {
		
//		'Model model, HttpServletRequest request' 사용하지않고 Parameter로 객체 하나만 받으면 끝남!
//		String userID = request.getParameter("userID");
//		String userPassword = request.getParameter("userPassword");
//		String userName = request.getParameter("userName");
//		String userGender = request.getParameter("userGender");
//		String userEmail = request.getParameter("userEmail");
//		String userAgreement = request.getParameter("userAgreement");
		// member로부터 꺼내오면됨!
		
//		service.memberRegister(userID, userPassword, userName, userGender, userEmail, userAgreement);
		
		service.memberRegister(member.getUserID(), member.getUserPassword(), member.getUserName(),
				member.getUserGender(), member.getUserEmail(), member.getUserAgreement());
		
//		model? 필요없음! view에서 CMD로 쓰면됨!
//		model.addAttribute("userID", userID);
//		model.addAttribute("userPassword", userPassword);
//		model.addAttribute("userName", userName);
//		model.addAttribute("userGender", userGender);
//		model.addAttribute("userEmail", userEmail);
//		model.addAttribute("userAgreement", userAgreement);
		
		return "memberPro";	// memberPro.jsp
	}
	
	@RequestMapping(value="/userLogin.do", method = RequestMethod.POST)
	public String memLogin(MemberDTO member) {
		
//		Model model, @RequestParam("userID") String userID, @RequestParam("UserPassword") String userPassword
//		Required 넌 꼭 필요해!를 boolean으로 명시!, 값이 안오면 이걸로 대체해! defaultValue!
		
//		request를 사용하지않고 annotation 사용하는 방법
//		String userID = request.getParameter("userID");
//		String userPassword = request.getParameter("userPassword");
		
//		MemberDTO member = service.memberSearch(userID, userPassword);
		
		service.memberSearch(member.getUserID(), member.getUserPassword());
		
//		try {
//			model.addAttribute("userID", member.getUserID());
//			model.addAttribute("userPassword", member.getUserPassword());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		return "loginPro";	// loginPro.jsp
	}
}

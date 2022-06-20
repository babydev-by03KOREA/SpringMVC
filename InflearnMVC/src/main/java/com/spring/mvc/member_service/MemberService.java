package com.spring.mvc.member_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mvc.member.MemberDTO;
import com.spring.mvc.member.dao.MemberDAO;

//@Service
//@Component
@Repository
//방법3
public class MemberService implements IMemberService {
	
	@Autowired
	// 방법 2,3
	MemberDAO dao;
	
	@Override
	public void memberRegister(String userID, String userPassword, String userName, String userGender, String userEmail,
			String userAgreement) {
		System.out.println("memberRegister()");
		System.out.println("userID : " + userID);
		System.out.println("userPassword : " + userPassword);
		System.out.println("userName : " + userName);
		System.out.println("userGender : " + userGender);
		System.out.println("userEmail : " + userEmail);
		System.out.println("userAgreement : " + userAgreement);
		dao.memberInsert(userID, userPassword, userName, userGender, userEmail, userAgreement);
	}

	@Override
	public MemberDTO memberSearch(String userID, String userPassword) {
		System.out.println("memberSearch()");
		System.out.println("userID: " + userID);
		System.out.println("userPWD: " + userPassword);

		MemberDTO member = dao.memberSelect(userID, userPassword);
		
		return member;
	}

	@Override
	public void memberModify() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void memberRemove() {
		// TODO Auto-generated method stub
		
	}
	
}

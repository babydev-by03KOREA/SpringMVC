package com.spring.mvc.member_service;

import com.spring.mvc.member.MemberDTO;

public interface IMemberService {
	void memberRegister(String userID,String userPassword,String userName,String userGender,String userEmail,String userAgreement);
	MemberDTO memberSearch(String userID, String userPassword);
	void memberModify();
	void memberRemove();
}

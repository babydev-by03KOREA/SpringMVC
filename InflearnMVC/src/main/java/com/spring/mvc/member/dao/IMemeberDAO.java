package com.spring.mvc.member.dao;

import com.spring.mvc.member.MemberDTO;

public interface IMemeberDAO {
	void memberInsert(String userID, String userPassword, String userName, String userGender, String userEmail,
			String userAgreement);
	MemberDTO memberSelect(String userID, String userPassword);
	void memberUpdate();
	void memberDelete();
}

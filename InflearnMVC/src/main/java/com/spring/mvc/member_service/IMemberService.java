package com.spring.mvc.member_service;

import com.spring.mvc.member.MemberDTO;

public interface IMemberService {
	void memberRegister(MemberDTO member);
	void memberSearch(MemberDTO member);
	MemberDTO[] memberModify(MemberDTO member);
	void memberRemove(MemberDTO member);
}

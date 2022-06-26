package com.spring.mvc.member.dao;

import java.util.Map;

import com.spring.mvc.member.MemberDTO;

public interface IMemeberDAO {
	Map<String, MemberDTO> memberInsert(MemberDTO member);
	MemberDTO memberSelect(MemberDTO member);
	MemberDTO memberUpdate(MemberDTO member);
	Map<String, MemberDTO> memberDelete(MemberDTO member);
}

package com.spring.mvc.member.dao;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.spring.mvc.member.MemberDTO;

@Repository
public class MemberDAO implements IMemeberDAO{
	
	private HashMap<String, MemberDTO> dbMap;
	
	public MemberDAO() {
		dbMap = new HashMap<String, MemberDTO>();
	}
	
	@Override
	public Map<String, MemberDTO> memberInsert(MemberDTO member) {
		dbMap.put(member.getUserID(), member);
		return dbMap;
	}

	@Override
	public MemberDTO memberSelect(MemberDTO member) {
		MemberDTO mem = dbMap.get(member.getUserID());
//		MemberDTO member = new MemberDTO();
//		member = dbMap.get(userID);
//		member = dbMap.get(userPassword);	
		return mem;
	}

	@Override
	public MemberDTO memberUpdate(MemberDTO member) {
		
		dbMap.put(member.getUserID(), member);
		return dbMap.get(member.getUserID());
	}

	@Override
	public Map<String, MemberDTO> memberDelete(MemberDTO member) {
		dbMap.remove(member.getUserID());
		return dbMap;
	}
	
}

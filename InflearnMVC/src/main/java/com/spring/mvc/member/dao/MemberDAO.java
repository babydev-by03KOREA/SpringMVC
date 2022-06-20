package com.spring.mvc.member.dao;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.spring.mvc.member.MemberDTO;

@Repository
public class MemberDAO implements IMemeberDAO{
	
	private HashMap<String, MemberDTO> dbMap;
	
	public MemberDAO() {
		dbMap = new HashMap<String, MemberDTO>();
	}
	
	@Override
	public void memberInsert(String userID, String userPassword, String userName, String userGender, String userEmail,
			String userAgreement) {
		System.out.println("memberInsert()");
		System.out.println("userID : " + userID);
		System.out.println("userPassword : " + userPassword);
		System.out.println("userName : " + userName);
		System.out.println("userGender : " + userGender);
		System.out.println("userEmail : " + userEmail);
		System.out.println("userAgreement : " + userAgreement);
		
		MemberDTO member = new MemberDTO();
		member.setUserID(userID);
		member.setUserPassword(userPassword);
		member.setUserName(userName);
		member.setUserGender(userGender);
		member.setUserEmail(userEmail);
		member.setUserAgreement(userAgreement);
		
		dbMap.put(userID, member);
		
		Set<String> keys = dbMap.keySet();
		Iterator<String> iterator = keys.iterator();
		
		while (iterator.hasNext()) {
			String key = iterator.next();
			MemberDTO mem = dbMap.get(key);
			System.out.print("UserID: " + mem.getUserID() + "\t");
			System.out.print("userPassword : " + mem.getUserPassword() + "\t");
			System.out.print("userName : " + mem.getUserName() + "\t");
			System.out.print("userGender : " + mem.getUserGender() + "\t");
			System.out.print("userEmail : " + mem.getUserEmail() + "\t");
			System.out.print("userAgreement : " + mem.getUserAgreement() + "\n");
		}
		
	}

	@Override
	public MemberDTO memberSelect(String userID, String userPassword) {
		MemberDTO member = dbMap.get(userID);
//		MemberDTO member = new MemberDTO();
//		member = dbMap.get(userID);
//		member = dbMap.get(userPassword);	
		return member;
	}

	@Override
	public void memberUpdate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void memberDelete() {
		// TODO Auto-generated method stub
		
	}
	
}

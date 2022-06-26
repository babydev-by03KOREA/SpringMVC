package com.spring.mvc.member_service;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
	public void memberRegister(MemberDTO member) {
		printMembers(dao.memberInsert(member));
	}

	@Override
	public void memberSearch(MemberDTO member) {
		printMember(dao.memberSelect(member));
	}

	@Override
	public MemberDTO[] memberModify(MemberDTO member) {
		MemberDTO memBef = dao.memberSelect(member);
		MemberDTO memAft = dao.memberUpdate(member);
		printMember(memAft);
		
		return new MemberDTO[]{memBef, memAft};
	}

	@Override
	public void memberRemove(MemberDTO member) {
		printMembers(dao.memberDelete(member));
	}
	
	private void printMembers(Map<String, MemberDTO> map) {
		Set<String> keys = map.keySet();
		Iterator<String> Iterator = keys.iterator();
		
		while (Iterator.hasNext()) {
			String key = Iterator.next();
			MemberDTO mem = map.get(key);
			printMember(mem);
		}
	}
	
	private void printMember(MemberDTO mem) {
		System.out.print("ID:" + mem.getUserID() + "\t");
		System.out.print("|PW:" + mem.getUserPassword() + "\t");
		System.out.print("|NAME:" + mem.getUserName() + "\t");
		System.out.print("|MAIL:" + mem.getUserEmail() + "\t");
		System.out.print("|Gender:" + mem.getUserGender() + "\t");
		System.out.print("|Agree?:" + mem.getUserAgreement() + "\t");
		
//		List<MemPhone> memPhones = mem.getMemPhones();
//		for(MemPhone memPhone : memPhones) {
//			System.out.print("|PHONE:" + memPhone.getMemPhone1() + " - " + 
//											   memPhone.getMemPhone2() + " - " + 
//											   memPhone.getMemPhone3() + "\t");
//		}
		
		System.out.print("ID:" + mem.getUserID() + "\t");
		System.out.print("|PW:" + mem.getUserPassword() + "\t");
		System.out.print("|NAME:" + mem.getUserName() + "\t");
		System.out.print("|MAIL:" + mem.getUserEmail() + "\t");
		System.out.print("|Gender:" + mem.getUserGender() + "\t");
		System.out.print("|Agree?:" + mem.getUserAgreement() + "\t");
		
	}
	
}

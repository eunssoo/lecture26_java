package test;

import java.util.List;

import bank.member.Member;
import bank.member.MemberDao;
import bank.member.MemberListDao;

public class TestMember {
	public static void main(String[] args) {
		testMemberDao();
		
	}
	
	public static void testMemberDao() {
		MemberDao mdao = new MemberListDao();
		// 회원 추가
		System.out.println(">>> 회원추가");
		mdao.save(new Member("sungsoo", "1111", "은성수", null, null));
		mdao.save(new Member("jisoo", "1111", "지수", null, null));
		// 회원 모두 찾기
		System.out.println(">>> 회원목록");
		List<Member> mlist = mdao.findAll();
		printMemberList(mlist);
	
		System.out.println(">>> ID로 회원찾기");
		Member m  = mdao.findById("jisoo");
		System.out.println(m);
		
		System.out.println(">>> 비밀번호 변경");
		m.setPassword("1234");
		mdao.update(m);
		// 회원 출력
		printMemberList(mlist);
		
		m = mdao.findById("jisoo");
		mdao.delete(mdao.findById("jisoo"));
	}
	
	public static void printMemberList(List<Member> mlist) {
		for (Member m : mlist) {
			System.out.println(m);
		}
	}
}

package test;

import java.util.List;
import java.util.UUID;

import bank.member.Member;
import bank.member.MemberDao;
import bank.member.MemberListDao;
import bank.member.MemberOracleDao;
import bank.member.MemberService;
import bank.member.SSMemberService;

public class TestMember {
	public static void main(String[] args) {
		if (args.length > 0 && "oracle".equals(args[0])) {
			testMemberOracleDao();
			return;
		}
//		testMemberDao();
		testMemberService();
	}

	public static void testMemberOracleDao() {
		MemberDao mdao = new MemberOracleDao();
		String id = "t" + UUID.randomUUID().toString().substring(0, 8);
		Member member = new Member(id, "1111", "테스트회원", null, null, Member.USER);

		if (!mdao.save(member)) {
			throw new IllegalStateException("Oracle 회원 등록 실패");
		}

		try {
			Member saved = mdao.findById(id);
			if (saved == null || !member.getName().equals(saved.getName())
					|| saved.getType() != Member.USER) {
				throw new IllegalStateException("Oracle 회원 조회 실패");
			}

			List<Member> members = mdao.findAll();
			boolean found = false;
			if (members != null) {
				for (Member listed : members) {
					if (id.equals(listed.getId())) {
						found = true;
						break;
					}
				}
			}
			if (!found) {
				throw new IllegalStateException("Oracle 회원 목록 조회 실패");
			}

			saved.setPassword("2222");
			saved.setEmail("test@example.com");
			if (!mdao.update(saved)) {
				throw new IllegalStateException("Oracle 회원 수정 실패");
			}

			Member updated = mdao.findById(id);
			if (updated == null || !"2222".equals(updated.getPassword())
					|| !"test@example.com".equals(updated.getEmail())) {
				throw new IllegalStateException("Oracle 회원 수정 결과 확인 실패");
			}
		} finally {
			mdao.delete(member);
		}

		if (mdao.findById(id) != null) {
			throw new IllegalStateException("Oracle 회원 삭제 실패");
		}
		System.out.println("Oracle 회원 등록, 조회, 수정, 삭제 확인 완료");
	}

	public static void testMemberService() {
	    MemberService ms = new SSMemberService(new MemberListDao());
	    System.out.println(">> 회원가입 및 목록조회");
	    ms.join("curi", "1234", "큐리");
	    ms.join("curi", "1111", "큐리2");
	    ms.join("curi2", "1111", "큐리2");
	    printMemberList(ms.getAllMembers());
	    
	    System.out.println(">> 로그인, 로그아웃");

	    if (ms.login("curi2", "1111"))
	        System.out.println(ms.getLoggedMember());
	    ms.logout();
	    System.out.println(ms.getLoggedMember());
	    
	    System.out.println(">> 회원 정보 보기");
	    ms.login("curi2", "1111");
	    System.out.println(ms.getMemberInfo("curi"));
	    
    }
	
	
	public static void testMemberDao() {
		MemberDao mdao = new MemberListDao();
		// 회원 추가
		System.out.println(">>> 회원추가");
		mdao.save(new Member("ADMIN", "1234", "ADMIN", null, null, Member.ADMIN));
		mdao.save(new Member("sungsoo", "1111", "은성수", null, null, Member.USER));
		mdao.save(new Member("jisoo", "1111", "지수", null, null, Member.USER));
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
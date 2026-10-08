package test;

import java.util.List;

import bank.account.Account;
import bank.account.AccountDao;
import bank.account.AccountListDao;

public class TestAccount {
	public static void main(String[] args) {
		testAccountDao();
	}

	public static void testAccountDao() {
		AccountDao adao = new AccountListDao();
		// 계좌 추가
		System.out.println(">>> 계좌추가");
		adao.save(new Account(1001, "1111", "sungsoo", 10000));
		adao.save(new Account(1002, "1111", "jisoo", 20000));
		adao.save(new Account(1003, "2222", "sungsoo", 30000));
		// 계좌 모두 찾기
		System.out.println(">>> 계좌목록");
		List<Account> alist = adao.findAll();
		printAccountList(alist);

		System.out.println(">>> 계좌번호로 계좌찾기");
		Account a = adao.findByNo(1002);
		System.out.println(a);

		System.out.println(">>> 회원 ID로 계좌찾기");
		alist = adao.findByMemberId("sungsoo");
		printAccountList(alist);

		System.out.println(">>> 비밀번호 변경");
		a.setPassword("1234");
		adao.update(a);
		// 계좌 출력
		alist = adao.findAll();
		printAccountList(alist);

		System.out.println(">>> 계좌삭제");
		a = adao.findByNo(1002);
		adao.delete(a);
		alist = adao.findAll();
		printAccountList(alist);
	}

	public static void printAccountList(List<Account> alist) {
		for (Account a : alist) {
			System.out.println(a);
		}
	}
}
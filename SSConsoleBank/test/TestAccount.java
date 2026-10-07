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

        // 계좌 모두 찾기
        System.out.println(">>> 계좌목록");
        List<Account> alist = adao.findAll();
        printAccountList(alist);

        // 계좌번호로 계좌 찾기
        System.out.println(">>> 계좌번호로 계좌찾기");
        Account a = adao.findByNo(1002);
        System.out.println(a);

        // 계좌 비밀번호 변경
        System.out.println(">>> 비밀번호 변경");
        a.setPassword("1234");
        adao.update(a);
        printAccountList(adao.findAll());

        // 계좌 삭제 후 목록 확인
        System.out.println(">>> 계좌삭제");
        a = adao.findByNo(1002);
        adao.delete(a);
        printAccountList(adao.findAll());
    }

    public static void printAccountList(List<Account> alist) {
        if (alist == null || alist.isEmpty()) {
            System.out.println("등록된 계좌가 없습니다.");
            return;
        }

        for (Account a : alist) {
            System.out.println(a);
        }
    }
}
package bank.app;

import bank.account.AccountListDao;
import bank.account.AccountService;
import bank.account.SSAccountService;
import bank.app.menu.StartMenu;
import bank.member.SSMemberService;
import bank.member.MemberListDao;
import bank.member.MemberService;

public class SSConsoleBankApp {

    public static void main(String[] args) {

        MemberService ms = new SSMemberService(new MemberListDao());
        AccountService as = new SSAccountService(new AccountListDao());

        new StartMenu(as, ms).run();
    }
}

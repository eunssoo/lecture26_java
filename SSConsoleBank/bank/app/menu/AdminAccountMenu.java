package bank.app.menu;

import bank.account.AccountService;
import bank.app.console.ConsoleMenu;
import bank.member.MemberService;

public class AdminAccountMenu extends ConsoleMenu {

    protected AdminAccountMenu(AccountService as, MemberService ms) {
        super(as, ms);
    }

    @Override
    public void run() {
        System.out.println("::: 계좌관리 :::");
    }
}
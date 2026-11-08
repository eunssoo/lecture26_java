package bank.app.menu;

import bank.account.AccountService;
import bank.app.console.ConsoleMenu;
import bank.member.MemberService;

public class AdminMemberMenu extends ConsoleMenu {

    protected AdminMemberMenu(AccountService as, MemberService ms) {
        super(as, ms);
    }

    @Override
    public void run() {
        System.out.println("::: 회원관리 :::");
    }
}
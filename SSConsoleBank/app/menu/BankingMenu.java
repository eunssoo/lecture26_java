package bank.app.menu;

import bank.account.AccountService;
import bank.app.console.ConsoleMenu;
import bank.member.MemberService;

public class BankingMenu extends ConsoleMenu {

    protected BankingMenu(AccountService as, MemberService ms) {
        super(as, ms);
    }

    @Override
    public void run() {
        
    }
}
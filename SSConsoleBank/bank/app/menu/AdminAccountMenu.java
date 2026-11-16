package bank.app.menu;

import bank.account.AccountService;
import bank.app.console.ConsoleMenu;
import bank.member.MemberService;

public class AdminAccountMenu extends ConsoleMenu {

    protected AdminAccountMenu(AccountService as, MemberService ms) {
        super(as, ms);
        menuList = new String[] {"돌아가기", "전체계좌목록", "회원별계좌목록"};
    }

    @Override
    public void run() {
        System.out.println("::: 계좌관리 :::");

        while (true) {
            int menu = selectMenu();

            switch (menu) {
            case 1 -> listAllAccounts();
            case 2 -> listMemberAccounts();
            case 0 -> {goBack(); return;}
            case -1 -> System.out.println("숫자를 입력해주세요.");
            default -> System.out.println("!! 메뉴에 있는 번호 선택 !!");
            }
        }
    }

    private void goBack() {
        System.out.println("돌아가기");
    }

    private void listAllAccounts() {
        System.out.println("전체계좌목록");
    }

    private void listMemberAccounts() {
        System.out.println("회원별계좌목록");
    }
}

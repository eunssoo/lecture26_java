package bank.app.menu;

import bank.account.AccountService;
import bank.app.console.ConsoleMenu;
import bank.member.MemberService;

public class AdminMemberMenu extends ConsoleMenu {

    protected AdminMemberMenu(AccountService as, MemberService ms) {
        super(as, ms);
        menuList = new String[] {"돌아가기", "회원목록", "회원강퇴"};
    }

    @Override
    public void run() {
        System.out.println("::: 회원관리 :::");

        while (true) {
            int menu = selectMenu();

            switch (menu) {
            case 1 -> listMembers();
            case 2 -> deleteMember();
            case 0 -> {goBack(); return;}
            case -1 -> System.out.println("숫자를 입력해주세요.");
            default -> System.out.println("!! 메뉴에 있는 번호 선택 !!");
            }
        }
    }

    private void goBack() {
        System.out.println("돌아가기");
    }

    private void listMembers() {
        System.out.println("회원목록");
    }

    private void deleteMember() {
        System.out.println("회원강퇴");
    }
}

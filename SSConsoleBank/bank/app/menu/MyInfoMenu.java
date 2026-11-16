package bank.app.menu;

import bank.account.AccountService;
import bank.app.console.ConsoleMenu;
import bank.member.MemberService;

public class MyInfoMenu extends ConsoleMenu {

    public MyInfoMenu(AccountService as, MemberService ms) {
        super(as, ms);
        menuList = new String[] {"돌아가기", "비밀번호수정", "회원탈퇴"};
    }

    @Override
    public void run() {
        System.out.println("::: 내 정보 :::");

        while (true) {
            int menu = selectMenu();

            switch (menu) {
            case 1 -> updatePassword();
            case 2 -> deleteMembership();
            case 0 -> {goBack(); return;}
            case -1 -> System.out.println("숫자를 입력해주세요.");
            default -> System.out.println("!! 메뉴에 있는 번호 선택 !!");
            }
        }
    }

    private void goBack() {
        System.out.println("돌아가기");
    }

    private void updatePassword() {
        System.out.println("비밀번호수정");
    }

    private void deleteMembership() {
        System.out.println("회원탈퇴");
    }
}

package assignment;

public class Challenge3 {

    public static void main(String[] args) {

        // 테스트 코드
        System.out.println(factorial(5));
        System.out.println(factorial(1, 5));
        System.out.println(factorial(3, 5));
        System.out.println(factorial(10, 5));
    }

    // 일반 팩토리얼
    static int factorial(int x) {

        int r = 1;

        while (x > 0) {
            r = r * x;
            x--;
        }

        return r;
    }

    // 구간 팩토리얼
    static int factorial(int x, int y) {

        int r = 1;

        while (x <= y) {
            r = r * x;
            x++;
        }

        return r;
    }
}
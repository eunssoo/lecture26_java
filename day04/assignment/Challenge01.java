package assignment;

public class Challenge01 {

    static class Printer {

        int numOfPapers = 0;

        public void print(int amount) {
            numOfPapers -= amount;
        }
    }

    public static void main(String[] args) {

        // Printer 객체 생성
        Printer p = new Printer();

        // 프린터에 용지 100장 추가
        p.numOfPapers = 100;

        // 70장 출력
        p.print(70);

        // 남아 있는 용지 확인
        System.out.println(p.numOfPapers);
    }
}
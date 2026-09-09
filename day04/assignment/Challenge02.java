package assignment;

public class Challenge02 {

    static class Printer {

        private int numOfPapers;

        // 생성자
        public Printer(int numOfPapers) {
            this.numOfPapers = numOfPapers;
        }

        public void print(int amount) {

            // 용지가 하나도 없는 경우
            if (numOfPapers == 0) {
                System.out.println("용지가 없습니다.");
                return;
            }

            // 출력할 양보다 현재 용지가 적은 경우
            if (amount > numOfPapers) {

                int shortage = amount - numOfPapers;

                System.out.println(
                    "모두 출력하려면 용지가 "
                    + shortage
                    + "매 부족합니다. "
                    + numOfPapers
                    + "장만 출력합니다."
                );

                numOfPapers = 0;
            }

            // 용지가 충분한 경우
            else {

                numOfPapers -= amount;

                System.out.println(
                    amount
                    + "장 출력했습니다. 현재 "
                    + numOfPapers
                    + "장 남아 있습니다."
                );
            }
        }
    }

    public static void main(String[] args) {

        Printer p = new Printer(10);

        p.print(2);
        p.print(20);
        p.print(10);
    }
}
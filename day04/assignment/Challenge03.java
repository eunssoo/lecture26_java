package assignment;

public class Challenge03 {

    static class Printer {

        private int numOfPapers;
        private boolean duplex;

        // 생성자
        public Printer(int numOfPapers, boolean duplex) {
            this.numOfPapers = numOfPapers;
            this.duplex = duplex;
        }

        public void print(int amount) {

            // 실제 필요한 용지 수
            int requiredPapers;

            // 양면 출력
            if (duplex) {
                requiredPapers = (amount + 1) / 2;
            }

            // 단면 출력
            else {
                requiredPapers = amount;
            }

            // 용지가 없는 경우
            if (numOfPapers == 0) {
                System.out.println("용지가 없습니다.");
                return;
            }

            // 용지가 부족한 경우
            if (requiredPapers > numOfPapers) {

                int shortage = requiredPapers - numOfPapers;

                if (duplex) {
                    System.out.println(
                        "양면으로 모두 출력하려면 용지가 "
                        + shortage
                        + "매 부족합니다. "
                        + numOfPapers
                        + "장만 출력합니다."
                    );
                } else {
                    System.out.println(
                        "단면으로 모두 출력하려면 용지가 "
                        + shortage
                        + "매 부족합니다. "
                        + numOfPapers
                        + "장만 출력합니다."
                    );
                }

                numOfPapers = 0;
            }

            // 용지가 충분한 경우
            else {

                numOfPapers -= requiredPapers;

                if (duplex) {
                    System.out.println(
                        "양면으로 "
                        + requiredPapers
                        + "장 출력했습니다. 현재 "
                        + numOfPapers
                        + "장 남아 있습니다."
                    );
                } else {
                    System.out.println(
                        "단면으로 "
                        + requiredPapers
                        + "장 출력했습니다. 현재 "
                        + numOfPapers
                        + "장 남아 있습니다."
                    );
                }
            }
        }

        // Getter
        public boolean getDuplex() {
            return duplex;
        }

        // Setter
        public void setDuplex(boolean duplex) {
            this.duplex = duplex;
        }
    }

    public static void main(String[] args) {

        Printer p = new Printer(20, true);

        p.print(25);

        p.setDuplex(false);

        p.print(10);
    }
}
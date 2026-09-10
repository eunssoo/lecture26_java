package assignment;

public class Programming07 {

    static class GolfClub {

        private String type;

        public GolfClub() {
            type = "7번 아이언";
        }

        public GolfClub(int number) {
            type = number + "번 아이언";
        }

        public GolfClub(String type) {
            this.type = type;
        }

        public void print() {
            System.out.println(type + "입니다.");
        }
    }

    public static void main(String[] args) {

        GolfClub g1 = new GolfClub();
        g1.print();

        GolfClub g2 = new GolfClub(8);
        g2.print();

        GolfClub g3 = new GolfClub("퍼터");
        g3.print();
    }
}
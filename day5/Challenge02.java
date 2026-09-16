package assignment;

public class Challenge02 {

    static class Girl {

        private String name;

        // 디폴트 생성자
        Girl() {
        }

        Girl(String name) {
            this.name = name;
        }

        void show() {
            System.out.println("그녀는 자바 초보자이다.");
        }
    }

    static class GoodGirl extends Girl {

        @Override
        void show() {
            System.out.println("그녀는 자바를 잘 안다.");
        }
    }

    static class BestGirl extends GoodGirl {

        @Override
        void show() {
            System.out.println("그녀는 자바를 무지하게 잘 안다.");
        }
    }

    public static void main(String[] args) {

        Girl g1 = new Girl();
        Girl g2 = new GoodGirl();
        GoodGirl gg = new BestGirl();

        g2.show();
        gg.show();
    }
}
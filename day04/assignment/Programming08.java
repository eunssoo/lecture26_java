package assignment;

public class Programming08 {

    static class Dice {

        private int[] face = {1, 2, 3, 4, 5, 6};

        public int roll() {

            int index = (int)(Math.random() * 6);

            return face[index];
        }
    }

    public static void main(String[] args) {

        Dice d = new Dice();

        System.out.println("주사위의 숫자 : " + d.roll());
    }
}
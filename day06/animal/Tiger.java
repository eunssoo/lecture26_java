package animal;

public class Tiger extends Animal {

    String leg;

    @Override
    void eat() {
        System.out.println("고기를 먹는다.");
    }

    @Override
    void move() {
        System.out.println("달린다.");
    }

    @Override
    void sleep() {
        System.out.println("누워서 잠을 잔다.");
    }

    @Override
    public String toString() {
        return ">>> 호랑이";
    }
}
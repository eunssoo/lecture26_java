package animal;

public class Eagle extends Animal {

    String fin;

    @Override
    void eat() {
        System.out.println("고기를 먹는다.");
    }

    @Override
    void move() {
        System.out.println("날아디닌다.");
    }

    @Override
    void sleep() {
        System.out.println("잠을 잔다.");
    }

    @Override
    public String toString() {
        return ">>> 독수리";
    }
}
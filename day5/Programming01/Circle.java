package assignment;

public class Circle {

    protected int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void show() {
        System.out.println("반지름이 " + radius + "인 원이다.");
    }
}
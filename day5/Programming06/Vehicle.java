package assignment;

public class Vehicle {

    protected String color;
    protected int speed;

    public Vehicle(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public void show() {
        System.out.println("자동차 색상 : " + color);
        System.out.println("자동차 속도 : " + speed);
    }
}
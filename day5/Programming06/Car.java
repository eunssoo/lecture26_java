package assignment;

public class Car extends Vehicle {

    private int displacement;
    private int gears;

    public Car(String color, int speed,
               int displacement, int gears) {

        super(color, speed);

        this.displacement = displacement;
        this.gears = gears;
    }

    @Override
    public void show() {
        System.out.println("자동차 색상 : " + color);
        System.out.println("자동차 속도 : " + speed);
        System.out.println("자동차 배기량 : " + displacement);
        System.out.println("자동차 기어 단수 : " + gears);
    }
}
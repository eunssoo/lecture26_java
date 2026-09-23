package animal2;

public class AnimalTest {

    public static void main(String[] args) {
        printDayLife(new Tiger());
    }

    public static void printDayLife(Animal a) {
        a.eat();
        a.move();
        a.sleep();
    }
}
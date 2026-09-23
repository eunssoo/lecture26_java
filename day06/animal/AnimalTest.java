package animal;

public class AnimalTest {

	public static void main(String[] args) {
		Animal[] animals = {new Tiger(), new Goldfish(), new Tiger(), new Eagle()};
		
		for (Animal a : animals) {
			printDaylife(a);
		}
	}
	
	public static void printDaylife(Animal a) {
		System.out.println(a);
		a.eat();
		a.move();
		a.sleep();
	}

}

package assignment;

public class Child extends Parent {

    String name = "사도세자";

    @Override
    public void print() {
        System.out.println("나는 " + name + "이다.");
    }
}
package assignment;

public class Phone {

    protected String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    public void talk() {
        System.out.println(owner + "가 통화 중이다.");
    }
}
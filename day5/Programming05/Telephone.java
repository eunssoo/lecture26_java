package assignment;

public class Telephone extends Phone {

    private String when;

    public Telephone(String owner, String when) {
        super(owner);
        this.when = when;
    }

    public Telephone(String owner) {
        super(owner);
    }

    public void autoAnswering() {
        System.out.println(owner + "가 없다. "
                + when + " 전화 줄래.");
    }
}
package assignment;

public class ForeignStudent extends Student {

    private String nationality;

    public ForeignStudent(String name, int age,
                          int studentNo, String nationality) {

        super(name, age, studentNo);
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String show() {
        return "외국학생[이름 : " + getName()
                + ", 나이 : " + getAge()
                + ", 학번 : " + getStudentNo()
                + ", 국적 : " + nationality + "]";
    }
}
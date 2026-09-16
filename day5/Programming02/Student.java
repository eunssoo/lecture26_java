package assignment;

public class Student extends Person {

    private int studentNo;

    public Student(String name, int age, int studentNo) {
        super(name, age);
        this.studentNo = studentNo;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    @Override
    public String show() {
        return "학생[이름 : " + getName()
                + ", 나이 : " + getAge()
                + ", 학번 : " + studentNo + "]";
    }
}
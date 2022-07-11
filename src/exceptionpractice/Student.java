package exceptionpractice;

public class Student {
    String roll_no;
    String name;
    int age;
    String course;

    public Student() {
    }

    public Student(String roll_no, String name, int age, String course) {
        this.roll_no = roll_no;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


}

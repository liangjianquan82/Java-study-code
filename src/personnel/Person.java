package personnel;

public class Person {
    String name;
    int age;
    String dept_no;

    public Person(String name, int age, String dept_no) {
        this.name = name;
        this.age = age;
        this.dept_no = dept_no;
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

    public String getDept_no() {
        return dept_no;
    }

    public void setDept_no(String dept_no) {
        this.dept_no = dept_no;
    }
}

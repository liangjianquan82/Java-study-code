package personnel;

public class Department {
    String name;
    String dept_no;

    public Department(String name, String dept_no) {
        this.name = name;
        this.dept_no = dept_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept_no() {
        return dept_no;
    }

    public void setDept_no(String dept_no) {
        this.dept_no = dept_no;
    }
}

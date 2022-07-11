package finalexampctwo;

public class Employee {
    private String employee_name;
    private int monthly_salary;
    private int monthly_working_hours;

    public Employee() {
    }

    public Employee(String employee_name, int monthly_salary, int monthly_working_hours) {
        this.employee_name = employee_name;

        this.monthly_salary = monthly_salary;
        this.monthly_working_hours = monthly_working_hours;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public int getMonthly_salary() {
        return monthly_salary;
    }

    public void setMonthly_salary(int monthly_salary) {
        this.monthly_salary = monthly_salary;
    }

    public int getMonthly_working_hours() {
        return monthly_working_hours;
    }

    public void setMonthly_working_hours(int monthly_working_hours) {
        this.monthly_working_hours = monthly_working_hours;
    }

    public void chlist(int ch, Employee[] listep) {
        int working_hours = 0;
        String name = "";
        int salary = 0;
        if (ch == 1) {
            //list_salary(listep);

            for (int i = 0; i < listep.length; i++) {
                for (int j = i + 1; j < listep.length; j++) {
                    if (listep[j].getMonthly_salary() < listep[i].getMonthly_salary()) {
                        working_hours = listep[j].getMonthly_working_hours();
                        listep[j].setMonthly_working_hours(listep[i].getMonthly_working_hours());
                        listep[i].setMonthly_working_hours(working_hours);

                        name = listep[j].getEmployee_name();
                        listep[j].setEmployee_name(listep[i].getEmployee_name());
                        listep[i].setEmployee_name(name);

                        salary = listep[j].getMonthly_salary();
                        listep[j].setMonthly_salary(listep[i].getMonthly_salary());
                        listep[i].setMonthly_salary(salary);
                    }
                }
            }
            for (int i = 0; i < listep.length; i++) {
                System.out.println((i + 1) + "- " +
                        listep[i].getEmployee_name() + "  with the monthly working salary " +
                        listep[i].getMonthly_salary());
            }
        } else if (ch == 2) {
            //list_working_hours(listep);
            for (int i = 0; i < listep.length; i++) {
                for (int j = i + 1; j < listep.length; j++) {
                    if (listep[j].getMonthly_working_hours() < listep[i].getMonthly_working_hours()) {
                        working_hours = listep[j].getMonthly_working_hours();
                        listep[j].setMonthly_working_hours(listep[i].getMonthly_working_hours());
                        listep[i].setMonthly_working_hours(working_hours);

                        name = listep[j].getEmployee_name();
                        listep[j].setEmployee_name(listep[i].getEmployee_name());
                        listep[i].setEmployee_name(name);

                        salary = listep[j].getMonthly_salary();
                        listep[j].setMonthly_salary(listep[i].getMonthly_salary());
                        listep[i].setMonthly_salary(salary);
                    }
                }
            }
            for (int i = 0; i < listep.length; i++) {
                System.out.println((i + 1) + "- " +
                        listep[i].getEmployee_name() + "  with the monthly working hours " +
                        listep[i].getMonthly_working_hours());
            }
        }
        else if (ch == 3) {
            //list_salary(listep);
            for (int i = 0; i < listep.length; i++) {
                for (int j = i + 1; j < listep.length; j++) {
                    if (listep[j].getEmployee_name().compareToIgnoreCase(listep[i].getEmployee_name())<0) {
                        working_hours = listep[i].getMonthly_working_hours();
                        listep[i].setMonthly_working_hours(listep[j].getMonthly_working_hours());
                        listep[j].setMonthly_working_hours(working_hours);

                        name = listep[i].getEmployee_name();
                        listep[i].setEmployee_name(listep[j].getEmployee_name());
                        listep[j].setEmployee_name(name);

                        salary = listep[i].getMonthly_salary();
                        listep[i].setMonthly_salary(listep[j].getMonthly_salary());
                        listep[j].setMonthly_salary(salary);
                    }
                }
            }
            for (int i = 0; i < listep.length; i++) {
                System.out.println((i + 1) + "- " +
                        listep[i].getEmployee_name() );
            }
        }

    }

}

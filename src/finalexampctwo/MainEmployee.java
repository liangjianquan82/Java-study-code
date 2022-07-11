package finalexampctwo;

import arraylistclass.arrayperson;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEmployee {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Employee[] listen = new Employee[8];
        System.out.println("Enter the 8 Employee information: ");
        for (int i = 0; i < listen.length; i++) {
            String Employee_name = "";
            int Monthly_salary = 0;
            int Monthly_working_hours = 0;
            try {
                System.out.println("Enter the employee's name: ");
                Employee_name = in.next();
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
            try {
                System.out.println("Enter the monthly salary: ");
                Monthly_salary = in.nextInt();
                System.out.println("Enter the monthly working hours: ");
                Monthly_working_hours= in.nextInt();
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
            listen[i] = new Employee(Employee_name,Monthly_salary,Monthly_working_hours);

        }

//        listen[0] = new Employee("kkk", 7800,150);
//        listen[1] = new Employee("ddd", 5600,125);
//        listen[2] = new Employee("aaa", 9800,174);
//        listen[3] = new Employee("zzz", 5470,125);
//        listen[4] = new Employee("jjj", 7690,79);
//        listen[5] = new Employee("ttt", 4300,109);
//        listen[6] = new Employee("xxx", 5670,97);
//        listen[7] = new Employee("vvv", 4570,86);

//

        boolean loop = true;
        Employee em = new Employee();
        while (loop) {
            System.out.println("Choose the ranking criteria (enter 1,2,3 or 4):");
            System.out.println("1- Based on monthly salary 2- Based on monthly working hours 3- Alphabetically 4- Exit:");
            int ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Ranking, based on monthly working salary:");
                    em.chlist(ch,listen);
                    break;
                case 2:
                    System.out.println("Ranking, based on monthly working hours:");
                    em.chlist(ch,listen);
                    break;
                case 3:
                    System.out.println("Ranking, Alphabetically:");
                    em.chlist(ch,listen);
                    break;
                case 4:
                    loop = false;
                    System.out.print("!Bye Bye! \n");
                    break;
                default:
                    System.out.print("Wrong entry.Try again!\n");
            }
        }


    }
}

package company;

import foods.LiquidFood;

import java.util.Arrays;
import java.util.Scanner;

public class MainCompany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;


            while (loop) {

                System.out.println("Please choice company: 1--Company A.2--Company B.3--Exit");
                int Choice = sc.nextInt();

                switch (Choice) {
                    case 1:
                        boolean loopa = true;
                        CompanyA ca = new CompanyA();
                        while (loopa) {
                            System.out.println("Choice: \n1-Input info\n2-Display info\n3-Return");
                            int cac = sc.nextInt();
                            switch (cac) {
                                case 1:
                                    System.out.println("input employees:");
                                    String[] names = {"Paul", "Albert", "Bob", "AAAA"};
                                    int[] ages = {25,30,20,40};
                                    int[] salaries = {5500,3400,2500,4500};
                                    ca.setAge(ages);
                                    ca.setName(names);
                                    ca.setSalary(salaries);
                                    System.out.println(Arrays.toString(ca.getName()));
                                    System.out.println(Arrays.toString(ca.getAge()));
                                    System.out.println(Arrays.toString(ca.getSalary()));
                                    break;
                                case 2:
                                    if(ca.getSalary()==null){
                                        System.out.println("Please input employees:");
                                        break;
                                    }
                                    ca.showinfo();
                                    break;
                                case 3:
                                    loopa = false;
                                    System.out.print("Back to select company ! \n");
                                    break;
                                default:
                                    System.out.print("Wrong entry.Try again!\n");
                            }
                        }
                        break;
                    case 2:
                        boolean loopb = true;
                        CompanyB cb = new CompanyB();
                        while (loopb) {
                            System.out.println("Choice: \n1-Input info\n2-Display info\n3-Return");
                            int cac = sc.nextInt();
                            switch (cac) {
                                case 1:
                                    System.out.println("input employees:");
                                    String[]names = new String[]{"David", "Alfred", "Queen", "George"};
                                    int[] ages = new int[]{33, 20, 25, 40};
                                    int[]salaries = new int[]{4300, 6800, 11110, 3160};
                                    cb.setAge(ages);
                                    cb.setName(names);
                                    cb.setSalary(salaries);
                                    System.out.println(Arrays.toString(cb.getName()));
                                    System.out.println(Arrays.toString(cb.getAge()));
                                    System.out.println(Arrays.toString(cb.getSalary()));
                                    break;
                                case 2:
                                    if(cb.getSalary()==null){
                                    System.out.println("Please input employees:");
                                    break;
                                }
                                    cb.showinfo();
                                    break;
                                case 3:
                                    loopb = false;
                                    System.out.print("Back to select company ! \n");
                                    break;
                                default:
                                    System.out.print("Wrong entry.Try again!\n");
                            }
                        }
                        break;
                    case 3:
                        loop = false;
                        System.out.print("!Bye Bye!\n");
                        break;
                    default:
                        System.out.print("Wrong entry.Try again!\n");

                }
            }
    }
}

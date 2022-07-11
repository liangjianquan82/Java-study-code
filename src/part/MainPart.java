package part;

import java.util.Scanner;

public class MainPart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the part number:");
        String pn = sc.next();
        System.out.println("Enter the budget cost:");
        double cost = sc.nextDouble();
        boolean loop = true;
        while (loop) {
            System.out.println("Choice : \n1-self-manufactured part\n2-suppliers\n3-Exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    boolean loops = true;
                    SelfManufacture sm = new SelfManufacture();
                    while (loops) {
                        System.out.println("self-manufactured part\nChoice: \n1-input\n2-Display content\n3-Return");
                        int iput = sc.nextInt();
                        switch (iput) {
                            case 1:
                                System.out.println("Enter drawNumber:");
                                String drawNumber = sc.next();
                                System.out.println("Enter cost:");
                                double smcost = sc.nextDouble();
                                sm.setInfo(pn, cost, smcost, drawNumber);
                                break;
                            case 2:
                                System.out.println(sm.showinfo());
                                if (sm.costLowOrHigh()) {
                                    System.out.println("Self-manufactured part cost under budget");
                                } else {
                                    System.out.println("Self-manufactured part cost over budget");
                                }
                                break;
                            case 3:
                                loops = !loops;
                                System.out.print("Back to main choice \n");
                                break;
                            default:
                                System.out.print("Wrong entry.Try again!\n");
                        }
                    }
                    break;
                case 2:
                    boolean loopo = true;
                    OutSource os = new OutSource();
                    while (loopo) {
                        System.out.println("Suppliers part\nChoice: \n1-input\n2-Display content\n3-Return");
                        int iput = sc.nextInt();
                        switch (iput) {
                            case 1:
                                System.out.println("Number of suppliers:");
                                int numbersps = sc.nextInt();
                                String name[] = new String[numbersps];
                                double price[] = new double[numbersps];
                                for (int i = 0; i < price.length; i++) {
                                    System.out.print("Enter suppliers " + (i + 1) + ":");
                                    name[i] = sc.next();
                                    System.out.print("Enter price " + (i + 1) + ":");
                                    price[i] = sc.nextDouble();
                                }
                                os.setInfo(pn, cost, name, price);
                                break;
                            case 2:
                                System.out.println(os.showinfo());
                                System.out.println(os.SupplierAndLowPrice());
                                break;
                            case 3:
                                loopo = !loopo;
                                System.out.print("Back to main choice \n");
                                break;
                            default:
                                System.out.print("Wrong entry.Try again!\n");
                        }

                    }
                    break;
                case 3:
                    loop = !loop;
                    System.out.print("Bye Bye\n");
                    break;
                default:
                    System.out.print("Wrong entry.Try again!\n");
            }
        }
        sc.close();

    }
}

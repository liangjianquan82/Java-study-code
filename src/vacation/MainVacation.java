package vacation;

import java.util.ArrayList;
import java.util.Scanner;

public class MainVacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Vacation System!");
        System.out.print("Enter the destination:");
        String destination = sc.next();
        System.out.print("Enter the budget:");
        double budget = sc.nextDouble();
        boolean loop = true;
        while (loop) {
            System.out.println("Enter your Choice: \n1--travel brand,2--Self-help tourism,3--Exit");
            int cone = sc.nextInt();
            switch (cone) {
                case 1:
                    boolean oneloop = true;
                    AllInclusiveVacation al = new AllInclusiveVacation();
                    while (oneloop) {
                        System.out.println("Enter your Choice: " +
                                "\n1--input brand info,2--Display content,3--Return");
                        int iput = sc.nextInt();
                        switch (iput) {
                            case 1:
                                System.out.println("Enter number of brands: ");
                                int nb = sc.nextInt();
                                ArrayList<String> brand = new ArrayList<>();
                                ArrayList <Integer>rating= new ArrayList();
                                ArrayList<Double> prices = new ArrayList<>();
                                for (int i=0;i<nb;i++) {
                                    System.out.println("Enter item brand"+(i+1)+": ");
                                    brand.add(i,sc.next());
                                    System.out.println("Enter item rating"+(i+1)+": ");
                                    rating.add(i,sc.nextInt());
                                    System.out.println("Enter price"+(i+1)+": ");
                                    prices.add(i,sc.nextDouble());
                                }
                                al.setinfo(brand,rating,prices,budget,destination);
                                break;
                            case 2:
                                System.out.println("Enter your Choice:");
                                for(int i = 0 ;i<al.getBrand().size();i++){
                                    System.out.println((i+1)+"--"+al.getBrand().get(i)+
                                            " rating:" + al.getRating().get(i)+
                                            " price:" + al.getPrice().get(i));
                                }
                                al.setIdx(sc.nextInt()-1);
                                al.showinfo();break;
                            case 3:
                                oneloop = false;
                                System.out.print("Back to main choice \n");
                                break;
                            default:
                                System.out.print("Wrong entry.Try again!\n");
                        }
                    }

                    break;
                case 2:
                    boolean towloop = true;
                    PiecemealVacation pl = new PiecemealVacation();
                    while (towloop) {
                        System.out.println("Enter your Choice: " +
                                "\n1--input items info,2--Display content,3--Return");
                        int iput = sc.nextInt();
                        switch (iput) {
                            case 1:
                                System.out.println("Enter number of items: ");
                                int nb = sc.nextInt();
                                ArrayList<String> items = new ArrayList<>();
                                ArrayList<Double> costs = new ArrayList<>();
                                for (int i=0;i<nb;i++) {
                                    System.out.println("Enter item name: ");
                                    items.add(i,sc.next());
                                    System.out.println("Enter cost: ");
                                    costs.add(i,sc.nextDouble());
                                }
                                pl.setinfo(items,costs,budget,destination);
                                break;
                            case 2:
                                pl.showinfo();break;
                            case 3:
                                towloop = false;
                                System.out.print("Back to main choice \n");
                                break;
                            default:
                                System.out.print("Wrong entry.Try again!\n");
                        }
                    }

                    break;
                case 3:
                    loop = false;
                    System.out.print("Bye Bye\n");
                    break;
                default:
                    System.out.print("Wrong entry.Try again!\n");

            }
        }
        sc.close();
    }
}

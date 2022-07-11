package foods;

import java.util.Scanner;

public class MainFood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            System.out.println("Choice your food: \n1-LiquiFood\n2-Fruit\n3-Exit");
            int fChoice = sc.nextInt();
            String description;
            int cal;
            int nb;
            switch (fChoice) {
                case 1:
                    boolean loopLF = true;
                    LiquidFood lf = new LiquidFood();
                    while (loopLF) {
                        System.out.println("Choice: \n1-input\n2-Display content\n3-Return");
                        int lfc = sc.nextInt();
                        switch (lfc) {
                            case 1:
                                System.out.println("Enter LiquiFood name or description:");
                                description = sc.next();
                                System.out.println("Enter LiquiFood Calories per serving(Numerical value):");
                                cal = sc.nextInt();
                                System.out.println("Enter LiquiFood number servings:");
                                nb = sc.nextInt();
                                System.out.println("Enter LiquiFood viscosity value(Numerical value):");
                                double viscosity = sc.nextDouble();
                                lf.setLiquidFood(description, cal, viscosity, nb);
                                break;
                            case 2:
                                System.out.println(lf.toString());
                                break;
                            case 3:
                                loopLF = !loopLF;
                                System.out.print("Back to select food type \n");
                                break;
                            default:
                                System.out.print("Wrong entry.Try again!\n");
                        }
                    }
                    break;
                case 2:
                    boolean loopF = true;
                    Fruit fr = new Fruit();
                    while (loopF) {
                        System.out.println("Choice: \n1-input\n2-Display content\n3-Return");
                        int fc = sc.nextInt();
                        switch (fc) {
                            case 1:
                                System.out.println("Enter Fruit name or description:");
                                description = sc.next();
                                System.out.println("Enter Fruit Calories per serving(Numerical value):");
                                cal = sc.nextInt();
                                System.out.println("Enter Fruit number servings:");
                                nb = sc.nextInt();
                                System.out.println("Enter Fruit season :\n1-spring\n2-summer\n3-Autumn\n4-winter");
                                int season = sc.nextInt();
                                fr.setFruit(description, cal, season, nb);
                                break;
                            case 2:
                                System.out.println(fr.toString());
                                break;
                            case 3:
                                loopF = !loopF;
                                System.out.print("Back to select food type \n");
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


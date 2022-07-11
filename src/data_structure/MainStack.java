package data_structure;

import java.util.Scanner;

public class MainStack {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean loop = true;
        System.out.println("Menu: 1-Push 2-Pop 3-Peek 4-Show 5-Search 6-Exit");
        DynamicStack ds = new DynamicStack();
        while(loop){
            System.out.print("Enter your choice:");
            int sc = in.nextInt();
            switch (sc){
                case 1:
                    System.out.print("Enter the number to push:");
                    int input = in.nextInt();
                    ds.push(input);
                    break;
                case 2:
                    ds.pop();
                    break;
                case 3:
                    ds.peek();
                    break;
                case 4:
                    ds.show();
                    break;
                case 5:
                    System.out.print("Enter the number to search for:");
                    int intsearch = in.nextInt();
                    ds.search(intsearch);
                    break;
                case 6:
                    loop = false;
                    System.out.print("Bye bye!");
                    break;
                default:
                    System.out.print("Enter the wrong number,Try again!");
            }
        }
    }
}

package queue;

import java.util.Scanner;

public class MedicalClinicQueue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyQueueL mql = new MyQueueL();
        boolean exit = true;
        System.out.print("Menu: 1-Enqueue 2-Dequeue 3-Size 4-Show 5-Beofre me? 6-Exit\n");
        do {
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the name to enqueue: ");
                    mql.enqueue(0,in.next());
                    break;
                case 2:
                    mql.dequeue();
                    break;
                case 3:
                    mql.size();
                    break;
                case 4:
                    mql.showstrqueue();
                    break;
                case 5:
                    System.out.print("Enter your name : ");
                    mql.Beofre(in.next());
                    break;
                default:
                    System.out.print("Bye Bye!");
                    exit = false;
            }
        } while (exit);
    }
}

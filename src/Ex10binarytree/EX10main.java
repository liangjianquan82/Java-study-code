package Ex10binarytree;

import java.util.Random;
import java.util.Scanner;

public class EX10main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Tree_Node root = null;
        Binary_tree_implement bti = new Binary_tree_implement();
//        System.out.print("Enter nodes of tree: ");
//        int number = in.nextInt();
//        for(int i=0;i<number;i++){
//            System.out.print("Enter a number "+ i+": ");
//            Integer inputdata = in.nextInt();
//            n = bti.insert_binary(n,inputdata);
//
//        }
//        bti.traversal(n);
//        System.out.println();
//        bti.inorder(n);
//        System.out.println();
//        bti.preorder(n);
//        System.out.println();
//        bti.postorder(n);
//        System.out.println();
//        System.out.println("SUM of all nodes:"+bti.totalnodevalue(n));

        boolean again=true;
        Random rand = new Random();
        while(again) {
            System.out.print("\n1-Insert 2-Show Tree 3-Delete Node 4-Exit. What's your choice: ");
            int choice=in.nextInt();
            switch(choice) {
                case 1:root = bti.insert_binary(root,rand.nextInt(99));
                    System.out.println("Value inserted.");break;
                case 2:System.out.println("Binary tree:");
                    bti.inorder(root);break;
                case 3:System.out.print("Which value to delete? ");
                    int value=in.nextInt();
                    root=bti.deletenode(root, value);
                    if(bti.flog==0)System.out.println("\nValue not found.");
                    else System.out.println("\nValue deleted.");
                    break;
                default: again=false;
            }
        }
    }
}

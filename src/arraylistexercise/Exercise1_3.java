package arraylistexercise;

import java.util.Scanner;

//3.Write a program to create an array of n integers (selected by user).
// Then, Delete all repeated occurrences of each existing number in the array.
public class Exercise1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //ArrayList<Integer> listint = new ArrayList<Integer>();

        System.out.println("How many numbers do you want to enter?  enter a number: ");
        int sum = in.nextInt();
        Integer a[] = new Integer[sum];

        for (int i = 0; i < sum; i++) {
            System.out.print("Enter the Number" + (i + 1) + ": ");
            int input = in.nextInt();
            //listint.add(input);
            a[i] = input;
        }
        System.out.println();
        for (int i = 0; i < sum; i++) {
            System.out.print(a[i] + ",");        }

        System.out.println("\nDelete all repeated occurrences of each existing number in the array. ");
        System.out.println("Array: ");
        Integer c[] = delete_all_repeated(a);

//        System.out.print("Insert number left: ");
//        int m = in.nextInt();
//        System.out.print("Insert number right: ");
//        int n = in.nextInt();
//        Integer []b =insert_shift_left(a,m);
//
//        Integer []c =insert_shift_right(b,n);

//        System.out.print("Insert number: ");
//        int m = in.nextInt();
//        System.out.print("Insert index: ");
//        int n = in.nextInt();

        //Integer []c = insert_user_setplace(a,m,n);
        for (int i = 0; i < c.length; i++) {
            if(c[i]!=null)
                System.out.print(c[i] + ",");
        }
    }
    public static Integer [] delete_all_repeated(Integer [] a){
        Integer b[] = a;
        int n = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
           for(int j = 0; j < a.length; j++){
              if(a[i]==b[j]&&i!=j) {
                  b[j] = null;
              }
           }
        }
        return b;
    }
    public static Integer [] insert_shift_right(Integer [] a,int m){
        Integer b[] = new Integer[a.length+1];

        for (int i = 0; i <= a.length; i++) {
            if(i!=a.length)
            b[i] = a[i];
            else  b[i] = m;
        }
        return b;
    }
    public static Integer [] insert_shift_left(Integer [] a,int m){
        Integer b[] = new Integer[a.length+1];
        for (int i = 0; i < b.length; i++) {
            if(i==0)
                b[i] = m;
            else   b[i] = a[(i-1)];
        }
        return b;
    }

    public static Integer [] insert_shift_middle(Integer [] a,int m){
        Integer b[] = new Integer[a.length+1];
        for (int i = 0; i < b.length; i++) {
            if(i==b.length/2)
                b[i] = m;
            else if(i<b.length/2)
                b[i] = a[i];
            else if(i>b.length/2)
                b[i] = a[i-1];
        }
        return b;
    }

    public static Integer [] insert_user_setplace(Integer [] a,int m,int index){
        Integer b[] = new Integer[a.length+1];
        for (int i = 0; i < b.length; i++) {
            if(i==index)
                b[i] = m;
            else if(i<index)
                b[i] = a[i];
            else if(i>index)
                b[i] = a[i-1];
        }
        return b;
    }
}

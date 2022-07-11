package arraylistexercise;

import java.util.Scanner;

public class Insertion_sorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter? ");
        int nb = in.nextInt();
        Integer a[] = new Integer[nb];
        for (int i = 0; i < nb; i++) {
            System.out.println("enter number: ");
            int eb = in.nextInt();
            insert_sort(a, eb, i);
        }
        in.close();
    }

    public static void insert_sort(Integer a[], int eb, int index) {
        a[index] = eb;
        //1.从前面往后比较
//        for(int i=0;i<index+1;i++){

//            if(a[index]<a[i]) {
//                int temp = a[i];
//                a[i] = a[index];
//                a[index] = temp;
//            }
/*

        2.
        int n = index+1;
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;

            //Move elements of arr[0..i-1], that are
              // greater than key, to one position ahead
              // of their current position
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
 */
        //3.从后边往前比较
        int n = index+1;
        for(int i=1;i< n;i++){
            int pos = 0, temp = a[i];
            for(int j=i-1;j>=0;j--){
                if(a[j]>temp){
                    a[j+1]=a[j];
                }
                else{
                    pos = j+1;
                    break;
                }
            }
            a[pos] = temp;
        }

        print_out(a);
    }

    public static void print_out(Integer a[]) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != null)
                System.out.print(a[i] + ",");
        }
        System.out.println();
    }
}

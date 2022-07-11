import java.util.Scanner;

public class ArraysPractice {
    public static void main(String[] args) {
        int a[] = new int[10];
        int i = 0, min, max;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number 1: ");
        a[i] = in.nextInt();

        min = max = a[i];
        for (i = 1; i < a.length; i++) {
            System.out.print("Enter a number "+(i)+":");
            a[i] = in.nextInt();
            sum = sum + a[i];

            //find the maximum and minimum value. 
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        //1.print all values above the average and their corresponding occurrences.
        for( i = 0;i < a.length;i++){
            if(a[i]>sum/10){
                System.out.println(a[i] + " is above average and is in the " + (i+1) + "block.");
            }
        }
        System.out.println(min + " is the min number and " + max + " is the max number.");

        int temporary = 0;
        for(i = 0 ; i < a.length ; i++){
            for(int j = i+1 ; j < a.length;j++){
                if (a[i] > a[j]) {
                    temporary = a[i];
                    a[i] = a[j];
                    a[j] = temporary;
                }
            }
        }
//          sort it in ascending order.
//            Arrays.sort(a);
        System.out.print( " Sort it in ascending order ");
        for ( i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

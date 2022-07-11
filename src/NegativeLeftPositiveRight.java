import java.util.Scanner;

public class NegativeLeftPositiveRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[10];
        int b[] = new int[10];

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter a number" + (i + 1) + " : ");
            a[i] = in.nextInt();
        }

        System.out.println();
        System.out.print("Initial values inside the array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
        System.out.print("Array values after their shifting: ");

        b=separatePositiveNegative(a);
        for (int i = 0; i < b.length; i++) {
            System.out.print(" " + b[i]);
        }
        sc.close();
    }

    /**
     * Array sorting, negative numbers to the left, positive numbers to the right
     * @param a array
     * @return The completed sorted array
     */
    public static int[] separatePositiveNegative(int[] a) {
 //       1:
//        int index = -1;
//            for (int i = 0; i < a.length; i++) {
//                if(a[i] >= 0 && index==-1){
//                    index = i;//find the first positive number
//                }
//                if (a[i] < 0 && index!=-1) {
//                    //find positive after negative
//                    int k = a[index];
//                    a[index] = a[i];
//                    a[i] = k;
//
//                    i = index;
//                    index = -1; //reset
//                }
//            }
//        return a;
//
//
//        From teacher
//        for(int i=0;i<10;i++){
//            if(a[i]<0) {
//                for(int j=i;j>0 && a[j-1]>=0;j--) {
//                    int temp=a[j-1];
//                    a[j-1]=a[j];
//                    a[j]=temp;
//                }
//            }
//        }

//        2:
        boolean loop = false;
        do {
            loop = false;
            for (int i = 0; i < a.length; i++) {
                if (a[i] < 0 && i > 0) {
                    if (a[i - 1] >= 0) {
                        loop = true;
                    }
                    if(a[i-1] >= 0){
                    int temp = a[i - 1];
                    a[i - 1] = a[i];
                    a[i] = temp;
                    }
                }

            }
        }
        while (loop);
        return a;


//        3:
//        int b[] = new int[a.length];
//        int k =0;
//        for (int i = 0; i < a.length; i++){
//            if(a[i]<0)
//            {
//                b[k] = a[i];
//                k++;
//            }
//        }
//        for(int i = 0; i < a.length; i++){
//            if(a[i]>=0)
//            {
//                b[k] = a[i];
//                k++;
//            }
//        }
//        return b;

    }
}

import java.util.Scanner;

public class ExerciseTowA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a[][] = new int[3][4];
        int i, j;
        for (i = 0; i < 3; i++) {
            System.out.println("input Row " + (i + 1) + ":");
            for (j = 0; j < 4; j++) {
                System.out.println("column " + (j + 1) + " number:");
                a[i][j] = scanner.nextInt();
            }
        }
//      1-WAP to accept 12 numbers in a 3*4 array and print the values column wise.
        printColumnWise(a);

        printRowWise(a);


//      2-WAP to accept 12 numbers in a 3*4 array and search for an inputted number – show its position in this array.
        System.out.println("Enter the numbers that appear in the array:");
        int search = scanner.nextInt();
        showPositionInArray(a, search);


//      3-WAP to accept 12 numbers in a 3*4 array and sort it in descending order
        sortInDescendingOrder(a);

    }

    /**
     * print the values column wise
     * @param a 3*4 array
     */
    public static void printColumnWise(int a[][]) {
        System.out.println("Print the values column wise:");
        int i, j;
        for (j = 0; j < 4; j++) {
            for (i = 0; i < 3; i++) {
                System.out.print(a[i][j] + ",");
            }
            System.out.println();
        }
    }

    /**
     * print the values row wise
     * @param a 3*4 array
     */
    public static void printRowWise(int a[][]) {
        int i, j;
        System.out.println("Print the values row wise:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(a[i][j] + ",");
            }
            System.out.println();
        }
    }

    /**
     * show input number position in this array
     * @param a 3*4 array
     * @param b input number
     */
    public static void showPositionInArray(int a[][], int b) {
        int i, j;
        boolean h = false;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                if (a[i][j] == b) {
                    System.out.println("The entered number is in row " + (i+1) + ", column " + (j+1));
                    h = true;
                }
            }
        }
        if (!h) {
            System.out.println("The entered number is not in the array .");
        }
    }

    /**
     * sort array in descending order
     * @param a 3*4 array
     */
    public static void sortInDescendingOrder(int a[][]) {
        System.out.println("The entered number sort in descending order :");
        int i, j;
        boolean loop = false;
        int column = a[0].length;
        int rows = a.length;
        do {
            loop = false;
            for (i = 0; i < 3; i++) {
                for (j = 3; j >= 0; j--) {
                    if (j > 0) {
                        if (a[i][j] > a[i][j - 1] && j > 0) {
                            int temp = a[i][j];
                            a[i][j] = a[i][j - 1];
                            a[i][j - 1] = temp;
                            loop = true;
                        }
                    }
                    if (i > 0 && a[i][j] > a[i - 1][a[0].length - 1]) {
                        int temp = a[i][j];
                        a[i][j] = a[i - 1][a[0].length - 1];
                        a[i - 1][a[0].length - 1] = temp;
                        loop = true;
                    }
                }
            }
        }
        while (loop);
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(a[i][j] + ",");
            }
            System.out.println();
        }
    }
}

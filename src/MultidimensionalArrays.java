import java.util.Scanner;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a [][] = new int [3][4];
        int i,j;
        int sum=0;
        int Rsum=0;
        for(i = 0 ;i<3;i++){
            System.out.println("input line" + (i+1) + ":");
            for(j = 0 ;j<4;j++){
                System.out.println("Row " + (j+1) + " number:");
                a[i][j] = scanner.nextInt();
                sum  += a[i][j];
            }
        }
        for(i = 0 ;i<3;i++){

            for(j = 0 ;j<4;j++){
                System.out.print (a[i][j]+",");
                Rsum  += a[i][j];
            }
            System.out.println("Row "+i+" Sum is " +Rsum);
            Rsum=0;
        }
        System.out.println("Totle Sum is " +sum);
    }
}

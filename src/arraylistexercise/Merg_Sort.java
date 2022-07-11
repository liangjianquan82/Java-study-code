package arraylistexercise;

import java.util.Scanner;

public class Merg_Sort {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int i=0,j=0;
        System.out.print("How many numbers in the first array? ");
        int n=in.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++) {System.out.print("Enter a number: ");a[i]=in.nextInt();}
        System.out.print("How many numbers in the second array? ");
        int m=in.nextInt();
        int b[]=new int[m];
        for(j=0;j<m;j++) {System.out.print("Enter a number: ");b[j]=in.nextInt();}
        int c[] = new int[n+m];
        c = Merg_Int_Sort(a,b);
        for(i=0;i<n+m;i++)
            System.out.print(c[i] + ",");
    }

    public static int [] Merg_Int_Sort(int [] a,int [] b){
        int c[] = new int[a.length+b.length];
        int i=0,j=0,k=0;
        while (i<a.length&&j<b.length){
            if(a[i]<=b[j]){
                c[k++] = a[i++];
            }else{
                c[k++] = b[j++];
            }
        }
        while (i<a.length){
            c[k++] = a[i++];
        }
        for(;j<b.length;)c[k++]=b[j++];

        return c;
    }
}

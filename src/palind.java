import java.util.Scanner;

public class palind {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = scanner.next();
        String a[] = new String[10];
        palindromeString(s);

        System.out.println("How many string you want to enter? ");
        int no = scanner.nextInt();
        for(int i=0;i<no;i++){
            System.out.println("enter string " + (i+1) +" :");
            a[i]= scanner.next();
        }
        palindarrays(a,no);

        scanner.close();

    }
    public static void palindromeString(String a){
        int j = a.length();
        int i,flag = 0;
        for(i=0,j--;j>i;i++,j--){
            if(a.charAt(i)!=a.charAt(j)){
                flag = 1;
                break;
            }
        }
        if(flag==0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }

    public static void palindarrays(String a[],int no){
        int i,f =0;

        for(i=0,no--;no>i;i++,no--){
            if(a[i].compareTo(a[no])!=0){
                f = 1;
                break;
            }
        }
        if(f==0){
            System.out.println("Arrays is palindrome.");
        }else{
            System.out.println("Arrays is not palindrome.");
        }
    }
}

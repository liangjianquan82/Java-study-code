import java.util.Scanner;

public class FindPrimejNumber {
    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isprime = true;
        System.out.println(" Please enter a number:");
        int n = scanner.nextInt();
        for(int i = 2;i<n;i++){
            if(n%i==0){
                isprime = false;
                break;
            }
        }
        if(isprime){
            System.out.println(n + " is  prime number");
        }
        else{
            System.out.println(n+ " is not prime number");
        }
        scanner.close();
    }
}

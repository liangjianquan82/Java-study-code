import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int num,p;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a positive");
        num=sc.nextInt();
        if(num<0)
        {
            System.out.println(num +" is a negative number");

        }else if(num>0){

            //perfect number judgment
            p = isPerfectOrNot(num);

            if (p == num)
                System.out.println(num + " is a perfect number");
            else
                System.out.println(num + " is not a  perfect number");
        }
        sc.close();
    }
    /**
     * Judging Perfect numbers
     * @param num
     * @return The returned number after the perfect number judgment
     */
    public static int isPerfectOrNot(long num)
    {
        int sum=0;
        //a positive integer that is equal to the sum of its positive divisors,
        // excluding the number itself
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
        }
        return sum;
    }

}

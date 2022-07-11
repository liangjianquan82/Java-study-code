import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNb = sc.nextInt();
         if(PalindromeNumberorNot(inputNb))
         {
             System.out.print("The number is Palindrome Number ");
         }
         else
         {
             System.out.print("Not Palindrome Number ");
         }

    }

    public static boolean  PalindromeNumberorNot(int a){
        boolean p = true;
        String  s = String.valueOf(a);
        char [] c = s.toCharArray();
        int lenA = c.length;
        int mid = lenA/2;
        int front;
        int back;
        if(lenA % 2 == 0){   //Even judgment
            front = mid-1;
            back = mid;
        }
        else{
            front = mid -1;
            back = mid + 1;
        }
        if(s.equals("") || s.equals(null)) {
            p = false;
        }
        while(front >= 0 && back < lenA){
            if(c[front--] != c[back++])
                p = false;
        }
        return  p;
    }
}

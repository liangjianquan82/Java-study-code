package fileoperate;

import java.io.*;
import java.util.Scanner;

public class Filenmain {
    public static void main(String[] args) {



        int sum=0,sum1=0;
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\liang\\OneDrive\\Desktop\\tt.txt");
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the text: ");
            myWriter.write(in.nextLine());
            myWriter.close();
            in.close();
            for(char a='a';a<='z';a++) {
                Scanner s = new Scanner(new File("C:\\Users\\liang\\OneDrive\\Desktop\\tt.txt"));
                int i=0;
                while (s.hasNext()) {
                    String str=s.next();
                    if(str.startsWith(Character.toString(a))) {
                        System.out.print(str + " ");
                        i++;
                    }
                    if(str.endsWith(Character.toString('.')) && a=='a')sum1++;
                }
                System.out.println("No. of words starting with:" + a + " is " + i + "\n");
                s.close();
                sum=sum+i;
            }
            System.out.println("Total number of words:" + sum);
            System.out.println("Total number of sentences:" + sum1);
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


}

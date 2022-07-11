package fileoperate;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\liang\\OneDrive\\Desktop\\ff.txt");
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a sentence: ");
            myWriter.write(in.nextLine());
            myWriter.close();

            FileInputStream fis = new FileInputStream("C:\\Users\\liang\\OneDrive\\Desktop\\ff.txt");
            FileOutputStream fos = new FileOutputStream("C:\\Users\\liang\\OneDrive\\Desktop\\gg.txt");
            int b;
            while ((b=fis.read()) != -1) {//read returns the next byte of data, or -1 if the end of the file is reached
                System.out.println("The ascii of character read " + b
                        + " & character " + (char)b);
                fos.write(b);
            }
            in.close();
            fis.close();
            fos.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            //e.printStackTrace();
        }
    }
}

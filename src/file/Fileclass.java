package file;

import java.io.*;
import java.util.Scanner;

public class Fileclass {
    public static void main(String[] args)  {
        int cnt=0;
        try {
            File myObj = new File("C:\\Users\\liang\\OneDrive\\Desktop\\filename.txt");
            myObj.canRead();
            FileWriter fw = new FileWriter("C:\\Users\\liang\\OneDrive\\Desktop\\filename.txt");
            fw.write(" xxee.");
            fw.write(" xxee1");
            fw.write(" xxee2");
            fw.close();
            FileReader fr = new FileReader("C:\\Users\\liang\\OneDrive\\Desktop\\filename.txt");
            Scanner myReader = new Scanner(fr);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                cnt++;
            }
            System.out.println("lines: " + cnt);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
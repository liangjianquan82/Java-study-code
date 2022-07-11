package fileoperate;

import java.io.*;
import java.util.Scanner;

public class filepractise {
    static int count;
    public static void main(String[] args) {
        //Create tow files(filename.txt and filename1.txt)
        try {
            //File myObj = new File("filename.txt");
            File myObj = new File("C:\\Users\\liang\\OneDrive\\Desktop\\filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
                System.out.println(myObj.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            //File myObj = new File("filename.txt");
            File myObj = new File("C:\\Users\\liang\\OneDrive\\Desktop\\filename1.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
                System.out.println(myObj.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
//write content by user
        Scanner sc = new Scanner(System.in);
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\liang\\OneDrive\\Desktop\\filename.txt");
            System.out.println("Enter content :");
            String str = sc.next();
            myWriter.write(str);

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        sc.close();
        //copy filename.txt to filename1.txt
        //read filename.txt
        String data = null;
        try {
            File myObj = new File("C:\\Users\\liang\\OneDrive\\Desktop\\filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        //write filename1.txt
//        try {
//            FileWriter myWriter = new FileWriter("C:\\Users\\liang\\OneDrive\\Desktop\\filename1.txt");
//
//            myWriter.write(data);
//
//            myWriter.close();
//            System.out.println("Successfully wrote to the file.");
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }

        //printing a text file,
        // word by word,
        // counting the number of words


        try {

            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\liang\\OneDrive\\Desktop\\filename2.txt"));
            BufferedReader reader1 = new BufferedReader(new FileReader("C:\\Users\\liang\\OneDrive\\Desktop\\filename2.txt"));

            int sentences = 0;
            StringBuffer b = new StringBuffer();
            String str = null;
            String str1 = reader1.readLine();
            String[] all = str1.split("[!?.]");
            filepractise fp = new filepractise();
            //The word corresponding to the input letter in the query string,
            // count how many words there are
            for (int i = 1; i <= 26; i++) {
                char head = (char)(64+i);
                fp.String_pring_head_word(str1, head);
            }
            System.out.println("No. of words: " + count);

            //output sentences.
            for (int a = 0; a < all.length; a++) {
                System.out.println(all[a].trim());
            }
            while ((str = reader.readLine()) != null) {
                b.append(str);
                for (int j = 0; j < str.length(); j++) {
                    String d = Character.toString(str.charAt(j));
                    if (d.equals(".") || d.equals("!") || d.equals("?")) {
                        sentences++;

                    }
                }
            }

            System.out.println("No. of sentences: " + sentences);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    /**
     * The word corresponding to the input letter in the query string,
     * count how many words there are
     * @param str input string
     * @param head letter 'A'-'Z'
     */
    public void String_pring_head_word(String str, char head) {
        String[] words = str.split(" ");
        int acount = 0;
        System.out.print("starting with '" + head + "' : ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.toUpperCase().charAt(0) == head) {
                System.out.print(word + " ");
                acount++;
            }
        }
        System.out.println();
        this.count += acount;
        System.out.println("number of words with '" + head + "' : " + acount);
    }
}

package arraylistexercise;


import java.util.Scanner;

class NamevalidException extends RuntimeException {
    public NamevalidException(String message) {
        super(message);
    }
}

class PhoneNumberValidException extends RuntimeException {
    public PhoneNumberValidException(String message) {
        super(message);
    }
}

public class Exercise3_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {

            System.out.println("How many contacts do you want to enter? ");
            int nb = in.nextInt();
            phonenb = new String[nb];
            contactname = new String[nb];
            String na = "";
            String pn = "";
            for (int i = 0; i < nb; i++) {
                System.out.println("Enter contact name: ");
                na = in.next();

                if (!na.matches("^[a-zA-Z]*$")) {
                    throw new NamevalidException("Name had numbers or special characters .");
                } else {
                    contactname[i] = na;
                }
                System.out.println("Enter phone number: ");
                pn = in.next();
                if (pn.matches("\\d+") && pn.length() == 10) {
                    phonenb[i] = pn;
                } else {
                    throw new PhoneNumberValidException("Phone number not Valid!");
                }
                insert_sort(i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        in.close();
        printlist();

    }

    public static void printlist() {
        for (int i = 0; i < contactname.length; i++) {
            System.out.print("Contact name : " + contactname[i] + ",");
            System.out.print("Phone number : " + phonenb[i] + ".");
            System.out.println();

        }
    }

    public static void insert_sort(int index) {

        int n = index + 1;
        for (int i = 1; i < n; i++) {
            String tempname = contactname[i];
            int pos = 0;
            String tempphone = phonenb[i];
            for (int j = i - 1; j >= 0; j--) {
                if (contactname[j].compareTo(tempname) >= 0) {
                    contactname[j + 1] = contactname[j];
                    phonenb[j + 1] = phonenb[j];
                } else {
                    pos = j + 1;
                    break;
                }
            }
            contactname[pos] = tempname;
            phonenb[pos] = tempphone;
        }
    }

    public static String phonenb[];
    public static String contactname[];


}

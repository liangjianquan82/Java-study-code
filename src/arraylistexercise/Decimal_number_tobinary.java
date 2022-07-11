package arraylistexercise;

public class Decimal_number_tobinary {
    public static void main(String[] args) {
        System.out.println(Decimal_to_binary(30));
        System.out.println(Decimal_to_binary(31));
        System.out.println(Decimal_to_binary(32));
        System.out.println(Decimal_to_binary(59));
    }
    public static String Decimal_to_binary(int n){
        int ys = n%2;
        int s = n/2;
        String br = "";
        if(n>0) {
            if (ys == 0) {
                br= Decimal_to_binary(s)+"0";
            } else {
                br=  Decimal_to_binary(s)+"1";
            }
        }
        return br;
    }
}

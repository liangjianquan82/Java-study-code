package arraylistexercise;

public class Recursive_practice {
    public static void main(String[] args) {
        for(int i=3;i<6;i++){
            System.out.println(i + " prime_number : " + prime_from_teacher(i,2));
        }

    }

    public static boolean prime_from_teacher(int a,int b){
        if(a==b){
            return true;
        }
        if(a%b==0){
            return false;
        }
        return prime_from_teacher(a,b+1);
    }



}

package passwordcheck;

import java.util.Scanner;

public class PassCheckForT {
    String user;
    String pass;
    PassCheckForT(String user,String pass) {
        try {
            setter(user,pass);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public void setter(String user,String pass) throws Exception {
        boolean valid=true;
        int i,count;
        if(pass.contains(user))valid=false;
        if(pass.length()<8)valid=false;
        for(i=0,count =0;i<pass.length();i++) {
            if(Character.isUpperCase(pass.charAt(i))) count++;
        }
        if(count<1)valid=false;
        for(i=0,count =0;i<pass.length();i++) {
            if(Character.isDigit(pass.charAt(i))) count++;
        }
        if(count<2)valid=false;
        if(pass.matches("[A-Za-z0-9]+"))valid=false;
        if(!pass.matches("[A-Za-z0-9!@#$%&*_-~]+"))valid=false;
        if(valid==false)
            throw new Exception("\nInvalid Password!!!");
        else {
            this.user=user;
            this.pass=pass;
            System.out.println("\nPASSWORD IS VALID.\n" + toString());
        }
    }


    @Override
    public String toString() {
        return "PassCheck [user=" + user + ", pass=" + pass + "]";
    }
}


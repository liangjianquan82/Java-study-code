package exceptionpractice;

public class NameNotValidException extends Throwable {
    String name;

    public NameNotValidException(String name) {
        this.name = name;
    }
    public String toString(){
        String str = null;
        if(!this.name.matches("[a-zA-Z]+")){
            str="Student name contains numbers or special symbols.";
        }
        else{
            str = "";
        }
        return (str) ;
    }
}

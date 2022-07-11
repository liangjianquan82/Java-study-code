package exceptionpractice;

public class AgeNotWithinRangeException extends Exception{
    int age;
    public AgeNotWithinRangeException(int age) {
        this.age = age;
    }
    public String toString(){
        String str = null;
        if(this.age<15||this.age>21)
        {
            str = "Student age is out of range.";
        }
        else{
            str = "";
        }
        return (str) ;
    }
}

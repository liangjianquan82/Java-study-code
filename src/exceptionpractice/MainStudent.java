package exceptionpractice;

public class MainStudent {
    public static void main(String[] args) throws AgeNotWithinRangeException {
        Student st = new Student("ST001","Angle00",22,"class-020");
        try{
            throw new AgeNotWithinRangeException(st.getAge());
        }catch (AgeNotWithinRangeException e){

            System.out.println(e) ;
        }
        try{
            throw new NameNotValidException(st.getName());
        }catch (NameNotValidException e){

            System.out.println(e) ;
        }
    }
}

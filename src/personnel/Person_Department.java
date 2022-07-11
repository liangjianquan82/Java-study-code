package personnel;

public class Person_Department {
    public static void main(String[] args) {
        Department [] dp = new Department[3];
        Person [] ps = new Person[5];
        dp[0]= new Department("dp1","d_001");
        dp[1]= new Department("dp2","d_002");
        dp[2]= new Department("dp3","d_003");

        ps[0] = new Person("Alex1",25,"d_001");
        ps[1] = new Person("Da1",26,"d_003");
        ps[2] = new Person("Mechel1",30,"d_002");
        ps[3] = new Person("Eric1",52,"d_003");
        ps[4] = new Person("Eva1",40,"d_001");

        for(int i = 0;i<dp.length;i++){
            for(int j = 0;j<ps.length;j++){
                if(ps[j].getDept_no().equalsIgnoreCase(dp[i].getDept_no())){
                    System.out.print("Department name: "+dp[i].getName());
                    System.out.print(", Person name: "+ps[j].getName());
                    System.out.print(", Person age: "+ps[j].getAge());
                    System.out.println();
                }
            }
        }
    }

}

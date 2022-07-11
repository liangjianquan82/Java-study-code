package arraylistexercise;

public class ClassE1 {
    public static void main(String[] args) {
        Integer a[] =  {9,1,2,3,4,0,0,2,3,0};
       order_sort(a);
    }
    public static void order_sort(Integer a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
    }
}

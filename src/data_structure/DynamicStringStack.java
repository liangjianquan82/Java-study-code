package data_structure;

public class DynamicStringStack {
    int capacity=2;
    String s[]=new String[capacity];
    int top=0;
    boolean isfull(){
        if(top==capacity){
            return true;
        }
        else {
            return false;
        }
    }
    boolean isempty(){
        if(top<=0){
            return true;
        }
        else {
            return false;
        }
    }
    public void push(String value){//to add to top position
        if(isfull()){
            String temp[]=new String[capacity*2];
            for(int i=0;i<capacity;i++){
                temp[i] = s[i];
            }
            s = temp;
        }
        s[top] = value;
        top ++;
    }
    public void pop(){//to remove from top position
        if(!isempty()){//expanding stack
            top--;
            s[top] = "";
        }else System.out.println("Can't pop, Stack is empty.");
        if(top < capacity/4){//shrinking stack
            capacity/=2;
            String temp[] = new String[capacity];
            for(int i=0;i<capacity;i++){
                temp[i] = s[i];
            }
            s = temp;
        }
    }
    public void peek(){
        if(!isempty()) System.out.println(s[top-1]);
        else System.out.println("No data to show, Stack is empty.");
    }
    void show() {
        if(!isempty()) for(int i=0;i<capacity;i++)System.out.print(s[i]+" ");
        else System.out.println("No data to show, Stack is empty.");
    }
}

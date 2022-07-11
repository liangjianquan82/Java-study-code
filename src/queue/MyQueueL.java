package queue;

public class MyQueueL {
    int capacity = 4;
    int ints[] = new int[capacity];
    String strs[] = new String[capacity];
    int front=0;
    int rear=0;
    int current_size=0;
    public boolean isfull(){
        if(current_size==capacity){
            return true;
        }else{
            return false;
        }
    }
    public boolean isempty(){
        if(current_size<=0){
            return true;
        }else{
            return false;
        }
    }
    public void enqueue(int val,String strval){
        if (isfull()) {//expanding stack
            System.out.println("Queue is full.Can't enqueue.");
        }
        else{

           if(rear<capacity) {
               ints[rear] = val;
               strs[rear] = strval;
               rear++;
           }else{
               rear=0;
               ints[rear] = val;
               strs[rear] = strval;
               rear++;
           }
            current_size++;
        }
    }
    public void dequeue(){
        if (!isempty()) {
            if(front<capacity) {
                front++;
            }
            else{
                front = 0;
                front++;
            }
            current_size--;
        } else System.out.println("Queue is empty.Can't dequeue.");
    }
    public void size(){
        System.out.println("Size is "+ current_size+". Available space: "+(capacity-current_size));
    }
    public void showintqueue(){
        int backtofront = 0;
        if (!isempty())
            for (int i =0;i<current_size;i++) {
                if(i+front<capacity){
                    System.out.print(ints[(i+front)]+" ");
                }
                else{
                    System.out.print(ints[(backtofront)]+" ");
                    backtofront++;
                }

            }
        else System.out.println("No data to show, Stack is empty.");
    }
    public void showstrqueue(){
        int backtofront = 0;
        if (!isempty())
            for (int i =0;i<current_size;i++) {
                if(i+front<capacity){
                    System.out.print(strs[(i+front)]+" ");
                }
                else{
                    System.out.print(strs[(backtofront)]+" ");
                    backtofront++;
                }

            }
        else System.out.println("No data to show, Stack is empty.");
    }
    public void Beofre(String name){
        int backtofront = 0;
        int count=0;
        if (!isempty())
            for (int i =0;i<current_size;i++) {
                if(i+front<capacity){
                    //System.out.print(strs[(i+front)]+" ");
                    if(strs[(i+front)].equals(name)){
                        System.out.println(count +" clients are before you. ");
                        break;
                    }
                }
                else{
                    if(strs[(backtofront)].equals(name)){
                        System.out.println(count +" clients are before you. ");
                        break;
                    }
                    backtofront++;
                }
                if(count+1==current_size){
                    System.out.println("Entered name not found. ");
                    break;
                }
                count++;

            }

        else System.out.println("No data to show, Stack is empty.");
    }
}

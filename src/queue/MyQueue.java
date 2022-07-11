package queue;

public class MyQueue {
    int capacity = 4;
    int s[] = new int[capacity];
    int front=0;
    int rear=-1;
    int current_size = 0;
    public boolean isfull() {
        if (current_size == capacity) return true;
        else return false;
    }

    public boolean isempty() {
        if (current_size <= 0) return true;
        else return false;
    }

    public void enqueue(int val){
        if (isfull()) {//expanding stack
            System.out.println("Queue is full.Can't enqueue.");
        }
        else{
            rear = (rear+1)%capacity;
            s[rear] = val;
            current_size++;
        }
    }
    public void dequeue(){
        if (!isempty()) {
            front = (front+1)%capacity;
            current_size--;
        } else System.out.println("Can't dequeue.");
    }
    public void size(){
        System.out.println("Size id "+ current_size+"");
    }
    public void show(){
        if(!isempty()) for(int i=0;i<current_size;i++)
            System.out.print(s[(i+front)%capacity]+" ");
        else System.out.println("No data to show, Queue is empty.");
    }
}

package queue;

public class MainQueue {
    public static void main(String[] args) {
        MyQueueL mq = new MyQueueL();
        mq.enqueue(1,"");
        mq.enqueue(2,"");
        mq.enqueue(3,"");
        mq.enqueue(4,"");

//        mq.enqueue(6);
        mq.showintqueue();
        System.out.println();
        mq.dequeue();
        mq.showintqueue();
        mq.dequeue();
        System.out.println();
        mq.showintqueue();
        mq.enqueue(5,"");
        System.out.println();
        mq.showintqueue();
        mq.dequeue();
        System.out.println();
        mq.showintqueue();
        mq.enqueue(6,"");
        mq.enqueue(7,"");
        System.out.println();
        mq.showintqueue();
        mq.dequeue();
        System.out.println();
        mq.showintqueue();

    }
}

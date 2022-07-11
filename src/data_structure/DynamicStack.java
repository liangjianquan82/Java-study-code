package data_structure;

public class DynamicStack {
    int capacity = 2;
    int s[] = new int[capacity];
    int top = 0;

    public void push(int val) {//to add to top position
        if (isfull()) {//expanding stack
            int temp[] = new int[capacity * 2];
            for (int i = 0; i < capacity; i++) temp[i] = s[i];//copying elements
            capacity *= 2;
            s = temp;
        }
        s[top] = val;
        top++;
    }

    public void pop() {//to remove from top position
        if (!isempty()) {
            top--;
            s[top] = 0;
        } else System.out.println("Can't pop, Stack is empty.");
        if (top < capacity / 4) {//shrinking stack
            capacity /= 2;
            int temp[] = new int[capacity];
            for (int i = 0; i < capacity; i++) temp[i] = s[i];
            s = temp;
        }
    }

    public void peek() {//to display last value
        if (!isempty()) System.out.println(s[top - 1]);
        else System.out.println("No data to show, Stack is empty.");
    }

    public void show() {
        if (!isempty()) for (int i : s) System.out.print(i + " ");
        else System.out.println("No data to show, Stack is empty.");
    }

    public void search(int val) {
        //找到需要的值，
        int temp[] = new int[capacity];
        int tnb = 0;
        int i = 0;
        boolean find = false;
        for (i = top - 1; i >= 0; i--) {
            if (s[i] == val) {
                find = true;
                temp[tnb] = val * 2;// 将数值multiply 2
                pop();
                tnb++;
            } else {
                temp[tnb] = s[i];
                pop();
                tnb++;
            }
        }
        // 然后将stack其他值放回去
        //如果没有找到，stack的值直接放回去。
        if (!find) {
            System.out.println("Value not found.");
        }
        int tt = tnb - 1;
        for (; tt >= 0; tt--) {
            push(temp[tt]);
        }



    }

    public boolean isfull() {
        if (top == capacity) return true;
        else return false;
    }

    public boolean isempty() {
        if (top <= 0) return true;
        else return false;
    }
}

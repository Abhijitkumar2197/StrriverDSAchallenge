import java.util.*;

public class Queue {
    // Define the data members(if any) here.
    Stack<Integer> st1;
    Stack<Integer> st2;

    Queue() {
    st1 = new Stack();
    st2 = new Stack();
    }

    void enQueue(int val) {
        // Implement the enqueue() function.
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        st1.push(val);
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }

    }

    int deQueue() {
        // Implement the dequeue() function.
        if(st1.size() == 0) return -1;
        return st1.pop();
    }

    int peek() {
        // Implement the peek() function here.
        if(st1.size() == 0) return -1;
        return st1.peek();

    }

    boolean isEmpty() {
        // Implement the isEmpty() function here.
        return st1.isEmpty();
    }
}

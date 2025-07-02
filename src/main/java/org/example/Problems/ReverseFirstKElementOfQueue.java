package org.example.Problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElementOfQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(1);
        queue.add(7);
        queue.add(3);
        queue.add(9);
        queue.add(-5);
        queue.add(-1);
        System.out.println(reverseKElementOfQueue(queue, 5));
    }

    public static Queue<Integer> reverseKElementOfQueue(Queue<Integer> queue, int k){
        System.out.println(queue);
        //Ex: 5, 7, 1, 3, 9, -5, -1
        Stack<Integer> stack = new Stack<>();
        int poppedElement = 0;
        //pop k elements from queue and push into stack
        //queue: 3, 9, -5, -1
        //stack: 5, 7, 1 : from bottom to top
        while(poppedElement != k){
            stack.push(queue.poll());
            poppedElement++;
        }
        //pop from stack and push into queue
        //queue: 3, 9, -5, -1, 1, 7, 5
        //stack: empty
        while(!stack.empty()){
            queue.add(stack.peek());
            stack.pop();
        }
        //now pop and push n-k elements from queue
        //queue: 1, 7, 5, 3, 9, -5, -1
        int l = queue.size()-k;
        while(l != 0){
            queue.add(queue.poll());
            l--;
        }
        return queue;
    }
}

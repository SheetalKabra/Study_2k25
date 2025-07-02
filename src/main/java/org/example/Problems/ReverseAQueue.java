package org.example.Problems;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseAQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(1);
        queue.add(7);
        queue.add(3);
        queue.add(9);
        queue.add(-5);
        queue.add(-1);
        System.out.println(reverseAQueue(queue));
    }

    public static Queue<Integer> reverseAQueue(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }
        while(!stack.empty()){
            queue.add(stack.peek());
            stack.pop();
        }
        return queue;
    }
}

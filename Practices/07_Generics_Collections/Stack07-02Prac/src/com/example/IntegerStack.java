package com.example;

/*Program Use the Deque data structure to implement a stack to support push, pop and peek
operations.
 */
import java.util.ArrayDeque;
import java.util.Deque;

public class IntegerStack {

    private Deque<Integer> data = new ArrayDeque<Integer>();

    //Push() method implemented to  add an Integer to the stack
    //adds an element at the top of the stack
    public void push(Integer element) {
        data.addFirst(element);
    }

    //Pop() method implemented to delete an Integer from the top of the stack
    // removes an element from the top of the stack
    public Integer pop() {
        if (data.isEmpty()) {
            System.out.print("Stack is empty");
        }
        return data.removeFirst();
    }

    //Implemented the peek method()
    //retrieves or fetches the first element of the Stack or the element present at the top of the Stack
    public Integer peek() {
        return data.peekFirst();
    }

    //Override the toString() method
    public String toString() {
        return data.toString();
    }
    
    public static void main(String[] args) {
        //Instance of a stack class created
        IntegerStack stack = new IntegerStack();

        //Performs various operations on the stack by invoking various methods{push(), pop(),peek()}
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        System.out.println("After pushing 5 elements: "
                + stack);
        int element = stack.pop();
        System.out.println("Popped element = " + element);
        System.out.println("After popping 1 element : "
                + stack);
        int top = stack.peek();
        System.out.println("Peeked element = " + top);
        System.out.println("After peeking 1 element : "
                + stack);
    }

}

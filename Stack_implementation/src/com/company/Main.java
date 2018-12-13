package com.company;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Creating a Stack
        Stack<String> group8 = new Stack<>();

        // This pushes new items to the Stack
        group8.push("Catherine");
        group8.push("Elivin");
        group8.push("Moses");
        group8.push("Said");
        group8.push("Winstone");

        System.out.println("Stack => " + group8);
        System.out.println();

        // This Pops items from the Stack
        String nameAtTop = group8.pop();  // Throws EmptyStackException if the stack is empty
        System.out.println("Stack.pop() => " + nameAtTop);
        System.out.println("Current Stack => " + group8);
        System.out.println();

        // This gets the item at the top of the stack without removing it
        nameAtTop = group8.peek();
        System.out.println("Stack.peek() => " + nameAtTop);
        System.out.println("Current Stack => " + group8);

    }
}

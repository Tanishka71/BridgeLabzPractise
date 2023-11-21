package com.bridgelabz.DataStructure;

import java.util.Scanner;


public class Stack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomStack stack = new CustomStack();

        while (true) {
            System.out.println("Stack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display Stack");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int elementToPush = scanner.nextInt();
                    stack.push(elementToPush);
                    System.out.println("Element pushed to the stack.");
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.peek();
                    break;

                case 4:
                    stack.displayStack();
                    break;

                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

class CustomStack {
    private static final int MAX_SIZE = 10;
    private int top;
    private int[] stackArray;

    public CustomStack() {
        top = -1;
        stackArray = new int[MAX_SIZE];
    }

    public void push(int element) {
        if (top == MAX_SIZE - 1) {
            System.out.println("Stack overflow. Cannot push element.");
        } else {
            stackArray[++top] = element;
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop.");
        } else {
            System.out.println("Popped element: " + stackArray[top--]);
        }
    }

    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot peek.");
        } else {
            System.out.println("Peeked element: " + stackArray[top]);
        }
    }

    public void displayStack() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
}

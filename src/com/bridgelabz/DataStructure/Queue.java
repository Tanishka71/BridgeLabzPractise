package com.bridgelabz.DataStructure;
import java.util.Scanner;

public class Queue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomQueue queue = new CustomQueue();

        while (true) {
            System.out.println("Queue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display Queue");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to enqueue: ");
                    int elementToEnqueue = scanner.nextInt();
                    queue.enqueue(elementToEnqueue);
                    System.out.println("Element enqueued to the queue.");
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.peek();
                    break;

                case 4:
                    queue.displayQueue();
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

class CustomQueue {
    private static final int MAX_SIZE = 10;
    private int front, rear;
    private int[] queueArray;

    public CustomQueue() {
        front = rear = -1;
        queueArray = new int[MAX_SIZE];
    }

    public void enqueue(int element) {
        if (rear == MAX_SIZE - 1) {
            System.out.println("Queue overflow. Cannot enqueue element.");
        } else {
            if (front == -1) {
                front = 0;
            }
            queueArray[++rear] = element;
        }
    }

    public void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty. Cannot dequeue.");
        } else {
            System.out.println("Dequeued element: " + queueArray[front++]);
            if (front > rear) {
                front = rear = -1; // Reset front and rear when the last element is dequeued
            }
        }
    }

    public void peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty. Cannot peek.");
        } else {
            System.out.println("Peeked element: " + queueArray[front]);
        }
    }

    public void displayQueue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queueArray[i] + " ");
            }
            System.out.println();
        }
    }
}

package com.bridgelabz.DataStructure;

import java.util.Scanner;

public class LinkedList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomLinkedList linkedList = new CustomLinkedList();

        while (true) {
            System.out.println("Linked List Operations:");
            System.out.println("1. Insert at Front");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Specific Position");
            System.out.println("4. Delete from Front");
            System.out.println("5. Delete from End");
            System.out.println("6. Delete from Specific Position");
            System.out.println("7. Display Linked List");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert at the front: ");
                    int elementToFront = scanner.nextInt();
                    linkedList.insertAtFront(elementToFront);
                    System.out.println("Element inserted at the front.");
                    break;

                case 2:
                    System.out.print("Enter the element to insert at the end: ");
                    int elementToEnd = scanner.nextInt();
                    linkedList.insertAtEnd(elementToEnd);
                    System.out.println("Element inserted at the end.");
                    break;

                case 3:
                    System.out.print("Enter the position to insert at: ");
                    int position = scanner.nextInt();
                    System.out.print("Enter the element to insert at position " + position + ": ");
                    int elementAtPosition = scanner.nextInt();
                    linkedList.insertAtPosition(position, elementAtPosition);
                    System.out.println("Element inserted at position " + position + ".");
                    break;

                case 4:
                    linkedList.deleteFromFront();
                    break;

                case 5:
                    linkedList.deleteFromEnd();
                    break;

                case 6:
                    System.out.print("Enter the position to delete from: ");
                    int deletePosition = scanner.nextInt();
                    linkedList.deleteFromPosition(deletePosition);
                    System.out.println("Element deleted from position " + deletePosition + ".");
                    break;

                case 7:
                    linkedList.displayList();
                    break;

                case 8:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CustomLinkedList {
    private Node head;

    public CustomLinkedList() {
        this.head = null;
    }

    public void insertAtFront(int element) {
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void insertAtPosition(int position, int element) {
        Node newNode = new Node(element);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Invalid position. Element not inserted.");
        } else {
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void deleteFromFront() {
        if (head == null) {
            System.out.println("Linked list is empty. Cannot delete from front.");
        } else {
            head = head.next;
        }
    }

    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("Linked list is empty. Cannot delete from end.");
        } else if (head.next == null) {
            head = null;
        } else {
            Node current = head;
            Node previous = null;

            while (current.next != null) {
                previous = current;
                current = current.next;
            }

            previous.next = null;
        }
    }

    public void deleteFromPosition(int position) {
        if (head == null) {
            System.out.println("Linked list is empty. Cannot delete from position.");
        } else if (position == 1) {
            head = head.next;
        } else {
            Node current = head;
            Node previous = null;

            for (int i = 1; i < position && current != null; i++) {
                previous = current;
                current = current.next;
            }

            if (current == null) {
                System.out.println("Invalid position. Element not deleted.");
            } else {
                previous.next = current.next;
            }
        }
    }

    public void displayList() {
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

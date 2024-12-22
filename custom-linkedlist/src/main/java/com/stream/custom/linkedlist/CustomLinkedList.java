package com.stream.custom.linkedlist;

public class CustomLinkedList {
    private Node head;

    // Method to add an element to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);// |data->NULL|
        if (head == null) {
            head = newNode; // head-> |data->NULL|
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            //now temp is pointing to existing last Node is given list.
            temp.next = newNode;// now the newly created Node has become Last Node of existing list
        }
    }
    // Method to add an element at a specific position
    public void addAtPosition(int position, int data) {
        Node newNode = new Node(data);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            for (int i = 0; i < position - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Position out of bounds");
                return;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    // Add a node at the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Add a node at the end of the list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Count the total number of nodes in the list
    public int countNodes() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }





    // Reverse the linked list
    public void reverseList() {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next; // Store next node
            current.next = prev; // Reverse the current node's pointer
            prev = current;      // Move pointers one step ahead
            current = next;
        }

        head = prev; // Update head to the last node
    }

    // Method to remove an element by value
    public void remove(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Element not found");
        } else {
            temp.next = temp.next.next;
        }
    }
    // Method to display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Method to create a cycle for testing
    public void createCycle() {
        if (head == null) {
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Connecting the last node to the second node to create a cycle
        temp.next = head.next;
    }

    // Method to detect a cycle using Floyd's Cycle Detection Algorithm
    public boolean hasCycle() {
        if (head == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // Move slow pointer by one step
            fast = fast.next.next;   // Move fast pointer by two steps

            // If slow and fast pointers meet, a cycle is detected
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}

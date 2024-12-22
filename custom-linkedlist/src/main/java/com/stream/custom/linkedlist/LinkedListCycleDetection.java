package com.stream.custom.linkedlist;

public class LinkedListCycleDetection {

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        // Add elements to the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Display the list
        System.out.println("Initial LinkedList:");
        list.display();

        // Check for a cycle before creating one
        System.out.println("Does the LinkedList have a cycle? " + list.hasCycle());

        // Create a cycle in the list
        list.createCycle();
        System.out.println("Cycle created!");

        // Check for a cycle after creating one
        System.out.println("Does the LinkedList have a cycle? " + list.hasCycle());



    }
}

package com.stream.custom.linkedlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomLinkedlistApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomLinkedlistApplication.class, args);

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
		//list.createCycle();
		//System.out.println("Cycle created!");

		// Check for a cycle after creating one
		System.out.println("Does the LinkedList have a cycle? " + list.hasCycle());

		// Add nodes at the beginning
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		System.out.println("After adding nodes at the beginning:");
		list.display();

		// Add nodes at the end
		list.addLast(40);
		list.addLast(50);
		System.out.println("After adding nodes at the end:");
		list.display();

		// Count the total number of nodes
		int count = list.countNodes();
		System.out.println("Total number of nodes: " + count);

		// Reverse the linked list
		list.reverseList();
		System.out.println("After reversing the list:");
		list.display();
	}

}

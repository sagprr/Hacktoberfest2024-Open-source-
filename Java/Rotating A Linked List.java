// Java program to rotate a 
// linked list counter clock wise
import java.util.*;

class GFG{

// Link list node 
static class Node 
{
	int data;
	Node next;
};
static Node head = null;

// This function rotates a linked list
// counter-clockwise and updates the
// head. The function assumes that k is
// smaller than size of linked list.
static void rotate( int k)
{
	if (k == 0)
		return;

	// Let us understand the below
	// code for example k = 4 and
	// list = 10.20.30.40.50.60.
	Node current = head;

	// Traverse till the end.
	while (current.next != null)
		current = current.next;

	current.next = head;
	current = head;

	// Traverse the linked list to 
	// k-1 position which will be 
	// last element for rotated array.
	for (int i = 0; i < k - 1; i++)
		current = current.next;

	// Update the head_ref and last 
	// element pointer to null
	head = current.next;
	current.next = null;
}

// UTILITY FUNCTIONS 
// Function to push a node 
static void push(int new_data)
{ 
	// Allocate node 
	Node new_node = new Node();

	// Put in the data 
	new_node.data = new_data;

	// Link the old list of the 
	// new node 
	new_node.next = head;

	// Move the head to point to 
	// the new node
	head = new_node;
}

// Function to print linked list 
static void printList(Node node)
{
	while (node != null)
	{
		System.out.print(node.data + " ");
		node = node.next;
	}
}

// Driver code
public static void main(String[] args)
{
	// Start with the empty list
	// Create a list 10.20.30.40.50.60
	for (int i = 60; i > 0; i -= 10)
		push(i);

	System.out.print(
		"Given linked list ");
	printList(head);
	rotate( 4);

	System.out.print(
		"Rotated Linked list ");
	printList(head);
}
}
// This code is contributed by gauravrajput1 

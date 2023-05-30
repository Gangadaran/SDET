package week4;

public class LinkedLies {
	//Sure, here's an implementation of a singly linked list in Java:

	
	class Node {
	    int value;
	    Node next;
	    
	    public Node(int value) {
	        this.value = value;
	        this.next = null;
	    }
	}

	class LinkedList {
	    Node head;
	    
	    public LinkedList() {
	        this.head = null;
	    }
	    
	    public void append(int value) {
	        Node new_node = new Node(value);
	        if (this.head == null) {
	            this.head = new_node;
	        } else {
	            Node current_node = this.head;
	            while (current_node.next != null) {
	                current_node = current_node.next;
	            }
	            current_node.next = new_node;
	        }
	    }
	    
	    public void insert(int value, int index) {
	        if (index == 0) {
	            Node new_node = new Node(value);
	            new_node.next = this.head;
	            this.head = new_node;
	        } else {
	            Node current_node = this.head;
	            for (int i = 0; i < index - 1; i++) {
	                if (current_node == null) {
	                    throw new IndexOutOfBoundsException("Index out of range");
	                }
	                current_node = current_node.next;
	            }
	            Node new_node = new Node(value);
	            new_node.next = current_node.next;
	            current_node.next = new_node;
	        }
	    }
	    
	    public void remove(int value) {
	        if (this.head == null) {
	            return;
	        }
	        if (this.head.value == value) {
	            this.head = this.head.next;
	            return;
	        }
	        Node current_node = this.head;
	        while (current_node.next != null) {
	            if (current_node.next.value == value) {
	                current_node.next = current_node.next.next;
	                return;
	            }
	            current_node = current_node.next;
	        }
	    }
	    
	    public boolean search(int value) {
	        Node current_node = this.head;
	        while (current_node != null) {
	            if (current_node.value == value) {
	                return true;
	            }
	            current_node = current_node.next;
	        }
	        return false;
	    }
	    
	    public void printList() {
	        Node current_node = this.head;
	        while (current_node != null) {
	            System.out.print(current_node.value + " ");
	            current_node = current_node.next;
	        }
	        System.out.println();
	    }
	}
	

//	This implementation includes the same basic operations as the Python implementation: `append` to add a new node at the end of the list, 
//	`insert` to add a new node at a specified index, `remove` to remove a node with a given value, `search` to check if a value is in the list, and 
//	`printList` to print the list. Note that the syntax and naming conventions are different in Java compared to Python.
}

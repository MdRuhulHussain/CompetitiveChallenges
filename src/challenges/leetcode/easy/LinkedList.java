package challenges.leetcode.easy;

/*
 * Given the head of a singly linked list, return the middle node of the linked list.
 * If there are two middle nodes, return the second middle node.
 * Example 1: Input: head = [1,2,3,4,5]; Output: [3,4,5]
 * Explanation: The middle node of the list is node 3.
 * Example 2: Input: head = [1,2,3,4,5,6]; Output: [4,5,6]
 * Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 */
public class LinkedList {
	
	Node head;
	
	class Node {
		int data;
		Node next;
		
		Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	
	public void push(int newData) {
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}
	
	public void printList(Node head) {
		while(head != null) {
			System.out.print(head.data+"->");
			head = head.next;
		}
		System.out.println();
	}
	
	public Node middleNode(Node head) {
		Node fastPtr = head;
		while(fastPtr != null && fastPtr.next != null) {
			head = head.next;
			fastPtr = fastPtr.next.next;
		}
		return head;
	}
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.push(5);
		ll.push(4);
		ll.push(3);
		ll.push(2);
		ll.push(1);
		
		ll.printList(ll.head);
		
		ll.printList(ll.middleNode(ll.head));
	}

}

package challenges.leetcode.medium;

/*
 * You are given the head of a singly linked-list. The list can be represented as:
 * L0 → L1 → … → Ln - 1 → Ln
 * Reorder the list to be on the following form:
 * L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
 * You may not modify the values in the list's nodes. Only nodes themselves may be changed.
 * Example 1: Input: head = [1,2,3,4]; Output: [1,4,2,3]
 * Example 2: Input: head = [1,2,3,4,5]; Output: [1,5,2,4,3]
 */
public class ReOrderList {
	
	Node head;
	
	public class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void pushAtBeg(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		
	}
	
	public static void printList(Node head) {
		while(head != null) {
			System.out.print(head.data+"->");
			head = head.next;
		}
			
	}
	
	public static void main(String args[]) {
		ReOrderList ll = new ReOrderList();
		ll.pushAtBeg(7);
		ll.pushAtBeg(6);
		ll.pushAtBeg(5);
		ll.pushAtBeg(4);
		ll.pushAtBeg(3);
		ll.pushAtBeg(2);
		ll.pushAtBeg(1);
		
//		ll.printList(ll.head);
		reOrderList(ll.head);
	}
	
	public static void reOrderList(Node head) {
		Node fastPtr = head;
		Node slow = head;
		while(fastPtr != null && fastPtr.next != null) {
			slow = slow.next;
			fastPtr = fastPtr.next.next;
		}
		Node rev = reverse(slow.next);
		slow.next = null;
		Node curr = head;
		while(curr != null && rev != null) {
			Node temp = curr.next;
			curr.next = rev;
			rev = rev.next;
			curr.next.next = temp;
			curr = curr.next.next;	
		}
		printList(head);
		
	}
	
	public static Node reverse(Node head) {
		Node prev = null, curr = head, next = null;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		return head;
	}

}

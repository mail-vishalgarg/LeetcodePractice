package LinkedList;

class Node{
		int data;
		public Node next;
		public Node(int data){
			this.data = data;
			this.next = null;
		}
		public static String getListString(Node n){
			Node current = n;
			String res = "";
			while (current != null){
				res = res + current.data + " ";
				current = current.next;
			}
			return res;
		}
	}

public class ReverseLinkedList {
	public static Node reverseList(Node head){
		if (head == null || head.next == null)
			return head;
		Node c1 = head;
		Node c2= c1.next;
		Node c3= c2.next;
		c1.next = null;
		
		while (c2 != null){
			c2.next = c1;
			c1 = c2;
			c2 = c3;
			c3 = (c3 == null) ? null:c3.next;
		}
		return c1;
	}
	
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		
		Node list = new Node(0);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		System.out.println(Node.getListString(n1));
		System.out.println(Node.getListString(reverseList(n1)));
		
	}
}

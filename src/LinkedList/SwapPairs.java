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
		while(current.next != null){
			res = res + current.data  + " ";
			current = current.next;
		}
		return res;
	}
}

public class SwapPairs {
	public static String swapPair_1(Node p){
		Node q, temp, start;
		start = p.next; //this will be the head of the new swaped Linked list
		while(true){
			q = p.next;
			temp = q.next;
			q.next= p;
			if (temp == null || temp.next == null) {
				p.next = null;
				break;
			}
			p.next = temp.next;
			p = temp;
		}
		String res = "";
		while ( start != null){
			res = res +start.data + " ";
			start = start.next;
		}
		return res;
		
	}
	public static void main(String[] args){
		Node a1 = new Node(1);
		Node a2 = new Node(2);
		Node a3 = new Node(3);
		Node a4 = new Node(4);
		
		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		
		System.out.println(Node.getListString(a1));
		
		System.out.println(swapPair_1(a1));
	}
}

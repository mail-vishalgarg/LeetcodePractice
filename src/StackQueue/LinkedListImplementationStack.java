package StackQueue;

import org.omg.CORBA.FREE_MEM;

/** Below is the linkedlist implementation of statck
 * @author vishgarg
 *
 */
class Node{
	int data;
	public Node next;
	public Node(int data){
		this.data = data;
		this.next = null;
	}
}
public class LinkedListImplementationStack {
	Node top;
	public void push(int data){
		//Push the node at the beginning and here 'top' is like 'head' in linked list
		Node newNode = new Node(data);
		newNode.data = data;
		newNode.next = top;
		top = newNode;
	}
	
	public void pop(){
		Node temp;
		if (top == null){
			System.out.println("Linked list empty, No data to pop");
			return;
		}
		temp = top;
		top = top.next;
	}
	
	public void print(){
		Node current = top;
		while(current != null){
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public int peek(){
		if (top == null){
			return -1;
		}
		return top.data;
	}
	
	public boolean isEmpty(){
		if (top == null){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		LinkedListImplementationStack stack = new LinkedListImplementationStack();
		System.out.println("Is it empty:" + stack.isEmpty());
		for (int i = 1; i<=10; i++){
			stack.push(i * 10);
		}
		stack.pop();
		stack.print();
		System.out.println("TOP: " + stack.peek());
		System.out.println("Is it empty:" + stack.isEmpty());
	}

}

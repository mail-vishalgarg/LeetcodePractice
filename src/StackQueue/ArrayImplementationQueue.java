package StackQueue;

import java.util.Arrays;
/*
 * We can do four operations in Queue;
 * isEmpty()
 * enqueue() - to insert an element
 * dequeue() - to remove an element
 * front() - return front element of the queue
 */

public class ArrayImplementationQueue {
	public static int[] arr = new int[10];
	public static int front = -1;
	public static int rear = -1;
	
	public static boolean isEmpty(){
		if (front == -1 && rear == -1)
			return true;
		return false;
	}
	
	public static void enqueue(int data){
		if (isEmpty()){
			front = 0;
			rear = 0;
		}else {
			rear++;
		}
		arr[rear] = data;
	}
	
	public static void dequeue(){
		if (isEmpty())
			return;
		else if (front == rear){
			front = -1;
			rear = -1;
		}else {
			front++;
		}
		System.out.println("Dequeue Element: "  + arr[front - 1]);
		arr[front -1] = 0;
	}
	
	public static int front(){
		if (front == -1)
			return -1;
		return arr[front];
	}
	public static void main(String[] args) {
		System.out.println("is it Empty:" + isEmpty());
		for (int i = 1; i<10; i++){
			enqueue(i * 10);
		}
		System.out.println("FRONT: " + front);
		System.out.println("After Enqueue:" +Arrays.toString(arr));
		System.out.println("FRONT: " + front);
		dequeue();
		System.out.println("FRONT: " + front);
		System.out.println("After dequeue:"+Arrays.toString(arr));
		System.out.println("is it Empty:" + isEmpty());
		System.out.println("Front:" + front);
	}

}

package StackQueue;

import java.util.Arrays;

/*We have four operations for stack
1) push 
2)pop
3) top
4) IsEmpty
There are two ways to implement Stack and here we will implement stack using Array*/

public class ArrayImplementionStack {
	public static int[] arr = new int[10];
	public static int top = -1;
	
	public static void push(int x){
		if (top == Integer.MAX_VALUE -1){
			System.out.println("Error: overflow");
			return;
		}
		arr[++top] = x;  //Here first we increment top and the assign x to the array
	}
	
	public static void pop(){
		if (top == -1){
			System.out.println("No element to pop");
			return;
		}
		top--;
	}

	public static int top(){
		return arr[top];
	}
	
	public static boolean isEmpty(){
		if(top == -1){
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Is it empty:" + isEmpty());
		push(10);
		System.out.println("TOP: " +top());
		push(12);
		pop();
		push(16);
		System.out.println("TOP:" + top());
		System.out.println(Arrays.toString(arr));
	}
}

package com.dp.codelab.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Program {

	public static void main(String[] args) {

		Vector<String> vecotor = new Vector<>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		MyStack stack = new MyStack();
		stack.push(3);
		stack.push(4);
		stack.push(42);
		stack.push(43);
		stack.display();
		stack.pop();
		stack.display();
	}
	
}


class MyStack{
	int[] arr ;
	int top = -1;
	public MyStack() {
		arr = new int[5];
	}
	void push(int x){
		if(isFull()){
			System.out.println("stack is full");
		}
		arr[++top]=x;
	}
	int  pop(){
		if(isEmpty()){
			System.out.println("empty");
			
		}
		return arr[top--];
	}
	private boolean isEmpty() {
		if(top == -1){
			return true;
		}
		return false;
	}
	private boolean isFull() {
		if(top == arr.length-1){
			return true;
		}
		return false;
	}
	void display(){
		for(int i=0;i<=top;i++){
			System.out.print(" "+arr[i]);
		}
		System.out.println();
	}
	
}
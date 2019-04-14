package com.himanshu.stack;

public class StackUsingArray<T> {
	
	Object[] ArrayStack;
	int size;
	int top;
	
	public StackUsingArray(int size) {
		this.size = size;
		ArrayStack = new Object[size];
		top = -1;
	}
	
	public void push(T t){
		if(isFull()){
			System.out.println("Stack is full");
			return;
		}else{
			top++;
			ArrayStack[top] = t;
		}
	}
	
	public T pop(){
		if(isEmpty()){
			System.out.println("Stack is empty");
		}
		T t = (T)ArrayStack[top];
		top--;
		return t;
	}
	
	public boolean isFull(){
		return top == size-1;
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
}

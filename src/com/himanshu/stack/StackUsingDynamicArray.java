package com.himanshu.stack;

import java.util.Arrays;

public class StackUsingDynamicArray<T> {

	Object[] arrayStack;
	int size;

	int top;
	
	public StackUsingDynamicArray(int size) {
		this.size = size;
		arrayStack = new Object[size];
		top = -1;
	}

	public void push(T t){
		ensureSize(top+2);
		top++;
		arrayStack[top] = t;
	}
	
	public T pop(){
		if(isEmpty()){
			System.out.println("Stack is empty");
		}
		T t = (T)arrayStack[top];
		top--;
		return t;
	}
	private void ensureSize(int minCapacity){
		int oldCapacity = getSize();
		
		if(oldCapacity<minCapacity){
			int newCapacity = oldCapacity * 2;
			if(newCapacity<minCapacity)
				newCapacity = minCapacity;
			arrayStack = Arrays.copyOf(arrayStack, newCapacity);
		}
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public int getSize(){
		return arrayStack.length;
	}
}

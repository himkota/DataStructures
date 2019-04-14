package com.himanshu.stack;

import com.himanshu.linkedlist.SllNode;

public class StackUsingLL<T> {
	SllNode top;
	
	public StackUsingLL() {
		top = null;
	}
	
	public void push(T value){
		SllNode<T> newNode = new SllNode<T>(value, null);
		if(top==null){
			top = newNode;
		}else{
			newNode.nextNode = top;
			top = newNode;
		}
	}
	
	public T pop(){
		T t = null;
		if(top != null){
			t = (T)top.value;
			top = top.nextNode;
		}else{
			System.out.println("Stack is empty");
		}
		return t;
	}
	
	public boolean isEmpty(){
		return top == null;
	}

}

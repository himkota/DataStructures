package com.himanshu.linkedlist;

public class DllNode<T> {
	T value;
	DllNode<T> next;
	DllNode<T> previous;
	
	public DllNode(T t){
		this.value = t;
		this.next = null;
		this.previous = null;
	}
}

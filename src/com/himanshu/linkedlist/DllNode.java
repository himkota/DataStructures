package com.himanshu.linkedlist;

public class DllNode<T> {
	public T value;
	public DllNode<T> next;
	public DllNode<T> previous;
	
	public DllNode(T t){
		this.value = t;
		this.next = null;
		this.previous = null;
	}
}

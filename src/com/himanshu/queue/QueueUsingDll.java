package com.himanshu.queue;

import com.himanshu.linkedlist.DllNode;

public class QueueUsingDll<T> {
	DllNode<T> front;
	DllNode<T> rear;
	
	public QueueUsingDll() {
		front = null;
		rear = null;
	}
	
	public void enQueue(T t){
		DllNode<T> newNode = new DllNode<>(t);
		if(rear == null){
			rear = newNode;
			front = newNode;
		}else{
			newNode.next = null;
			newNode.previous = rear;
			rear.next = newNode;
			rear = newNode;
		}
	}
	
	public T deQueue(){
		if(rear == null || front == null){
			System.out.println("Queue is empty");
			return null;
		}else{
			T value = (T)front.value;
			front = front.next;
			rear.previous = null;
			return value;
		}
	}
}

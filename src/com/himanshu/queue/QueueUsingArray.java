package com.himanshu.queue;

public class QueueUsingArray<T> {
	
	int size;
	int front;
	int rear;
	
	Object[] queueArray;
	
	public QueueUsingArray(int size) {
		this.size = size;
		this.front = -1;
		this.rear = -1;
		queueArray = new Object[size];
	}
	
	public void enQueue(T t){
		if(isFull()){
			System.out.println("Queue is full");
			return;
		}
		rear = rear +1;
		queueArray[rear] = t;
		if(front==-1){
			front++;
		}
	}
	
	public T deQueue(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return null;
		}
		T t = (T)queueArray[front];
		front++;
		return t;
	}
	
	public boolean isFull(){
		return rear == size-1;
	}
	
	public boolean isEmpty(){
		return front == -1 || front>rear ;
	}
}

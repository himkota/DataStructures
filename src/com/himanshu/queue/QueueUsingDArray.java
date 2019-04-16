package com.himanshu.queue;

import java.util.Arrays;

public class QueueUsingDArray<T> {
	
	int size;
	int front;
	int rear;
	
	Object[] queueArray;
	
	public QueueUsingDArray(int size) {
		this.size = size;
		this.front = -1;
		this.rear = -1;
		queueArray = new Object[1];
	}
	
	public void ensureSize(){
		int minCapacity = rear + 2;
		int oldCapacity = getSize();
		int newCapacity;
		if(minCapacity> oldCapacity){
			newCapacity = oldCapacity * 2;
			if(newCapacity<minCapacity)
				newCapacity = minCapacity;
			queueArray = Arrays.copyOf(queueArray, newCapacity);
		}
	}
	public void enQueue(T t){
		ensureSize();
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
	
	public boolean isEmpty(){
		return front == -1 || front>rear ;
	}
	
	public int getSize(){
		return queueArray.length;
	}
	
}

package com.himanshu.queue;

public class QueueDemo {

	public static void main(String[] args) {
		QueueUsingArray<Integer> qua = new QueueUsingArray<Integer>(5);
		qua.enQueue(1);
		qua.enQueue(2);
		qua.enQueue(3);
		while(!qua.isEmpty()){
			System.out.println(qua.deQueue());
		}
		System.out.println("Using dynamic array");
		QueueUsingDArray<Integer> quda = new QueueUsingDArray<Integer>(2);
		quda.enQueue(1);
		quda.enQueue(2);
		quda.enQueue(3);
		while(!quda.isEmpty()){
			System.out.println(quda.deQueue());
		}
		System.out.println("using dll");
		QueueUsingDll<Integer> qdll = new QueueUsingDll<Integer>();
		qdll.enQueue(1);
		qdll.enQueue(23);
		System.out.println(qdll.deQueue());
	}
	
}

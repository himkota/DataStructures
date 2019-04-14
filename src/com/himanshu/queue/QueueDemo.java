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

	}

}

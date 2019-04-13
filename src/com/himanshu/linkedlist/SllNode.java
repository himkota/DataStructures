package com.himanshu.linkedlist;

public class SllNode<T> {
	T value;
	SllNode<T> nextNode;
	public SllNode(T t , SllNode<T> nextNode) {
		this.value = t;
		this.nextNode = nextNode;
	}
}

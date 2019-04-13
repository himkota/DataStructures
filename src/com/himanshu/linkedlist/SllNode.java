package com.himanshu.linkedlist;

public class SllNode<T> {
	public T value;
	public SllNode<T> nextNode;
	public SllNode(T t , SllNode<T> nextNode) {
		this.value = t;
		this.nextNode = nextNode;
	}
}

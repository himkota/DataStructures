package com.himanshu.linkedlist;

public class DoubleLinkedList<T> {
	
	DllNode<T> headNode;
	
	public DoubleLinkedList() {
		this.headNode = null;
	}
	
	public void add(T t){
		DllNode<T> newNode = new DllNode<>(t);
		if(null == headNode){
			headNode = newNode;
		}
		else{
			newNode.next = headNode;
			headNode.previous = newNode;
			headNode = newNode;
		}
	}
	
	public void display(){
		DllNode<T> node = headNode;
		while(node != null){
			System.out.println(node.value);
			node = node.next;
		}
	}
	
	public void delete(){
		headNode = headNode.next;
	}

}

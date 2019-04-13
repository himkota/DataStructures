package com.himanshu.linkedlist;

public class SingleLinkedList<T> {
	
	SllNode<T> headNode;
	
	public SingleLinkedList() {
		headNode = null;
	}
	
	public T getValue(int index){
		return null;
	}
	
	public void add(T t){
		SllNode<T> newNode = new SllNode<T>(t, null);
		if(null == headNode){
			headNode = newNode;
		}else {
			newNode.nextNode= headNode;
			headNode = newNode;
		}
	}
	
	public void deleteFirstElement(){
		headNode = headNode.nextNode;
	}
	
	public void display(){
		SllNode<T> node = headNode;
		while(null != node){
			System.out.println(node.value);
			node = node.nextNode;
		}
	}
	
}

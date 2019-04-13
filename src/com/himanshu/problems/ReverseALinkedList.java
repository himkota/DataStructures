package com.himanshu.problems;

import java.util.LinkedList;

public class ReverseALinkedList {
	
	static Node head;
	
	static class Node{
		int value;
		Node next;
		Node(int v){
			this.value = v;
			next = null;
		}
	}
	
	public static void display(Node n){
		while(n !=null){
			System.out.print(n.value + "\t");
			n = n.next;
		}
		System.out.println();
	}
	
	public static Node reverse(Node node){
		Node prev = null;
		Node next = null;
		Node curr = node;//head
		
		while(curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		node = prev;
		return node;
	}
	
	public static void main(String[] args) {
		ReverseALinkedList input = new ReverseALinkedList();
		input.head = new Node(1);
		input.head.next = new Node(2);
		input.head.next.next = new Node(3);
		input.head.next.next.next = new Node(4);
		input.head.next.next.next.next = new Node(5);
		System.out.println("before reverse");
		display(head);
		System.out.println("after reverse");
		Node n = reverse(head);
		display(n);
	}

}

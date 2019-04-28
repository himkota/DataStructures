package com.himanshu.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
int size;
AdjacentList[] array;

public BreadthFirstSearch(int size) {
	this.size = size;
	array = new AdjacentList[this.size];
	for(int i =0; i< this.size;i++){
		array[i] = new AdjacentList();
		array[i].head = null;
	}
}

public void add(int src ,int dest){
	Node n = new Node(dest, null);
	n.next = array[src].head;
	array[src].head = n;
}

public void BfSearch(int start){
	Boolean[] visited = new Boolean[size];
	for(int i =0; i< this.size;i++){
		visited[i] = false;
	}
	
	Queue<Integer> st = new LinkedList<Integer>();
	st.add(start);
	while(!st.isEmpty()){
		int n = st.poll();
		System.out.println(" visited : " + n);
		visited[n] = true;
		Node head = array[n].head;
		while(head !=null){
			if(!visited[head.value]){
				st.add(head.value);
				visited[head.value] = true;
			}else{
				head= head.next;
			}
		}
	}
}
}

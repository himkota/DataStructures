package com.himanshu.graph;

import java.util.Stack;

public class DepthFirstSearchClass {
int size;
AdjacentList[] array;
	public DepthFirstSearchClass(int size) {
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
	
	public void search(int start){
		Boolean[] visited = new Boolean[size];
		for(int i =0; i< this.size;i++){
			visited[i] = false;
		}
		
		Stack<Integer> st = new Stack<Integer>();
		st.push(start);
		while(!st.isEmpty()){
			int n = st.pop();
			st.push(n);
			visited[n] = true;
			Node head = array[n].head;
			boolean isDone = true;
			while(head !=null){
				if(!visited[head.value]){
					st.push(head.value);
					visited[head.value] = true;
					isDone = false;
					break;
				}else{
					head= head.next;
				}
			}
			if(isDone){
				int out = st.pop();
				System.out.println(" visited : " + out);
			}
		}
	}

}

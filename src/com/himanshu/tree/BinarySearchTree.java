package com.himanshu.tree;

public class BinarySearchTree {
	
	public Node root;
	
	public BinarySearchTree() {
		root = null;
	}

	public void add(Node start , Node newNode){
		if(root == null){
			root = newNode;
			return;
		}
		if(start.value < newNode.value){
			if(start.right==null){
				start.right = newNode;
			}
			add(start.right,newNode);
		}
		if(start.value > newNode.value){
			if(start.left == null)
				start.left = newNode;
			add(start.left,newNode);
		}
	}
	
	public void searchNode(int value,Node root){
		if(root == null){
			System.out.println("the value does not exist");
			return;
		}
		
		if(root.value == value){
			System.out.println("the value was found ");
			return;
		}
		
		if(root.value > value){
			searchNode(value,root.left);
		}
		
		if(root.value < value){
			searchNode(value,root.right);
		}
		
		
	}
}

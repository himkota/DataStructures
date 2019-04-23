package com.himanshu.tree;

public class BinarySearchTreeDemo {

	public static void main(String[] args) {
		BinarySearchTree bstDemo = new BinarySearchTree();
		bstDemo.add(bstDemo.root, new Node(1));
		bstDemo.add(bstDemo.root, new Node(5));
		bstDemo.add(bstDemo.root, new Node(10));
		bstDemo.add(bstDemo.root, new Node(7));
		bstDemo.add(bstDemo.root, new Node(13));
		bstDemo.add(bstDemo.root, new Node(9));
		bstDemo.searchNode(7, bstDemo.root);
	}

}

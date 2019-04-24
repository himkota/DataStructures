package com.himanshu.problems;

import java.util.HashSet;

import com.himanshu.tree.BinarySearchTree;
import com.himanshu.tree.Node;

public class CompareTrees {

	public static void main(String[] args) {
		new CompareTrees().run();

	}
	
	public void run(){
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(bst.root, new Node(1));
		bst.add(bst.root, new Node(5));
		bst.add(bst.root, new Node(10));
		scanTree(bst.root, true);
		BinarySearchTree bst2 = new BinarySearchTree();
		bst2.add(bst2.root, new Node(1));
		bst2.add(bst2.root, new Node(10));
		bst2.add(bst2.root, new Node(5));
		scanTree(bst2.root, false);
	}
	
	HashSet<Integer> set = new HashSet<Integer>();
	
	void scanTree(Node node, boolean isSaved){
		if(node==null){
			return;
		}
		if(isSaved){
			set.add(node.value);
		}else {
			if(!set.contains(node.value)){
				System.out.println("not equal");
			}else{
				
			}
		}
		scanTree(node.left,isSaved);
		scanTree(node.right,isSaved);
	}
}

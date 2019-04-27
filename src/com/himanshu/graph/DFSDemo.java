package com.himanshu.graph;

public class DFSDemo {

	public static void main(String[] args) {
		DepthFirstSearchClass dfs = new DepthFirstSearchClass(6);
		dfs.add(0, 1);
		dfs.add(1, 2);
		dfs.add(2, 3);
		dfs.add(3, 4);
		dfs.add(4, 5);
		dfs.search(0);

	}

}

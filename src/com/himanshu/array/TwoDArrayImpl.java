package com.himanshu.array;

public class TwoDArrayImpl {
	public static void main(String[] args) {
		int[][] tda = new int[3][3];
		for(int[] oda :tda){
			for(int element : oda){
				System.out.print("a" + "\t");
			}
			System.out.println("\n");
		}
	}
}

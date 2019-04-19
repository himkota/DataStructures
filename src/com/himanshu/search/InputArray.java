package com.himanshu.search;

public class InputArray {
	
	public int[] inputArray;
	public int iterationsCount;

	public InputArray(int size) {
		iterationsCount = 0;
		inputArray = new int[size];
		for(int i=0;i<size; i++){
			inputArray[i] = i+1;
		}
	}

}

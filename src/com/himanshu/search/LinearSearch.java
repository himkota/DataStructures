package com.himanshu.search;

public class LinearSearch {

	public static void main(String[] args) {
		InputArray ia = new InputArray(100000);
		int[] inputData = ia.inputArray; 
		int searchNumber = 99999;
		boolean isFound = false;
		for (int i : inputData) {
			ia.iterationsCount++;
			if(i==searchNumber){
				System.out.println("number of iterations " + ia.iterationsCount + " it took to find the number");
				isFound = true;
				break;
			}
		}
		if(isFound == false){
			System.out.println("number not found even after " + ia.iterationsCount + " iterations");
		}
	}

}

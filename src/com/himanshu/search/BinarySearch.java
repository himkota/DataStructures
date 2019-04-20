package com.himanshu.search;

public class BinarySearch {
	
	public static void main(String[] args) {
		InputArray ia = new InputArray(7);
		int searchedNumber = 3;
		boolean isFound = false;
		int low = 0;
		int high = ia.inputArray.length;
		while(isFound == false){
			ia.iterationsCount++;
			int mid = low + ((high-low)/2);
			if (high<low){
				break;
			}      
			if(ia.inputArray[mid] == searchedNumber){
				isFound = true;
				break;
			}else if(ia.inputArray[mid] > searchedNumber){
				high = mid-1;
			}else if(ia.inputArray[mid] < searchedNumber){
				low = mid+1;
			}
			
		}
		if(isFound == true)
			System.out.println("number found after " + ia.iterationsCount + " iterations");
		else 
			System.out.println("number does not exists");
	}
	
}

package com.himanshu.search;

public class InterpolationSearch {
	public static void main(String[] args) {
		InputArray ia = new InputArray(9);
		ia.inputArray = new int[] {0,1,2,3,4,5,6,7,8};
		int searchedNumber = 2;
		boolean isFound = false;
		int low = 0;
		int high = ia.inputArray.length-1;
		while(isFound == false){
			ia.iterationsCount++;
			int mid = low + ((high-low)/(ia.inputArray[high]-ia.inputArray[low])*(searchedNumber-ia.inputArray[low]));
			System.out.println(low + " " + mid + " " + high);
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

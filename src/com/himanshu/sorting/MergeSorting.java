package com.himanshu.sorting;

import java.util.Arrays;

public class MergeSorting {
	
	int[] input ;
	int[] temp ;
	
	public static void main(String[] args) {
		int [] input = new int[] {1,8,7,4,3,2,5,9};
		new MergeSorting().prepareForSorting(input);
		System.out.println(Arrays.toString(input));
	}

	
	
	void mergeAndSort(int lowIndex, int highIndex, int midIndex){
		 for(int i=lowIndex;i<=highIndex;i++)	
			 temp[i]= input[i];
		int i = lowIndex;
		int j = midIndex+1;
		int k = lowIndex;
		while(i<=midIndex && j<=highIndex){
			if(temp[i]<temp[j]){
				input[k] = temp[i];	
				i++;
			}else{
				input[k] = temp[j];
				j++;
			}
			k++;
		}
		while(i<=midIndex){
			input[k] = temp[i];
			k++;
			i++;
		}
	}
	
	void prepareForSorting(int[] input){
		this.input= input;
		this.temp = new int[input.length];
		mergeSort(0, input.length-1);
	}
	
	void mergeSort(int start , int finish){
		if(start<finish){
			int mid = start + (finish-start)/2;
			mergeSort(start, mid);
			mergeSort(mid+1,finish);
			mergeAndSort(start, finish, mid);
		}
		
	}
	
}

package com.himanshu.sorting;

import java.util.Arrays;

public class QuickSorting {
	
	public static int[] quickSort(int[] input, int leftIndex,int rightIndex){
		int midIndex = leftIndex + (rightIndex-leftIndex)/2;
		int pivot = input[midIndex];
		
		if (leftIndex > rightIndex) return null;
		int i=leftIndex;
		int j= rightIndex;
		while(i<=j){
			while(input[i]<pivot)
				i++;
			while(input[j]>pivot)
				j--;
			if(i<=j){
				int temp = input[j];
				input[j] = input[i];
				input[i] = temp;
				i++;
				j--;
			}
		}
		
		if(leftIndex<j){
			quickSort(input, leftIndex, j);
		}
		if(rightIndex>i){
			quickSort(input, i, rightIndex);
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = {6,8,2,4,3,8,1};
		System.out.println(Arrays.toString(quickSort(input, 0, 6)));

	}

}

package com.himanshu.sorting;

import java.util.Arrays;

public class SelectionSorting {

	static int[] selectionSort(int[] args){
		int size = args.length;
		for (int i = 0 ; i<size ; i++) {
			int swapIndex = i;
			for(int j = i+1;j<size;j++){
				if(args[j]<args[swapIndex]){
					swapIndex = j;
				}
			}
			if(swapIndex!=i){
				int temp = args[swapIndex];
				args[swapIndex] = args[i];
				args[i] = temp;
			}
		}
		return args;
	}
	
	public static void main(String[] args){
		System.out.println(Arrays.toString(selectionSort(new int[] {1,7,4,2,3,8,5})));
	}
}

package com.himanshu.sorting;

import java.util.Arrays;

public class BubbleSorting {
	static int[] bubbleSort(int[] args){
		int size = args.length;
		int temp = 0;
		for (int i = 0 ; i<size ; i++) {
			for(int j = 1;j<(size-i);j++){
				if(args[j]<args[j-1]){
					temp = args[j-1];
					args[j-1] = args[j];
					args[j] = temp;
				}
			}
		}
		return args;
	}
	
	public static void main(String[] args){
		System.out.println(Arrays.toString(bubbleSort(new int[] {1,7,4,2,3,8,5})));
	}
}

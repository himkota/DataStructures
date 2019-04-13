package com.himanshu;

import com.himanshu.array.DynamicArray;

public class DynamicArrayDemo {

	public static void main(String[] args) {
		DynamicArray<Integer> da = new DynamicArray<Integer>();
		da.put(1);
		System.out.println("size" + da.getSize());
		da.put(2);
		System.out.println("size" + da.getSize());
		da.put(3);
		System.out.println("size" + da.getSize());
		da.put(4);
		System.out.println("size" + da.getSize());
		da.put(5);
		System.out.println("size" + da.getSize());
	}

}

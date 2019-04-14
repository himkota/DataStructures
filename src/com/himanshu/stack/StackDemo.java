package com.himanshu.stack;

public class StackDemo {

	public static void main(String[] args) {
		StackUsingArray<String> st = new StackUsingArray<String>(5);
		st.push("1");
		st.push("2");
		st.push("3");
		st.push("4");
		st.push("5");
		st.push("6");
		System.out.println(st.pop());
		
		StackUsingDynamicArray<Integer> dst = new StackUsingDynamicArray<Integer>(2);
		dst.push(1);
		dst.push(2);
		dst.push(3);
		dst.push(4);
		dst.push(5);
		dst.push(6);
		dst.push(7);
		System.out.println("dst size " + dst.getSize());
		
		while(!dst.isEmpty()){
			System.out.println(dst.pop());
		}

		StackUsingLL<Integer> stll = new StackUsingLL<Integer>();
		stll.push(1);
		stll.push(2);
		stll.push(3);
		stll.push(4);
		stll.push(5);
		stll.push(6);
		stll.push(7);
		System.out.println("stll  " );
		
		while(!stll.isEmpty()){
			System.out.println(stll.pop());
		}
		
	}

}

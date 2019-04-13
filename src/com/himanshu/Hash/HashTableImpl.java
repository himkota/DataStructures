package com.himanshu.Hash;

public class HashTableImpl {
	
	public static void main(String[] args) {
		HashTableUsingArray<String> hta = new HashTableUsingArray<String>(5);
		hta.put(10, "himanshu");
		hta.put(20, "gupta");
		hta.put(12, "himanshu12");
		hta.put(22, "himanshu22");
		System.out.println(hta.get(10));

	}

}

package com.himanshu.linkedlist;


public class DllDemo {

	public static void main(String[] args) {
		DoubleLinkedList<String> DlList = new DoubleLinkedList<String>();
		DlList.add("Himanshu");
		DlList.add("Gupta");
		DlList.display();
		DlList.delete();
		DlList.display();
	}

}

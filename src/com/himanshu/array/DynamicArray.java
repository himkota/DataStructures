package com.himanshu.array;

import java.util.Arrays;

public class DynamicArray<T> {
	
	int size ;
	Object[] data;
	
	public DynamicArray() {
		size = 0;
		data = new Object[1];
	}
	
	public int getSize(){
		return data.length;
	}
	
	public T get(int index){
		return (T)data[index];
	}
	public void put(T element){
		ensureSize(size+1);
		data[size++] = element;
	}
	
	private void ensureSize(int minCapacity){
		int oldCapacity = getSize();
		if(oldCapacity<minCapacity){
			int newCapacity = oldCapacity * 2;
			if(newCapacity<minCapacity)
				newCapacity = minCapacity;
			data = Arrays.copyOf(data, newCapacity);
		}
	}
}

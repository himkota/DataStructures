package com.himanshu.Hash;

public class HashTableUsingArray<T> {
	int size;
	Entity[] hashArray;
	
	public HashTableUsingArray(int size) {
		this.size = size;
		hashArray = new Entity[size];
		for(Entity e : hashArray){
			e = new Entity();
		}
	}
	int getHash(int key){
		return key%size;
	}
	
	public void put(int key , Object value){
		int index = getHash(key);
		Entity e = new Entity(key, value);
		if (hashArray[index] != null ){
			e.next = hashArray[index];
		}
		hashArray[index] = e;	
	}
	
	public T get(int key){
		T value = null;
		int index = getHash(key);
		Entity e = hashArray[index];
		while(e!=null){
			if(e.getKey() == key){
				value = (T)e.getValue();
				break;
			}
			e= e.next;
		}
		return value;
	}
}

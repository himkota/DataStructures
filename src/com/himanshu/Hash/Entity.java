package com.himanshu.Hash;

public class Entity {
	int key;
	Object value;
	Entity next;
	
	public Entity() {
		this.next = null;
	}
	public Entity(int key,Object value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}
	public int getKey() {
		return key;
	}
	public Object getValue() {
		return value;
	}
}

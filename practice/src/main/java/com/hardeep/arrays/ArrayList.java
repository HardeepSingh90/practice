package com.hardeep.arrays;

import java.util.Arrays;

public class ArrayList {
	
	private static final int DEFAULT_SPACE = 10;
	private Object[] element;
	private int size = 0;
	
	public ArrayList() {
		element = new Object[DEFAULT_SPACE];
	}
	public ArrayList(int size) {
		new ArrayList();
		element = new Object[size];
	}

	public void add(int data) {
		if(size == element.length) {
			arrayResizing();
		}
		element[size] = data;
		size++;
	}
	
	private void arrayResizing() {
		int newCapacity = size * 2;
		element = Arrays.copyOf(element,newCapacity);
	}
	
	public int getSize() {
		return size;
	}
	
	public Object get(int index) {
		if(index<0 || index>size) {
			throw new IllegalStateException("invalid index");
		}
		return element[index];
	}
	
	public Object remove(int index) {
		if(index<0 || index>size) {
			throw new IllegalStateException("invalid index");
		}
		Object valueToDelete = element[index];
		
		return valueToDelete;
	}
	
	public static void main(String...s) {
		ArrayList arrList = new ArrayList();
		arrList.add(10);
		arrList.add(12);
		arrList.add(14);
		arrList.add(10);
		arrList.add(12);
		arrList.add(14);
		arrList.add(10);
		arrList.add(12);
		arrList.add(14);
		arrList.add(10);
		arrList.add(12);
		arrList.add(14);
		System.out.println(arrList);
		System.out.println("size :"+arrList.getSize());
		System.out.println("getIndex :"+arrList.get(-1));
	}
	@Override
	public String toString() {
		return "ArrayList [element=" + Arrays.toString(element) + ", size=" + size + "]";
	}
	
}

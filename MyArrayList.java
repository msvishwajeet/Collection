package com.practice.java.learning;

public class MyArrayList {
	private int count=0;
	private Object[] obj;
	public MyArrayList(int initialsize) {
		obj=new Object[initialsize];
	}
	public MyArrayList() {
		this(10);  					 //calling same class constructor
	}
	
	public int size() { 			
		return count;
	}
	public void add(Object ele) {
		if (count>=obj.length) {
			increase();
		}
		obj[count++]=ele;
	}
	private void increase() {
		Object[] b= new Object[(size()*3/2)+1];
		for (int i = 0; i < obj.length; i++) {
			b[i]=obj[i];
		}
		obj=b;
	}
	public Object get(int index) {
		if (index>=size()) throw new ArrayIndexOutOfBoundsException();
			return obj[index];
	}
	public int arrayLength() {
		return obj.length;
	}
	public String toString() {
		String s="[";
		int i=0;
		while (i<size()-1) {
			s+=obj[i]+" ";
			i++;
		}
		s+=obj[size()-1]+"]";
		return s;
	}
	public int indexOf(Object ele) {
		int i=0;
		while (i<size()) {
			if (obj[i]==ele) {
				return i;
			}
			i++;
		}
		return -1;
		
	}
	public int lastIndexOf(Object ele) {
		int i=size()-1;
		while (i>=0) {
			if (obj[i]==ele) {
				return i;
			}
			i--;
		}
		return -1;
		
	}
	public Object set(int index,Object ele1) {
		if (index>=size())throw new ArrayIndexOutOfBoundsException();
		obj[index]=ele1;
		
		return ele1;
		
	}
	public Object remove(int index) {
		if (index>=size())throw new ArrayIndexOutOfBoundsException();
		Object o=obj[index];
		obj[index]=null;
		return o;
			}
}
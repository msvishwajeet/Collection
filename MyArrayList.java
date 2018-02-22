package com.collection.program;

public class MyArrayList {
	private int count=0;
	private Object[] obj;
	public MyArrayList(int initialsize) {
		obj=new Object[initialsize];
	}
	public MyArrayList() {
		this(10);
	}
	public void add(Object ele) {
		if (size()>=obj.length) {
			increase();
		}
		obj[count++]=ele;
	}
	private void increase() {
		Object b[]=new Object[(size()*3/2)+1];
		for (int i = 0; i <obj.length; i++) {
			b[i]=obj[i];
		}
		obj=b;
	}
	public int size() {
		return count;
	}
	public Object get(int index) {
		if (index>=size())throw new ArrayIndexOutOfBoundsException();
		return obj[index];
	}
	public Object remove(int index) {
		if (index>=size())throw new ArrayIndexOutOfBoundsException();
		Object b=obj[index];
		obj[index]=null;
		return b;
	}
	public int indexOf(Object ele) {
		for (int j = 0; j < size(); j++) {
			if (obj[j]==ele) {
				return j;
			}
		}
		return -1;
	}
	public int lastIndexOf(Object ele) {
		for (int j = size()-1; j >=0; j--) {
			if (obj[j]==ele) {
				return j;
			}
		}
		return -1;
	}
	public int lengthOfArray() {
		return obj.length;
	}
	public void set(int index,Object ele) {
		if (index>=size())throw new ArrayIndexOutOfBoundsException();
		obj[index]=ele;
	}
	@Override
	public String toString() {
		String s="[";
		for (int i = 0; i < count-1; i++) {
			s+=obj[i]+" ";
		}
		s+=obj[count-1]+"]";
		return s;
	}
}

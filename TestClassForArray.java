package com.collection.program;

public class TestClassForArray {

	public static void main(String[] args) {
		MyArrayList m=new MyArrayList();
		m.add(2);
		m.add(5);
		m.add(42);
		m.add(5);
		m.add(42);
		m.add(21);
		m.add(92);
		m.add(29);
		m.add(112);
		m.add(21);
		m.add(112);
		System.out.println(m);
		System.out.println(m.get(2));
		System.out.println(m.remove(5));
		System.out.println(m);
		System.out.println(m.indexOf(5));
		System.out.println(m.lastIndexOf(5));
		System.out.println(m.lengthOfArray());
		m.set(3, 555);
		System.out.println(m);
	}

}

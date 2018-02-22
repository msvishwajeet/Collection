package com.collection.program;

public class TestClassForLinkedList {

	public static void main(String[] args) {
		MyLinkedList l=new MyLinkedList();
		l.add(41);
		l.add(65);
		l.add(87);
		l.add(554);
		l.add(1);
		l.add(557);
		l.add(98);
		l.add(32);
		l.add(78);
		System.out.println(l);
		System.out.println(l.get(2));
		l.remove(3);
		System.out.println(l);
		System.out.println(l.addAt(4, 51));
		System.out.println(l);
	}

}

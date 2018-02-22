package com.collection.program;

public class TestClassForDDL {

	public static void main(String[] args) {
		MyDoublyLinkedList d=new MyDoublyLinkedList();
		d.addFirst(25);
		d.addFirst(54);
		d.addAt(1, 11);
		d.addLast(52);
		System.out.println(d);
		d.addFirst(541);
		d.addFirst(11);
		d.addFirst(78);
		d.addLast(51);
		System.out.println(d);
		System.out.println(d.getFirst());
		System.out.println(d.getLast());
		d.setAt(2, 2222);
		d.removeAt(2);
		System.out.println(d);
		System.out.println(d.getAt(2));
		d.removeLast();
		System.out.println(d);
		d.removeFirst();
		System.out.println(d);
	}

}

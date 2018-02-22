package com.collection.program;

public class TestClassForStack {

	public static void main(String[] args) {
		MyStack s= new MyStack();
		s.push(2);
		s.push(54);
		s.push(45);
		s.push(89);
		s.push('A');
		s.push('B');
		s.push('C');
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
	}

}

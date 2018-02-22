package com.collection.program;

public class TestClassForCircularDDL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCircularDLL cd=new MyCircularDLL();
		cd.addAtStart(89);
		cd.addAtEnd(78);
		cd.addAtEnd(14);
		cd.addAtEnd(897);
		cd.addAtStart(22);
		cd.addAtEnd(111);
		System.out.println(cd);
		cd.removeAtEnd();
		System.out.println(cd);
		System.out.println(cd.get(2));
	}

}

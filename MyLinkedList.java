package com.practice.java.learning;

public class MyLinkedList {

	private class Node{
		Object data;
		Node next;
		public Node(Object obj){
			data=obj;
		}
	}
   private Node first;
   private Node last;
   private int count=0;
   public void add(Object eq) {
	if (first==null) {
		first=new Node(eq);
		last=first;
		count++;
		return;
	}
	else {
	last.next=new Node(eq);
	last=last.next;
	count++;
	}
}
   public int size() {
	   return count;
   }
   public Object get(int index) {
	if (index>=size()) throw new ArrayIndexOutOfBoundsException();
	Node p=first;
	for (int i = 0; i < index; i++) {
		p=p.next;
	}
	return p.data;
}
   public String toString() {
	   String s="";
	   Node p=first;
	   for (int i = 0; i < size()-1; i++) {
		s+="["+p.data+"]->";
		p=p.next;
	}
	   s+="["+p.data+"]";
	   return s;
   }
}

package com.collection.program;

public class MyCircularDLL {
	private class Node{
		private Node next;
		private Node prev;
		private Object data;
		public Node(Object data) {
			this.data=data;
		}
	}
	private Node head;
	private Node tail;
	private int count=0;
	public void addAtStart(Object obj) {
		Node d=new Node(obj);
		if (head==null) {
			head=d;
			d.next=null;
			d.prev=null;
			tail=head;
			count++;
		}
		else {
			head.prev=d;
			d.next=head;
			d.prev=tail;
			head=d;
			count++;
			
		}
	}
	public void addAtEnd(Object obj) {
		Node d=new Node(obj);
		if (tail==null) {
			tail=d;
			d.next=null;
			d.prev=null;
			head=tail;
			count++;
		}
		else {
			tail.next=d;
			d.next=head;
			d.prev=tail;
			tail=d;
			count++;
			
		}
	}
	public void removeAtEnd() {
		if (tail==null) {
			return;
		}
		else {
			Node d=tail.prev;
			d.next=head;
			head.prev=d;
			tail=d;
			count--;
			
		}
	}
	public Object get(int index) {
		if (index>=count) throw new NullPointerException("No such Index available");
		Node p=head;
		for (int i = 0; i < index; i++) {
			p=p.next;
		}
		return p.data;
			
	}
	
	public String toString() {
		String s="<-";
		Node p=head;
		for(int i=1;i<count;i++) {
			s+="[("+p.prev.data+"){"+p.data+"}("+p.next.data+")], ";
			p=p.next;
		}
		s+="[("+p.prev.data+"){"+p.data+"}("+p.next.data+")]->";
		return s;
		
	}
}

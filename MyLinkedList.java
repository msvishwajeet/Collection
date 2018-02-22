package com.collection.program;
public class MyLinkedList {
	private class Node{
		private Node next;
		private Object data;
		public Node(Object data) {
			this.data=data;
		}
	}
	private Node first;
	private Node last;
	private int count=0;
	public void add(Object ele) {
		Node d=new Node(ele);
		if (first==null) {
			first=d;
			d.next=null;
			last=first;
			count++;
		}
		else {
			last.next=d;
			d.next=null;
			last=d;
			count++;
		}
	}
	public void set(int index,Object ele) {
		Node n=new Node(ele);
		if (index>=count) throw new NullPointerException();
		Node p=first;
		for (int i = 0; i < index; i++) {
			p=p.next;
		}
		p.next=n;
		n.next=p.next.next;
	}
	public Object addAt(int index,Object ele) {
		Node d=new Node(ele);
		if (index>=count) throw new NullPointerException();
		Node p=first;
		for (int i = 1; i < index; i++) {
			p=p.next;
		}
		Node q=p.next;
		p.next=d;
		d.next=q;
		count++;
		return ele;
	}
	public void remove(int index) {
		if (index>=count) throw new NullPointerException();
		Node p=first;
		for (int i = 1; i < index; i++) {
			p=p.next;
		}
		p.next=p.next.next;
		count--;
	}
	public Object get(int index) {
		if (index>=count) throw new NullPointerException();
		Node p=first;
		for (int i = 0; i < index; i++) {
			p=p.next;
		}
		return p.data;
	}
	public String toString() {
		String s="";
		Node p=first;
		for (int i = 0; i < count-1; i++) {
			s+="["+p.data+"]->";
			p=p.next;
		}
		s+="["+p.data+"]";
		return s;
	}
	
}

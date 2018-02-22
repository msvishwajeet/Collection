package com.collection.program;

public class MyDoublyLinkedList {
	private class Node{
		private Node next;
		private Node prev;
		Object data;
		public Node(Object data) {
			this.data=data;
		}
	}
	private Node first;
	private Node last;
	private int count=0;
	public void addFirst(Object ele) {
		Node d=new Node(ele);
		if (first==null) {
			first=d;
			first.next=null;
			first.prev=null;
			last=first;
			count++;
		}
		else {
			first.prev=d;
			d.next=first;
			d.prev=null;
			first=d;
			count++;
		}
	}
	public void addLast(Object ele) {
		Node d=new Node(ele);
		if (last==null) {
			last=d;
			d.next=null;
			d.prev=null;
			first=last;
			count++;
		}
		else {
			last.next=d;
			d.next=null;
			d.prev=last;
			last=d;
			count++;
		}
	}
	@Override
	public String toString() {
		String s="";
		Node p=first;
		for (int i = 0; i < count-1; i++) {
			s+="["+p.data+"]<->";
			p=p.next;
		}
		s+="["+p.data+"]";
		return s;
	}
	public Object getFirst() {
		return first.data;
	}
	public Object getLast() {
		return last.data;
	}
	public void setAt(int index,Object ob) {
		if (index>=count) throw new NullPointerException();
		Node d=new Node(ob);
		Node p=first;
		for (int i = 1; i < index; i++) {
			p=p.next;
		}
		p.next.data=d.data;
	}
	public void addAt(int index,Object obj) {
		if (index>=count) throw new NullPointerException();
		Node d=new Node(obj);
		Node p=first;
		for (int i = 1; i < index; i++) {
			p=p.next;
		}
		Node q=p.next;
		p.next=d;
		d.next=q;
		d.prev=p;
		q.prev=d;
		count++;
	}
	public void removeAt(int index) {
		if (index>=count) throw new NullPointerException();
		Node p=first;
		for (int i = 1; i < index; i++) {
			p=p.next;
		}
		Node q=p.next.next;
		p.next=q;
		q.prev=p;
		count--;
	}
	public Object getAt(int index) {
		Node p=first;
		for (int i = 1; i < index; i++) {
			p=p.next;
		}
		return p.next.data;
	}
	public void removeLast() {
		Node p=last.prev;
		p.next=null;
		last.prev=null;
		p=last;
		count--;
	}
	public void removeFirst() {
		Node p=first.next;
		p.prev=null;
		first.next=null;
		first=p;
		count--;
	}
	
}

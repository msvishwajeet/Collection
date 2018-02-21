package com.practice.java.learning;

public class DoublyLinkedList {
	private class Node{
		Object data;
		Node next;
		Node prev;
		public Node(Object data) {
			this.data=data;
		}
	}
	private Node first;
	private Node last;
	private int count=0;
	public void addFirst(Object data) {
		Node p=new Node(data);
		if (first==null) {
			first=p;
			first.next=null;
			first.prev=null;
			last=first;
			count++;
		}
		else {
			first.prev=p;
			p.next=first;
			p.prev=null;
			first=p;
			count++;
		}
	}
	public void addLast(Object data) {
		Node n=new Node(data);
		if (last==null) {
			last=n;
			last.next=null;
			last.prev=null;
			first=last;
		}
		else {
			last.next=n;
			n.next=null;
			n.prev=last;
			last=n;
			count++;
		}
	}
	public void addAt(int index,Object ele) {
		 Node n=new Node(ele);
		 if (index>=size()) throw new ArrayIndexOutOfBoundsException();
		 else {
			 Node p=first;
			 for (int i = 1; i < index; i++) {
				p=p.next;
			}
			 Node q=p.next;
			 p.next=n;
			 n.next=q;
			 n.prev=p;
			 count++;
		 }
	}
	public int size() {
		return count;
	}
	public String toString() {
		String s="{";
		Node r=first;
		for (int i = 0; i < size()-1; i++) {
			s+=r.data+" ";
			r=r.next;
		}
		s+=r.data+"}";
		return s;
	}
	public boolean deleteAt(int index) {
		if (index>=size()) throw new NullPointerException(); 
		Node p= first;
		for (int i = 0; i < index; i++) {
			p=p.next;
		}
		Node q=p.prev;
		Node r=p.next;
		q.next=r;
		r.prev=q;
		count--;
		return true;
	}
	public boolean deleteFirst() {
		if (first==null){
			return false;
		}
		Node p=first.next;
		first=p;
		p.prev=null;
		count--;
		return true;
	}
	public boolean deleteLast() {
		if (last==null) {
			return false;
		}
		Node p=last.prev;
		p.next=null;
		last=p;
		count--;
		return true;
		
	}
}

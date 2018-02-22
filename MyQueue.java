package com.collection.program;

import java.util.NoSuchElementException;

public class MyQueue {
	private class Node{
		 private Node next;
		 private Object data;
		 public Node(Object ele) {
			data=ele;
		 }
	}
	private Node first;
	private Node last;
	private int count=0;
	public boolean offer(Object ele) {
		Node p=new Node(ele);
		if (first==null) {
			first=p;
			p.next=null;
			last=first;
			count++;
		}
		else {
			last.next=p;
			p.next=null;
			last=p;
			count++;
		}
		return true;
	}
	public Object poll() {
		if(isEmpty()) {
			return null;
		}
		Node p=first;
		first=p.next;
		p.next=null;
		count--;
		return p.data;
	}
	public boolean isEmpty() {
		if (count==0) {
			return true;
		}
		return false;
	}
	public Object remove() {
		if(isEmpty()) throw new NoSuchElementException();
		Node p=first;
		first=p.next;
		p.next=null;
		count--;
		return p.data;
	}
	public Object element() {
		if(isEmpty()) throw new NoSuchElementException();
		return first.data;
	}
	public Object peek() {
		if(isEmpty()) {
			return null;
		}
		return first.data;
	}
	@Override
	public String toString() {
		String s="<<";
		Node p=first;
		for (int i = 1; i < count; i++) {
			s+=p.data+"("+i+") ";
			p=p.next;
		}
		s+=p.data+"("+(count)+")<<";
		return s;
	}
}

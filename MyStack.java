package com.collection.program;

public class MyStack {
	private class Node{
		private Node next;
		private Object data;
		public Node(Object data) {
			this.data=data;
		}
	}
	private Node first;
	private Node last;
	private int count;
	public void push(Object ele) {
		Node d=new Node(ele);
		if (first==null) {
			first=d;
			d.next=null;
			last=first;
			count++;
		}
		else {
			first.next=d;
			d.next=null;
			count++;
			first=d;
		}
	}
	public Object pop() {
		if (isEmpty())throw new NullPointerException();
		Node p=last;
		int i=1;
		while(i<count-1) {
			p=p.next;
			i++;
		}
		Node r=p.next;
		p.next=null;
		first=p;
		count--;
		return r.data;
	}
	public Object peek() {
		if (isEmpty())throw new NullPointerException();
		return first.data;
	}
	public int search(Object obj) {
		Node p=last;
		for (int i = 0; i <count; i++) {
			if (p.data==obj) {
				return i;
			}
			p=p.next;
		}
		
		return-1;
	}
	public boolean isEmpty() {
		if(count==0) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		String s=">>";
		Node p=last;
		for (int i = count-1; i >0; i--) {
			s=s+" "+p.data+"("+i+")";
			p=p.next;
		}
		s=s+" "+p.data+"(0)>>";
		return s;
	}
}

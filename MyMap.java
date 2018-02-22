package com.collection.program;
public class MyMap {
	private class Node{
		private Node next;
		private Node prev;
		private Object key;
		private Object vlaue;
		public Node(Object key,Object value) {
			this.key=key;
			this.vlaue=value;
		}
	}
	private Node first;
	private Node last;
	private int count=0;
	public Object put(Object key,Object value) {
		Node d=new Node(key, value);
		if (first==null) {
			first=d;
			d.next=null;
			d.prev=null;
			last=first;
			count++;
		}
		else {
			if (search(d)) {
				return key;
			}
			else {
				last.next=d;
				d.prev=last;
				d.next=null;
				last=d;
				count++;
			}
		}
		return key;
	}
	private boolean search (Node d) {
		Node p=first;
		for (int i = 1; i < count; i++) {
			if (p.key==d.key) {
				p.vlaue=d.vlaue;
				return true;
			}
			p=p.next;
		}
		return false;
	}
	public int size() {
		return count;
	}
	public boolean isEmpty() {
		if (size()==0) {
			return true;
		}
		return false;
	}
	public boolean containKey(Object key) {
		Node p=first;
		for (int i = 1; i <= count; i++) {
			if (p.key==key) {
				return true;
			}
			p=p.next;
		}
		return false;
	}
	public void clear() {
		first=null;
		last=null;
		count=0;
	}
	
	public boolean containsValue(Object val) {
		Node p=first;
		for (int i = 1; i <= count; i++) {
			if (p.vlaue==val) {
				return true;
			}
			p=p.next;
		}
		return false;
	}
	public Object get(Object key) {
		Node p=first;
		for (int i = 1; i < count; i++) {
			if (p.key==key) {
				return p.vlaue;
			}
			p=p.next;
		}
		return null;
	}
	public Object remove(Object key) {
		Node p=first;
		for (int i = 1; i < count; i++) {
			if (p.key==key) {
				Node r=p.prev;
				Node s=p.next;
				r.next=s;
				s.prev=r;
				count--;
				return p.vlaue;
			}
			p=p.next;
		}
		return null;
	}
	@Override
	public String toString() {
		String s="";
		if (!isEmpty()) {
			s+="{";
		
		Node p=first;
		for (int i = 1; i < count; i++) {
			s+=p.key+"="+p.vlaue+", ";
			p=p.next;
		}
		s+=p.key+"="+p.vlaue+"}";
		}
		return s;
	}
	
}

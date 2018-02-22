package com.collection.program;
public class TestClassForQueue {

	public static void main(String[] args) {

		MyQueue q=new MyQueue();
		q.offer("A");
		q.offer("B");
		q.offer("C");
		q.offer("D");
		q.offer("E");
		q.offer("F");
		System.out.println(q);
		System.out.println("peek of Queue");
		System.out.println(q.peek());
		System.out.println("Poll the queue");
		System.out.println(q.poll());
		System.out.println(q.isEmpty());
		System.out.println(q);
		System.out.println(" first element");
		System.out.println(q.element());
		System.out.println(q);
		System.out.println("Remove first");
		System.out.println(q.remove());
		System.out.println(q);
	}

}

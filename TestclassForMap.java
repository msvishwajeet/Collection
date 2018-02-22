package com.collection.program;

public class TestclassForMap {

	public static void main(String[] args) {
		MyMap m=new MyMap();
		 m.put("A","Apple" );
		 m.put("B","bat" );
		 m.put("c","cat" );
		System.out.println(m);
		System.out.println(m.put("l", "Lion"));
		System.out.println(m);
		m.put("A", "Ape");
		System.out.println(m);
		m.put(1, 44);
		m.put(2, 22);
		System.out.println(m);
		System.out.println(m.containKey(2));
		System.out.println(m.containsValue(22));
		System.out.println(m.isEmpty());
		System.out.println(m.remove("c"));
		System.out.println(m);
		System.out.println(m.get(1));
		m.clear();
		System.out.println(m);
		System.out.println(m.get(1));
	}

}

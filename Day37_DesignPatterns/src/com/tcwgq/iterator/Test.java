package com.tcwgq.iterator;

public class Test {
	public static void main(String[] args) {
		Collection collection = new MyCollection();
		Iterator it = collection.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
		}
	}
}

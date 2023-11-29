package com.test;

import java.util.ArrayList;

class Book {
	int id;
	String name;

	Book() {

	}

	Book(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "book details: " + " id is: " + id + ", name is: " + name;
	}

	public boolean equals(Object obj) {
		return this.name.equals(((Book) obj).name);
	}
}

public class BookMain {
	public static void main(String[] args) {
		ArrayList<Book> book = new ArrayList<>();
		book.add(new Book(1, "c"));
		book.add(new Book(2, "java"));
		book.add(new Book(3, "java"));
		book.add(new Book(4, "springboot"));
		book.add(new Book(5, "c"));
		book.add(new Book(6, "c"));

		int count;
		for (int i = 0; i < book.size(); i++) {
			count = 1;
			if (book.get(i)==null)
				continue;
			for (int j = i + 1; j < book.size(); j++) {
				if (book.get(i) != null && book.get(j) != null && book.get(i).name.equals(book.get(j).name)) {
					count++;
					book.set(j, null);
				}
			}
			System.out.println(book.get(i) + "---->" + count);
		}
	}

}

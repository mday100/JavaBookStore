package com.fdmgroup.com;

import java.util.ArrayList;

public class Catalogue implements ReadItemCommand {
	ArrayList<Book> books = new ArrayList<Book>();
	ReadItemCommand readitem;

	public Catalogue( ReadItemCommand readitem) {
		super();
//		this.books = books;
		this.readitem = readitem;
	}

	public ArrayList<Book> getAllbooks() {
		
		return readitem.readAll();
	}

	@Override
	public ArrayList<Book> readAll() {
		return null;
	}

}

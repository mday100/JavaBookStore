package com.fdmgroup.com;

import java.util.*;

public class Basket {
	
	private ArrayList<Book> books = new ArrayList<Book>();

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	 
	 
	 
	public ArrayList<Book> getBasket()
	{
		return books;
	}
	
	public int getBookInBasket()
	{
		
		
		return books.size();
		
	}
	
	public void addBook(Book b)
	{
		books.add(b);
	}
}
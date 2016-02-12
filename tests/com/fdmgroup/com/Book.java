package com.fdmgroup.com;

public class Book {

	private int bookID;
    private String bookName;
    private double price;
    
    
	public Book(int bookID, String bookName, double price) {
		super();
		this.bookID = bookID;
		this.bookName = bookName;
		this.price = price;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
    
}
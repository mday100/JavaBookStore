package com.fdmgroup.com;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BasketTest {

	Basket bookList;
    Book book1;
    Book book2;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	bookList = new Basket();
	book1 = new Book(1,"Java",10.00);
	book2 = new Book(2,"SQL",10.00);
	
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBasketSuccess_GetBooksInBasket_ReturnsEmptyBookList_ifNoBooksHaveBeenAdded() {
		int book = bookList.getBookInBasket();

		assertTrue(book == 0);

	}

	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook() {
		bookList.addBook(book1);

		int book = bookList.getBookInBasket();

		assertTrue(book == 1);

	}

	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithTwoBooks() {
		bookList.addBook(book1);
		bookList.addBook(book2);

		int book = bookList.getBookInBasket();

		assertTrue(book == 2);

	}


}
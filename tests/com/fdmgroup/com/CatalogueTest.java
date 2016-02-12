package com.fdmgroup.com;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

public class CatalogueTest {
	Basket bookList = new Basket();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_GetAllBooks_ReturnsEmptyBookList_IfNoBooksAreInTheCatalogue() {
		ReadItemCommand readItemCommand =  mock(ReadItemCommand.class);
		Catalogue catalogue = new Catalogue(readItemCommand);
		assertTrue(catalogue.getAllbooks().size() == 0);
	}

	@Test
	public void test_GetAllBooks_CallsReadAllMethodOfReadItemCommand_WhenCalled(){
		ReadItemCommand readItemCommand =  mock(ReadItemCommand.class);
		Catalogue catalogue = new Catalogue(readItemCommand);
		catalogue.getAllbooks();
		verify(readItemCommand).readAll();
	}
	
	@Test
	public void test_GetAllBooks_ReturnsListOfBooksItReceivesFromReadAllMethodOfReadItemCommand_WhenCalled(){
		ReadItemCommand readItemCommandmock =  mock(ReadItemCommand.class);		
		ArrayList<Book> mockOfBooks =  mock(ArrayList.class);
		Catalogue catalogue = new Catalogue(readItemCommandmock);
		when(readItemCommandmock.readAll()).thenReturn(mockOfBooks);
		ArrayList<Book> copiedList = new ArrayList<Book>();
		copiedList = catalogue.getAllbooks();
		assertTrue(readItemCommandmock.readAll()==mockOfBooks);
	}

}

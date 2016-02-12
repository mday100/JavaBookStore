package com.fdmgroup.com;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CheckoutTest {

	 Checkout checkout;
	 Basket basket;
	 Book book1;
	 Book book2;
	 Book book3;
	 Book book4;
	 Book book5;
	 Book book6;
	 Book book7;
	 Book book8;
	 Book book9;
	 Book book10;
	 static double price=0.0;
	 
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		checkout = new Checkout();
        basket = new Basket();	
        book1 = new Book(1,"Java",10.00);
        book2 = new Book(2,"SQL", 10.00);
        book3 = new Book(3,"Vmware", 10.00);
        book4 = new Book(4,"Oracle",10.00);
        book5 = new Book(5,"Jenkins",10.00);
        book6 = new Book(6,"C++", 10.00);
        book7 = new Book(7,"Chef",10.00);
        book8 = new Book(8,"Security",10.00);
        book9 = new Book(9,"Network",10.00);
        book10 = new Book(10,"ITIL",10.00);
        
	}
	

	@After
	public void tearDown() throws Exception {
	}
      
	@Test
	public void test_CalculatePrice_ReturnsDoubleZeroPointZeroWhenPassedAnEmptyBasket(){
		
	double check=checkout.calculatePrice(basket);
	assert(check == 0);
	System.out.println(check);
	}
	
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithOneBook(){
		
     basket.addBook(book1);
   
     
    price = price +checkout.calculatePrice(basket);
     
    // System.out.println(price);
		
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithTwoBook(){
		
   
     basket.addBook(book2);
     
     price = price +checkout.calculatePrice(basket);
     
    // System.out.println(price);
		
	}

	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithThreeBook(){
		
   
     basket.addBook(book3);
     
     price = price +checkout.calculatePrice(basket);
     
    // System.out.println(price);
		
	}	
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithSevenBook(){
		
		basket.addBook(book1);
		basket.addBook(book2);
		basket.addBook(book3); 
	     basket.addBook(book4);
	     basket.addBook(book5);
	     basket.addBook(book6);
	     basket.addBook(book7);
	     basket.addBook(book8);
	     
	     
	     price = price +checkout.calculatePrice(basket);
	     
	     System.out.println(price);
			
		}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithTenBook(){
		
		basket.addBook(book1);
		basket.addBook(book2);
		basket.addBook(book3);
		basket.addBook(book4);
	     basket.addBook(book5);
	     basket.addBook(book6);
	     basket.addBook(book7);
	     basket.addBook(book8);
		
	     basket.addBook(book9);
	     basket.addBook(book10);
	     
	     
	     
	     price = price +checkout.calculatePrice(basket);
	     
	     System.out.println(price);
			
		}
	
}
package com.fdmgroup.com;

public class Checkout {

	
	private double subtotal = 0.0;
	private double total = 0.0;
	
	
	public double calculatePrice(Basket basket) {
		
		if(basket.getBookInBasket()< 3)
		{
			
			total = basketTotal(basket);
			return total;
		}
		else if(basket.getBookInBasket()>=3 && basket.getBookInBasket() < 7)
		{
			
			total = basketTotal(basket);
			total =total * 0.99;
		    return total;
		}
		else if(basket.getBookInBasket() >= 7 && basket.getBookInBasket() < 10)
		{    
			total = basketTotal(basket);
			total =total * 0.98;  
			return total;
		}
		else if(basket.getBookInBasket() >=10)
		{
			
			total =basketTotal(basket);
			
			total =total * 0.90;
			
			     for(int i =0;i<basket.getBookInBasket();i+=3)
			      {
			    	 
				      total= total*0.99;
				  }
		return total;
		}
		
		
		else
		{
			return total;
		}
	}


	
	public double basketTotal(Basket basket)
	{
	    
		for(int i=0;i<basket.getBookInBasket();i++)
		{
		
		
		 subtotal = subtotal+ basket.getBooks().get(i).getPrice();	
			
		}
		
		
		return subtotal;
	}
	

}
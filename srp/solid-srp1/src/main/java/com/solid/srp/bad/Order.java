package com.solid.srp.bad;

/**
 * 
 * This class has a lot of responsibility  
 * 
 * */
public class Order {
    
	public void addCart(String product, String client, String cupom) {
		
		System.out.println("adding in cart");
		
		if( validCupom(cupom) ) {
		
			System.out.println("added "+ product +" in cart");
		}else {
			sendEmail(client);
		}
	}
	
	public void sendEmail(String client) {
		
		System.out.println("sent email to "+ client +" with fix ");
	}
	
	public boolean validCupom(String cupom) {
		
		System.out.println("Verifing cupom");
		
		return cupom.equals("123");
	}	
}

package br.com.cassunde.solid.good;

/**
 * 
 * This class has only one responsibility, such as validating a coupon or how sending an email, this has 
 * been delegated to other class    
 * 
 * */
public class Order {

	private ValidateCupom validadeSelected;
	private EmailManager emailManager;
	
	public Order(ValidateCupom validate, EmailManager emailManager) {
		
		this.emailManager = emailManager;
		this.validadeSelected = validate;
	}
	
	public void addCart(String product, String client, String cupom) {
		
		System.out.println("adding in cart");
		
		if( this.validadeSelected.validCupom(cupom) ) {
		
			System.out.println("added "+ product +" in cart");
		}else {
			
			this.emailManager.sendEmail(client);
		}
	}
}

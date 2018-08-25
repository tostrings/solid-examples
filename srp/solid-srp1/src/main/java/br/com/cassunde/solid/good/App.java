package br.com.cassunde.solid.good;

public class App {

	public static void main(String[] args) {
		
		ValidateCupom validate = new ValidateCupom();
		EmailManager email = new EmailManager();
		
		Order order = new Order(validate, email);		
		
		order.addCart("Car", "Bessa", "123");
	}

}

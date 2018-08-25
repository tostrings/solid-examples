package br.com.cassunde.solid.good;

public class ValidateCupom {

	public boolean validCupom(String cupom) {
		
		System.out.println("Verifing cupom");
		
		return cupom.equals("123");
	}	
}

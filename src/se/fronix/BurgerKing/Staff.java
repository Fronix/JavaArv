package se.fronix.BurgerKing;

import java.util.Random;

class Staff {

	public String namn;
	
	public void st�mplaIn()
	{
		System.out.println(namn + " st�mplade in");
	}
	
	public int genereraKund()
	{
		Random kundGenerator = new Random();
		int kund = kundGenerator.nextInt(100);
		
		return kund;
	}
	
}

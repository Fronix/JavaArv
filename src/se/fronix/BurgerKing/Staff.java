package se.fronix.BurgerKing;

import java.util.Random;

class Staff {

	public String namn;
	
	public void stämplaIn()
	{
		System.out.println(namn + " stämplade in");
	}
	
	public int genereraKund()
	{
		Random kundGenerator = new Random();
		int kund = kundGenerator.nextInt(100);
		
		return kund;
	}
	
}

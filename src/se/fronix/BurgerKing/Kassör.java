package se.fronix.BurgerKing;

import java.util.Random;

class Kass�r extends Staff{
	
	String kund;
	String anst�lld;
	
	public void servera()
	{
		System.out.println(anst�lld + " serverar nu " + kund);
	}
	
	public void nyKund(int MenyNummer, String anst�lld)
	{
		Random kundGenerator = new Random();
		int kund = kundGenerator.nextInt(100);
		anst�lld = this.anst�lld;

		if(MenyNummer == 1){
			System.out.println("Kund: " + kund + " best�llde en Wooper f�r ");
			kundBetala(MenyNummer);
		}
		
		if(MenyNummer == 2){
			System.out.println("Kund: " + kund + " best�llde en Angus Burger ");
			kundBetala(MenyNummer);
		}
		
		if(MenyNummer == 3){
			System.out.println("Kund: " + kund + " best�llde en Snooper f�r ");
			kundBetala(MenyNummer);
		}
	}
	
	
	private void kundBetala(int MenyNummer)
	{
		if(MenyNummer == 1){
			System.out.print("50kr");
		}
		
		if(MenyNummer == 2){
			System.out.print("50kr");
		}
		
		if(MenyNummer == 3){
			System.out.print("50kr");
		}
	}

}

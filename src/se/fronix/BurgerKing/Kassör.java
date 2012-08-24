package se.fronix.BurgerKing;

import java.util.Random;

class Kassör extends Staff{
	
	String kund;
	String anställd;
	
	public void servera()
	{
		System.out.println(anställd + " serverar nu " + kund);
	}
	
	public void nyKund(int MenyNummer, String anställd)
	{
		Random kundGenerator = new Random();
		int kund = kundGenerator.nextInt(100);
		anställd = this.anställd;

		if(MenyNummer == 1){
			System.out.println("Kund: " + kund + " beställde en Wooper för ");
			kundBetala(MenyNummer);
		}
		
		if(MenyNummer == 2){
			System.out.println("Kund: " + kund + " beställde en Angus Burger ");
			kundBetala(MenyNummer);
		}
		
		if(MenyNummer == 3){
			System.out.println("Kund: " + kund + " beställde en Snooper för ");
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

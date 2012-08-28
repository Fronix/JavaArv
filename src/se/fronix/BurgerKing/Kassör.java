package se.fronix.BurgerKing;

import se.fronix.BurgerKing.Staff;

class Kassör extends Staff{
	
	private int attBetala;
	
	public void servera(String anställd, int kund)
	{
		System.out.println(anställd + " serverar nu " + kund);
	}
	
	public void nyKund(int MenyNummer, String anställd)
	{
		int kund = this.genereraKund();
		GrillMaster steka = new GrillMaster();
		
		if(MenyNummer == 1){
			kundBetala(MenyNummer);
			System.out.println("Kund: " + kund + " beställde en Wooper för " + attBetala + "kr");
			do
			{
				System.out.println("Beställningen är inte klar");
				//this.servera(anställd, kund);
			}while(steka.steka() == 0);
			System.out.println("Beställningen är nu klar");
			this.servera(anställd, kund);
		}
		
		if(MenyNummer == 2){
			kundBetala(MenyNummer);
			System.out.println("Kund: " + kund + " beställde en Wooper för " + attBetala + "kr");
			do
			{
				System.out.println("Beställningen är inte klar");
				//this.servera(anställd, kund);
			}while(steka.steka() == 0);
			System.out.println("Beställningen är nu klar");
			this.servera(anställd, kund);
		}
		
		if(MenyNummer == 3){
			kundBetala(MenyNummer);
			System.out.println("Kund: " + kund + " beställde en Wooper för " + attBetala + "kr");
			do
			{
				System.out.println("Beställningen är inte klar");
				//this.servera(anställd, kund);
			}while(steka.steka() == 0);
			System.out.println("Beställningen är nu klar");
			this.servera(anställd, kund);
		}
	}
	
	
	private void kundBetala(int MenyNummer)
	{
		if(MenyNummer == 1){
			attBetala = 50;
		}
		
		if(MenyNummer == 2){
			attBetala = 65;
		}
		
		if(MenyNummer == 3){
			attBetala = 75;
		}
	}

}

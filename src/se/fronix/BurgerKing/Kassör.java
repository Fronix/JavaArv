package se.fronix.BurgerKing;

import se.fronix.BurgerKing.Staff;

class Kass�r extends Staff{
	
	private int attBetala;
	
	public void servera(String anst�lld, int kund)
	{
		System.out.println(anst�lld + " serverar nu " + kund);
	}
	
	public void nyKund(int MenyNummer, String anst�lld)
	{
		int kund = this.genereraKund();
		GrillMaster steka = new GrillMaster();
		
		if(MenyNummer == 1){
			kundBetala(MenyNummer);
			System.out.println("Kund: " + kund + " best�llde en Wooper f�r " + attBetala + "kr");
			do
			{
				System.out.println("Best�llningen �r inte klar");
				//this.servera(anst�lld, kund);
			}while(steka.steka() == 0);
			System.out.println("Best�llningen �r nu klar");
			this.servera(anst�lld, kund);
		}
		
		if(MenyNummer == 2){
			kundBetala(MenyNummer);
			System.out.println("Kund: " + kund + " best�llde en Wooper f�r " + attBetala + "kr");
			do
			{
				System.out.println("Best�llningen �r inte klar");
				//this.servera(anst�lld, kund);
			}while(steka.steka() == 0);
			System.out.println("Best�llningen �r nu klar");
			this.servera(anst�lld, kund);
		}
		
		if(MenyNummer == 3){
			kundBetala(MenyNummer);
			System.out.println("Kund: " + kund + " best�llde en Wooper f�r " + attBetala + "kr");
			do
			{
				System.out.println("Best�llningen �r inte klar");
				//this.servera(anst�lld, kund);
			}while(steka.steka() == 0);
			System.out.println("Best�llningen �r nu klar");
			this.servera(anst�lld, kund);
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

package se.fronix.BurgerKing;

public class BurgerKing {

	
	public static void main(String args[])
	{
		
		GrillMaster henke = new GrillMaster();
		Kassör lisa = new Kassör();
		
		lisa.namn = "Lisa";
		lisa.stämplaIn();
		henke.namn = "Henke";
		henke.stämplaIn();
		
		lisa.nyKund(2, "Lisa");
		
	}
	
}

package se.fronix.BurgerKing;

public class BurgerKing {

	
	public static void main(String args[])
	{
		
		GrillMaster henke = new GrillMaster();
		Kass�r lisa = new Kass�r();
		
		lisa.namn = "Lisa";
		lisa.st�mplaIn();
		henke.namn = "Henke";
		henke.st�mplaIn();
		
		lisa.nyKund(2, "Lisa");
		
	}
	
}

package se.fronix.BurgerKing;

import java.util.Random;

class GrillMaster extends Staff{
	
	public int steka()
	{
		/*
		 * Slumpm�ssigt skapa problem s� det kan ta l�ngre tid att f�
		 * sin best�llning.
		 */
		Random rand = new Random();
		int problemIdag = rand.nextInt(1);
		
		
		//B�rja steka
		if(problemIdag == 0){
			return 1; //Stekningen �r klar
		}
		else if(problemIdag == 1){
			return 0; //
		}
		
		return 0;
	}

}

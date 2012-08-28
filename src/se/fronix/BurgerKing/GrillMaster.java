package se.fronix.BurgerKing;

import java.util.Random;

class GrillMaster extends Staff{
	
	public int steka()
	{
		/*
		 * Slumpmässigt skapa problem så det kan ta längre tid att få
		 * sin beställning.
		 */
		Random rand = new Random();
		int problemIdag = rand.nextInt(1);
		
		
		//Börja steka
		if(problemIdag == 0){
			return 1; //Stekningen är klar
		}
		else if(problemIdag == 1){
			return 0; //
		}
		
		return 0;
	}

}

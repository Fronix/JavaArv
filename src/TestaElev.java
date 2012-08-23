class TestaElev
{
	public static void main(String args[])
	{
		VanligElev student1 = new VanligElev("Oscar", "Martin", 1);

		DistansElev student2 = new DistansElev("Johannes", "Ansved", "Christer Johansson");
		
		//Skriver ut info om studenterna
		student1.skrivut();
		student2.skrivut();
		
		System.exit(0); //Programmet avslutas normalt
	}
}
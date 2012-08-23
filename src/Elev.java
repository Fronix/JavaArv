//Filen Elev.java
import javax.swing.JOptionPane;

// Klassen Elev görs abstract eftersom inga instanser av Elev skall skapas.
// Antigen skapar man en VanligElev elelr en DistansElev.
abstract class Elev 
{
	String fornamn;
	String efternamn;
	String email;
	
	Elev() //Konstruktor 1
	{
		fornamn = "IngetNamn";
		efternamn = "IngetEfternamn";
		email = "IngenMail";
	} //Slut konstruktor 1
	
	Elev(String fnamn, String enamn) //Konstruktor 2
	{
		int sistaTecknet = enamn.length() - 1; // ger sista tecknets position i enamn
		efternamn = enamn;
		fornamn = fnamn;
		email = fnamn + enamn.charAt(0) + enamn.charAt(sistaTecknet);
		//emailadressen = fornamnet+första bokstaven i efternamnet+sista bokstaven i efternamnet.
		email = email.toLowerCase(); //Emailen görs om till små bokstäver
		email = email + "@edu.kalmar.se";
	} //End konstruktor 2
	
	//Metoden hämtar informationen om eleven.
	String getInfo()
	{
		return "Elevens namn: " + fornamn + " "	+ efternamn + "\n" +
				"Elevens emailadress: " + email;
	} //end getInfo()
	
	void skrivut() //Skriver ut informationen i en ruta
	{
		String utskrift = getInfo();
		JOptionPane.showMessageDialog(null, utskrift); //Skriver ut i diagonal ruta
	} //End skrivut()
}
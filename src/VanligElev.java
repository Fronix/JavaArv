//Filen VanligElev.java
import javax.swing.JOptionPane;

public class VanligElev extends Elev
{
	int skapNr;
	
	//Konstruktor 1
	public VanligElev()
	{
		super();
		skapNr = 0;
	} //end konstruktor 1
	
	//Konstruktor 2
	public VanligElev(String fnamn, String enamn, int snr)
	{
		super(fnamn, enamn);
		skapNr = snr;
	}//End konstruktor 2
	
	//Metoden hämtar niformationen om den vanliga seleven.
	String getInfo()
	{
		String info;
		info = super.getInfo() +
				"\nElevens skåpnummer: " + skapNr +
				"\nEleven är elev på vanliga gymnasiet.";
		return info;
	} //end getInfo()
}
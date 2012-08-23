//Filen DistansElevn.java

public class DistansElev extends Elev
{
	String handledare;
	
	//Konstruktor 1
	public DistansElev()
	{
		super();
		handledare = "IngenHandledare";
	}//end konstruktor
	
	//Konstruktor 2
	public DistansElev(String fnamn, String enamn)
	{
		super(fnamn, enamn);
		email.replaceFirst("@", "@dist.");
		handledare = "IngenHandledare";
	}//end konstruktor 2
	
	//Konstruktor 3
	public DistansElev(String fnamn, String enamn, String handl)
	{
		super(fnamn, enamn);
		email.replaceFirst("@", "@dist.");
		handledare = handl;
	}//end konstruktor 3
	
	// Metoden hämtar informationen om distanseleven
	String getInfo()
	{
		String info;
		info = super.getInfo() + "\nHandledaren heter:" + handledare + 
				"\nEleven är en distanselev.";
		return info;
	}//end getInfo()
}//end class DistansElev
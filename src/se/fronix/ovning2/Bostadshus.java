package se.fronix.ovning2;

public class Bostadshus extends Hus{
	
	boolean tillägsisolerat;
	
	Bostadshus(boolean isol)
	{
		tillägsisolerat = isol;
	}
	
	Bostadshus()
	{
		tillägsisolerat = true;
	}
	
	Bostadshus(double l, double b, int v, boolean isol)
	{
		super(l, b, v);
		tillägsisolerat = true;
	}
	
	Bostadshus(double l, double b, int v)
	{
		this(l, b, v, true);
	}
	
}

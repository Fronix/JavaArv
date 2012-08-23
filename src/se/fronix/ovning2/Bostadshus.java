package se.fronix.ovning2;

public class Bostadshus extends Hus{
	
	boolean till�gsisolerat;
	
	Bostadshus(boolean isol)
	{
		till�gsisolerat = isol;
	}
	
	Bostadshus()
	{
		till�gsisolerat = true;
	}
	
	Bostadshus(double l, double b, int v, boolean isol)
	{
		super(l, b, v);
		till�gsisolerat = true;
	}
	
	Bostadshus(double l, double b, int v)
	{
		this(l, b, v, true);
	}
	
}

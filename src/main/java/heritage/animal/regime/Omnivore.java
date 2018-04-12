package heritage.animal.regime;

import heritage.aliment.Aliment;
//import heritage.animal.Animal;
import heritage.animal.Animal;

public class Omnivore extends Regime
{
	public Omnivore() 
	{
	}
	

	public boolean manger(Aliment aliment)
	{
		return true;
	}
	
	public boolean manger(Animal animal) 
	{

		return true;
	}
	
	public String toString() 
	{
		return super.toString() + "Omnivore";
	}
}

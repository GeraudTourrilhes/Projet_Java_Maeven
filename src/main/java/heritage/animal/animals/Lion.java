package heritage.animal.animals;

import heritage.animal.Animal;
import heritage.animal.regime.Carnivore;
//import heritage.animal.regime.Regime;

public class Lion extends Animal
{

	public Lion(int age, int poids, int taille, String nom) 
	{
		super(age, poids, taille, nom, new Carnivore());
	}

	public void deplacer() 
	{

		
	}

}

package heritage.animal.animals;

import heritage.animal.Animal;
import heritage.animal.regime.Carnivore;
//import heritage.animal.regime.Regime;

public class Hyene extends Animal
{

	public Hyene(int age, int poids, int taille, String nom) 
	{
		super(age, poids, taille, nom, new Carnivore());
	}

	public void deplacer() 
	{

		
	}

}

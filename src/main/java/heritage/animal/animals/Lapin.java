package heritage.animal.animals;

//import heritage.aliment.Aliment;
import heritage.animal.Animal;
import heritage.animal.regime.Herbivore;
//import heritage.animal.regime.Regime;

public class Lapin extends Animal
{


	public Lapin(int age, int poids, int taille, String nom) 
	{
		super(age, poids, taille, nom, new Herbivore());
	}

	public void deplacer() 
	{

		
	}

}

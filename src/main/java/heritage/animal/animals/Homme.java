package heritage.animal.animals;

//import heritage.aliment.Aliment;
import heritage.animal.Animal;
import heritage.animal.regime.Omnivore;
//import heritage.animal.regime.Omnivore;
//import heritage.animal.regime.Regime;

public class Homme extends Animal//Omnivore
{
	


	public Homme(int age, int poids, int taille, String nom) 
	{
		super(age, poids, taille, nom, new Omnivore());
	}

	public void deplacer() 
	{
		
		
	}
	
	

}

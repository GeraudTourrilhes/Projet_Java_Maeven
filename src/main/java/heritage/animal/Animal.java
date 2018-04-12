package heritage.animal;

import heritage.aliment.Aliment;
import heritage.animal.regime.Regime;

public abstract class Animal 
{
	private int age;
	private int poids;
	private int taille;
	private String nom;
	private Regime regime;
	
	
	public Animal(int age, int poids, int taille, String nom,  Regime regime) 
	{
		this.age = age;
		this.poids = poids;
		this.taille = taille;
		this.nom = nom;
		this.regime = regime;
	}
	
	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public int getPoids() 
	{
		return poids;
	}

	public void setPoids(int poids) 
	{
		this.poids = poids;
	}

	public int getTaille() 
	{
		return taille;
	}

	public void setTaille(int taille) 
	{
		this.taille = taille;
	}

	public String getNom() 
	{
		return nom;
	}

	public void setNom(String nom) 
	{
		this.nom = nom;
	}

	public Regime getRegime() 
	{
		return regime;
	}

	public void setRegime(Regime regime) 
	{
		this.regime = regime;
	}
	
	public abstract void deplacer();
	
	public boolean manger(Aliment aliment)
	{
		return this.regime.manger(aliment);
	}
	
	public boolean manger(Animal animal)
	{
		return this.regime.manger(animal);
	}

}

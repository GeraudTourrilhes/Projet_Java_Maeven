package heritage.aliment;

import heritage.aliment.type.TypeAliment;

public class Aliment 
{
	private String nom;
	private TypeAliment type;
	
	
	
	public Aliment(String nom, TypeAliment type) {
		super();
		this.nom = nom;
		this.type = type;
	}

	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public TypeAliment getType() {
		return type;
	}
	public void setType(TypeAliment type) {
		this.type = type;
	}

	
}

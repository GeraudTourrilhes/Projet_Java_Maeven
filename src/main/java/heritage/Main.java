package heritage;


import heritage.aliment.Aliment;
import heritage.aliment.type.TypeAliment;
import heritage.animal.animals.*;


public class Main 
{
	public static void main(String[] args) 
	{
		Aliment salade = new Aliment("salade", TypeAliment.Herbivore);
		Aliment viande = new Aliment("viande", TypeAliment.Carnivore);
		
		Homme homme = new Homme(45, 50, 172, "Ho");
		Hyene hyene = new Hyene(45, 50, 172, "Hy");
		Lion lion = new Lion(45, 50, 172, "Li");
		Lapin lapin = new Lapin(45, 50, 172, "La");
		
		
		System.out.println("Lion:");
		System.out.println(lion.getRegime());
		System.out.print(lion.manger(salade));
		System.out.println(" il ne peut pas manger de la salade");
		System.out.print(lion.manger(viande));
		System.out.println(" il peut manger de la viande");
		System.out.print(lion.manger(lapin));
		System.out.println(" il peut manger du lapin");
		
		
		System.out.println();
		System.out.println("Hyene:");
		System.out.println(hyene.getRegime());
		System.out.print(hyene.manger(lion));
		System.out.println(" elle peut manger du lion");
		
		System.out.println();
		System.out.println("Lapin:");
		System.out.println(lapin.getRegime());
		System.out.print(lapin.manger(salade));
		System.out.println(" il peut manger de la salade");
		System.out.print(lapin.manger(viande));
		System.out.println(" il ne peut pas manger de la viande");
		System.out.print(lapin.manger(homme));
		System.out.println(" il ne peut pas manger de l'homme");
		
		System.out.println();
		System.out.println("Homme:");
		System.out.println(homme.getRegime());
		System.out.print(homme.manger(salade));
		System.out.println(" il peut manger de la salade");
		System.out.print(homme.manger(viande));
		System.out.println(" il peut manger de la viande");
		System.out.print(homme.manger(homme));
		System.out.println(" il peut manger de l'homme");
		
	}

}

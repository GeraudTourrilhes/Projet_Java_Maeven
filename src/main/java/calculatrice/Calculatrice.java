package calculatrice;

public class Calculatrice 
{


	public static float ajouter(float a, float b)
	{
		return a + b;
		
	}
	public static float soustraire(float a, float b)
	{
		return a - b;
		
	}
	public static float multiplier(float a, float b)
	{
		return a * b;
		
	}
	public static float diviser(float a, float b)
	{
		return a / b;
		
	}
	
	public static String calculer(String[] args)
	{
		float result = 0;
		boolean plus = true;
		boolean moins = false;
		boolean multiplier = false;
		boolean diviser = false;
		String calc = "";
		
		for (int i = 0; i < args.length; i++) {

			// System.out.println(args[i]);
			calc += args[i] + " ";
			if (!args[i].equals("=")) {

				if (plus) {
					result = Calculatrice.ajouter(result, Integer.parseInt(args[i]));
					plus = false;
				} else if (moins) {
					result = Calculatrice.soustraire(result, Integer.parseInt(args[i]));
					moins = false;
				} else if (multiplier) {
					result = Calculatrice.multiplier(result, Integer.parseInt(args[i]));
					multiplier = false;
				} else if (diviser) {
					result = Calculatrice.diviser(result, Integer.parseInt(args[i]));
					diviser = false;
				} else if (args[i].equals("+")) {
					plus = true;
				} else if (args[i].equals("-")) {
					moins = true;
				} else if (args[i].equals("x")) {
					multiplier = true;
				} else if (args[i].equals("/")) {
					diviser = true;
				}

			}
				

		}
		return calc + result;
		
	}
}

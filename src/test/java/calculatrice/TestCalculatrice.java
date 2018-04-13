package calculatrice;

import static org.junit.Assert.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestCalculatrice extends TestCase{

	public static Test suite() {
		return new TestSuite(TestCalculatrice.class);
	}

	public void testAjouter() {

		assertTrue(Calculatrice.ajouter(1, 2) == 3);
		assertTrue(Calculatrice.ajouter(0, 0) == 0);
		assertTrue(Calculatrice.ajouter(-1, -2) == -3);
		assertTrue(Calculatrice.ajouter(-1, 2) == 1);
		assertFalse(Calculatrice.ajouter(0, 1) == 0);

	}

	public void testSoustraire() {

		assertTrue(Calculatrice.soustraire(5, 2) == 3);
		assertTrue(Calculatrice.soustraire(0, 0) == 0);
		assertTrue(Calculatrice.soustraire(-1, -2) == 1);
		assertTrue(Calculatrice.soustraire(-1, 2) == -3);
	}

	public void testDiviser() {

		assertTrue(Calculatrice.diviser(5, 2) == 2.5);
		assertTrue(Calculatrice.diviser(-1, -2) == 0.5);
		assertTrue(Calculatrice.diviser(-4, 2) == -2);
		assertFalse(Calculatrice.diviser(8, 4) == 5);
	}

	public void testDiviserParZero() {
		assertTrue(Float.isInfinite(Calculatrice.diviser(5, 0)));
	}

	public void testMultiplier() {

		assertTrue(Calculatrice.multiplier(5, 2) == 10);
		assertTrue(Calculatrice.multiplier(0, 50) == 0);
		assertTrue(Calculatrice.multiplier(-1, -2) == 2);
		assertTrue(Calculatrice.multiplier(-4, 2) == -8);
		assertFalse(Calculatrice.multiplier(8, 4) == 5);
	}
}

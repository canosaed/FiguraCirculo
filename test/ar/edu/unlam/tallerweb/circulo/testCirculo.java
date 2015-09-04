package ar.edu.unlam.tallerweb.circulo;

import org.junit.Assert;
import org.junit.Test;

public class testCirculo {

	@Test
	public void calculaArea() {
		Circulo c = new Circulo(1);
		Assert.assertEquals(Math.PI, c.area(), 0.01);
	}
	
	@Test
	public void calculaPerimetro() {
		Circulo c = new Circulo(1);
		double perimetroC = 2*1* Math.PI;
		Assert.assertEquals(perimetroC, c.perimetro(), 0.01);
	}

}

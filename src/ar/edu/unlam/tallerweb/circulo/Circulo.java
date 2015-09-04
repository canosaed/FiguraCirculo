package ar.edu.unlam.tallerweb.circulo;

public class Circulo {

	public double radio;
	private double perimetro;

	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double perimetro (){
		perimetro= 2* Math.PI * radio;
		return perimetro;
	} 
	
	public double area(){
		return Math.PI * radio * radio;
	}
}


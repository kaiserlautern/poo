package geometria;

public class Circulo extends Forma{

	private double raio;
	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double area() {
		return Math.PI*raio*raio;
	}

	public double getRaio() {
		return this.raio;
	}
}

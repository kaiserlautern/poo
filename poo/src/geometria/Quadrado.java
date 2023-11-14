package geometria;

public class Quadrado extends Forma{

	private double lado;
	
	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}
	public double area() {
		return lado*lado;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	
}

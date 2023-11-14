package geometria;

public class FormasApp {

	public static  void  imprimeArea(Forma f) {
		System.out.println("Area da forma: "+f.area());
	}
	
	public static void main(String[] args) {
		
		Circulo c1 = new Circulo(2.0);
		Circulo c2 = new Circulo(3.0);
		Quadrado q1 = new Quadrado(2.0);
		Quadrado q2 = new Quadrado(3.0);
		
		imprimeArea(c1);
		imprimeArea(c2);
		imprimeArea(q1);
		imprimeArea(q2);
	}

}

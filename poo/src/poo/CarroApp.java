package poo;

public class CarroApp {

	public static void main(String[] args) {
		Motor m1 = new Motor("Diesel", 180);
		Motor m2 = new Motor("Eletrico",150);
		Carro c1 = new Carro("Amarok","Vermelha",m1);
		Carro c2 = new Carro("Zoe","prata", m2);
		c1.ligar();
		c2.ligar();

	}

}

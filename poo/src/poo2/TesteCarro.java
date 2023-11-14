package poo2;

public class TesteCarro {

	public static void main(String[] args) {
		Carro c1 = new Carro("Corolla","branco",157);
//		c1.marca= "Corolla";
//		c1.cor = "branca";
//		c1.potencia = 157;
		System.out.println(c1.getMarca());
		c1.setIdade(-10); //dá erro!
		
		System.out.println(new Integer(2).compareTo(3));
	}
}

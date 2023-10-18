package formas;

public class App {

	public static void main(String[] args) {

		FormaAbstrata c1 = new Circulo(2.0);
		c1.nome = "circulo";
		FormaAbstrata q1 = new Quadrado(2.0);
		q1.nome="quadrado";
		c1.exibeInfo();
		q1.exibeInfo();
		
	}

}

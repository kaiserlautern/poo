package animais;

public class App {
	public static void main(String[] args) {
		Cachorro c1 = new Cachorro();
		c1.nome="bobby";
		c1.comer();
		
		Gato g1 = new Gato();
		g1.nome="bichano";
		g1.comer();
		System.out.println(g1.toString());
		
		Animal a1 = new Animal();
		System.out.println(a1.toString());
	}
}

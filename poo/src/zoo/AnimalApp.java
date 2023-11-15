package zoo;

public class AnimalApp {

	public static void main(String[] args) {
	
		Animal[] animais = new Animal[2];
		
		Cachorro c1 = new Cachorro("Totó");
		Gato g1 = new Gato("Bichano");
		animais[0] = c1;
		animais[1] = g1;
		
		for (Animal a : animais) {
			a.fazBarulho();
		}

	}

}

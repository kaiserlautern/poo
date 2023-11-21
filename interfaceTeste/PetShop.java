package interfaceTeste;

public class PetShop {

	Animal[] animais = new Animal[3];

	void alimenta(Animal[] animais) {
		for (Animal a : animais) {
			a.comer();
		}
	}
	void amamentar(Mamifero m) {
		m.mamar();
	}
	
	public static void main(String[] args) {
		Gato g1 = new Gato();
		Cachorro c1 = new Cachorro();
		PetShop p1 = new PetShop();
		Sapo s1 = new Sapo();
		p1.animais[0]=c1;
		p1.animais[1] = g1;
		p1.animais[2]=s1;
		p1.alimenta(p1.animais);
		p1.amamentar(g1);
	}

}

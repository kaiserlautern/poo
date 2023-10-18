package interfaceTeste;

public class Gato implements Animal,Mamifero{

	public void comer() { System.out.println("gato comendo"); }
	public void dormir() {System.out.println("gato dormindo");}
	@Override
	public void mamar() {
		System.out.println("gato mamando");
	}
}

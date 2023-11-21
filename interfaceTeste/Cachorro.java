package interfaceTeste;

public class Cachorro implements Animal,Mamifero{
	public void comer() { System.out.println("cachorro comendo"); }
	public void dormir() {System.out.println("cachorro dormindo");}
	@Override
	public void mamar() {
		System.out.println("cachorro mamando");
	}

}

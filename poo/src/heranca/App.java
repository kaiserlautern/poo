package heranca;

public class App {
	public static void main(String[] args) {
		Cachorro p1 = new Cachorro();
		Boca b1 = new Boca();
		p1.boca = b1;
		p1.boca.comer();
		p1.dormir();
		p1.nome= "lulu";
	}
}

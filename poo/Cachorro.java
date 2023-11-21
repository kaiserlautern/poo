package poo;

public class Cachorro extends Animal{
 
	
	public void dormir() {
		System.out.println("cachorro dormindo");
	}
	@Override
//	public void comer() {
//		System.out.println("cachorro comendo");
//	}
	public static void main(String[] args) {
		Cachorro c1 = new Cachorro("Totó","poodle");
		c1.dormir();
		Animal a1 = new Animal();
		//Animal a1 = new Animal();  //classe abstrata nao pode ser instanciada
	}

	public Cachorro(String nome, String raca) {
		super(nome, raca);
		// TODO Auto-generated constructor stub
	}
	

}

package poo;

public abstract class Animal {
 
	String nome;
	String raca;
	
	
	public Animal(String nome, String raca) {
		super();
		this.nome = nome;
		this.raca = raca;
	}
//	public abstract void dormir();
//	public abstract void comer();
//	
	public void acordar() {
		System.out.println("acordando...");
	}
}

package poo;
//1. cria a classe
public class Pincel {
	// 2. cria atributos
	String cor;
	String marca;
	int peso;
	static int quantidadeDePinceis = 0;
	
	// 3. cria métodos
	 void escrever() {
		System.out.println("escrevendo na cor "+cor) ;
	}
	 static void apagar() {
		 System.out.println("apagando...") ;
	 }

	Pincel(int peso) {
		this.peso = peso;
	}
	public Pincel(String cor, String marca, int peso) {
		this.cor = cor;
		this.marca = marca;
		this.peso = peso;
	}
	Pincel(String cor, String marca){ //construtor 2 strings 
		 this.cor = cor;
		 this.marca = marca;
	 }
	 Pincel(String color){ //construtor 1 string
		 cor = color;
	 }
	 public static void main(String[] args) {
		Pincel p1 = new Pincel("Azul"); //cria objetos
		p1.marca = "BRW";  //5. usa objeto (notação ponto)
	
		p1.escrever();
		p1.quantidadeDePinceis++;
		
		Pincel p2 = new Pincel("Vermelho"); //cria objetos
		p2.quantidadeDePinceis++;
		//p2.cor = "Vermelha";  //5. usa objeto (notação ponto)
		p2.escrever();
		
		Pincel p3 = new Pincel("Verde", "Pilot"); //cria objetos
		p3.quantidadeDePinceis++;
		p3.escrever();
		
		System.out.println(p1.quantidadeDePinceis);
		p1.escrever();
		Pincel.apagar();
		
		Pincel p4 = new Pincel("Preto", "Pilot", 200);
	}
}
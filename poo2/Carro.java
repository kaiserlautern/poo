package poo2;

public class Carro {

	private String marca;
	private String cor;
	private int potencia;
	private int idade;
	 
	public Carro(String marca, String cor, int potencia) {
		this.marca=marca;
		this.cor=cor;
		this.potencia=potencia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if(idade>0) {
				this.idade = idade;
		}else {System.out.println("idade deve ser maior do que zero");
	}
	
}
}
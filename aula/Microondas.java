package aula;

public class Microondas implements Maquina{

	@Override
	public void ligar() {
		System.out.println("apertando o bot�o liga");		
	}

	@Override
	public void desligar() {

		System.out.println("apertando o bot�o cancela");	
	}

}

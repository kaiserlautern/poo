package aula;

public class Microondas implements Maquina{

	@Override
	public void ligar() {
		System.out.println("apertando o botão liga");		
	}

	@Override
	public void desligar() {

		System.out.println("apertando o botão cancela");	
	}

}

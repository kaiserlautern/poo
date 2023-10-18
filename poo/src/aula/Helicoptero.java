package aula;

public class Helicoptero implements Voador, Maquina{

	@Override
	public void voar() {
		System.out.println("helicoptero girando as hélices");
	}

	@Override
	public void ligar() {
		System.out.println("girando a chave no sentido horario");
	}

	@Override
	public void desligar() {

		System.out.println("girando a chave no sentido anti-horario");
	}

}

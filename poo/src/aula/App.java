package aula;

public class App {

	public static void main(String[] args) {
	
		Voador v1 = new Helicoptero();
		Voador v2 = new Mosquito();
		Maquina m1 = new Microondas();
		Maquina m2 = new Helicoptero();
		
		
		Voador[] voadores = new Voador[2];
		voadores[0] = v1;
		voadores[1] = v2;
		for (Voador voador : voadores) {
			voador.voar();
		}
		
		Maquina[] maquinas = new Maquina[2];
		maquinas[0] = (Maquina)v1;
		maquinas[1] = m2;
		for (Maquina maquina : maquinas) {
			maquina.ligar();
		}
	}

}

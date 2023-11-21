package formas;

public class Circulo extends FormaAbstrata {

	double raio;
	
	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	@Override
	void exibeInfo() {
		System.out.println("Forma: "+this.nome+
				", area: "+this.calculaArea()+
				", Perimetro: "+this.calculaPerimetro()
			);
	}

	@Override
	public double calculaArea() {
		return Math.PI * raio * raio;
	}

	@Override
	public double calculaPerimetro() {
		return 2 * Math.PI * raio;
	}

}

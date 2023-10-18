package formas;

public class Quadrado extends FormaAbstrata{

	double lado;
	
	public Quadrado(double l) {
		this.lado = l;
	}
	@Override
	public double calculaArea() {
		return this.lado * this.lado;
	}

	@Override
	public double calculaPerimetro() {
		return 4 * this.lado;
	}

	@Override
	void exibeInfo() {
		System.out.println("Forma: "+this.nome+
				", area: "+this.calculaArea()+
				", Perimetro: "+this.calculaPerimetro()
			);
		
	}

}

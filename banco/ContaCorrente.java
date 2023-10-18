package banco;

public class ContaCorrente extends Conta{
	@Override
	public void saca(double valor) {
		this.saldo -= (valor + 0.10);
	}
}

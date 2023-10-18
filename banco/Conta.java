package banco;

public class Conta {
	private String titular;
	protected double saldo;
	private double limite; // adicionando um limite a conta

	public double getSaldo() {
		return this.saldo + this.limite;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void saca(double valor) {
		// posso sacar até o saldo
		if (valor > this.saldo) {
			System.out.println("Não	posso	sacar	um	valor	maior	que	o	saldo!");
		} else {
			this.saldo = this.saldo - valor;
		}

	}

	public void deposita(double valor) {

	}

}

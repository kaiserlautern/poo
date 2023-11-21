package agenda;

public class ContatoPessoal extends Contato{
	
	private String cpf;

	public ContatoPessoal(String nome, String telefone, String cpf) {
		super(nome,telefone);
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Contato: nome=" + nome + ", telefone=" + telefone + ", cpf=" + cpf;
	}

}

package agenda;

public class ContatoEmpresarial extends Contato{

		private String cnpj;

		public ContatoEmpresarial(String nome, String telefone, String cnpj) {
			super(nome,telefone);
			this.cnpj = cnpj;
		}

		@Override
		public String toString() {
			return "Contato: nome=" + nome + ", telefone=" + telefone + ", cnpj=" + cnpj;
		}

}

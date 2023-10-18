package agenda;

public class Agenda {

	Contato[] contatos = new Contato[100];
	int ultimoElemento=0;
	
	public void adiciona(Contato c) {
		contatos[ultimoElemento]=c;
		ultimoElemento++;
	}

	public void lista() {
		for (int i=0; i < ultimoElemento; i++) {
			System.out.println(contatos[i]);
		}
	}
	
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		Contato c1 = new ContatoPessoal("Zé", "2345678", "123.456.789-09");
		agenda.adiciona(c1);
		Contato c2 = new ContatoPessoal("Maria", "3456789", "321.654.987-11");
		agenda.adiciona(c2);
		//agenda.lista();
		
		Contato ce1 = new ContatoEmpresarial("acme", "123212312", "123.456/0001-98");
		agenda.adiciona(ce1);

		agenda.lista();
	}

}

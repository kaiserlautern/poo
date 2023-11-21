package prova;

public class Agenda {

	Contato[] agenda = new Contato[2];
	int i = 0;
	public void listar() {
		for (Contato c : agenda) {
			System.out.println(c.getNome()+":  "+c.getTelefone());
		}
	}
	public void adicionar(Contato c) {
		agenda[i++] = c;
	}
	
}

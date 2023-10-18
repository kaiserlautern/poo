package prova;

public class ContatoApp {
	  a1.adicionar(c1);
	  public static void main(String[] args) {
			Contato c1 = new Contato("Jose","1234");
//			System.out.println(c1.getNome());
//		    System.out.println(c1.getTelefone());
			
		    Contato c2 = new Contato("Maria","3456");
//			System.out.println(c2.getNome());
//		    System.out.println(c2.getTelefone());
			
		    Agenda a1 = new Agenda();
		    a1.adicionar(c1);
		    a1.adicionar(c2);
		    a1.listar();
		}
}

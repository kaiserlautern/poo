package hoje;

public class Aluno {

	String nome; //modificadores de visibilidade: package
	private int matricula;
	public int idade;
	
	public Aluno(String nome,int matricula, int idade) {
		this.nome=nome;
		this.matricula= matricula;
		this.idade=idade;
	}
	
	void metodoDefault() {
		System.out.println(this.nome); 
		System.out.println(this.matricula); //
		System.out.println(this.idade);
	}
	
	private void metodoPrivado() {
		System.out.println(this.nome); 
		System.out.println(this.matricula); //
		System.out.println(this.idade);
	}
	
	public void metodoPublico() {
		System.out.println(this.nome); 
		System.out.println(this.matricula); //
		System.out.println(this.idade);
	}
}

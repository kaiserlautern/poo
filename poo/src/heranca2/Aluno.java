package heranca2;

public class Aluno extends Pessoa{

	int matricula;
		
	public Aluno(String nome, int matricula) {
		super(nome);
		this.matricula = matricula;
	}
	void estudar() {
		System.out.println(nome+" estudando");
	}
	public static void main(String[] args) {
		Aluno a1 = new Aluno("José", 1234);
	//	a1.nome = "Zé";
	}
}

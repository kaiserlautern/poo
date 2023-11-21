package hoje;

public class Escola {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Zé",1234,17);
		Aluno a2 = new Aluno("Maria",2345,18);
		Turma t1 = new Turma();
		t1.aluno = a1;
		t1.acessaAtributos();
		a1.metodoDefault();
		a1.metodoPublico();
		a1.metodoPrivado();
	}
}

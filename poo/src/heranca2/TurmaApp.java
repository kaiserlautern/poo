package heranca2;

public class TurmaApp {
public static void main(String[] args) {
		
		Professor p1 = new Professor();
		p1.nome = "Esdras";
		Aluno a1 = new Aluno();
		a1.nome="Maria";
		Aluno a2 = new Aluno();
		a2.nome="José";
		Aluno a3 = new Aluno();
		a3.nome="Carlos";
		Turma t1 = new Turma();
		t1.alunos[0] = a1; //"cadastrando aluno na turma
		t1.alunos[1] = a2;
		t1.alunos[2] = a3;
		
		p1.ensinar();
		for (Aluno a: t1.alunos) {
			a.estudar();
		}
}
}
package hoje;

public class Turma {

	Aluno aluno;  
	
	void acessaAtributos() {
		System.out.println(aluno.nome); //package
		//System.out.println(aluno.matricula); //private
		System.out.println(aluno.idade); //public
	}
}

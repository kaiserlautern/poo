package amanha;

import hoje.*;

public class Professor {

	Aluno aluno;
	Turma turma;
	
	void acessaAtributos() {
		//System.out.println(aluno.nome); //package
		//System.out.println(aluno.matricula); //private
		System.out.println(aluno.idade); //public
	}
}

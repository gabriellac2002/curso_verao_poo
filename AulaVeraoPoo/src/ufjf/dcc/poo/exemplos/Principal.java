package ufjf.dcc.poo.exemplos;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		
		pessoa1.cpf = "001.543.876-42";
		pessoa1.idade = 99;
		pessoa1.nome = "Gabriel Barbosa";
		pessoa1.RG = "MG-673287";
		pessoa1.sexo = "M";
		
		pessoa2.cpf = "001.453.446-42";
		pessoa2.idade = 19;
		pessoa2.nome = "Gabriel Barbosa";
		
		pessoa3.cpf = "098.876.432-43";
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.nome = "Tio da limpeza";
		funcionario1.cargo = "faxineiro";
		funcionario1.matricula = "1234567";
		
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Gabi";
		aluno1.curso = "Engenharia Computacional";
		aluno1.registro = "202165512b";
		
		Professor professor1 = new Professor();
		professor1.nome = "Robson";
		professor1.matricula = "56843";
		professor1.numAulas = 20;
		
	}

}

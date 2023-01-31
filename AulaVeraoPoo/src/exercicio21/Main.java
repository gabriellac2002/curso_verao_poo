package exercicio21;

import java.util.*;

import Exercicio20.Pessoa;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		aluno.setNome("Gabi");
		aluno.setNota1(10);
		aluno.setNota2(10);
		aluno.setTrabalho(3);
		
		System.out.println("Voce precisa de " + aluno.notaFinal() + " para passar");

	}

}

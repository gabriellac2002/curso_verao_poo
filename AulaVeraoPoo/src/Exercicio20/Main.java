package Exercicio20;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Pessoa p1 = new Pessoa("Ze", 35);
		Pessoa p2 = new Pessoa("Ana", 42, "F");
		Pessoa p3 = new Pessoa();
		
		p3.setNome("Jorge");
		p3.setIdade(37);
		p3.setSexo("M");
		
		
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		for(int i=0; i<3; i++)
		{
			Pessoa p = new Pessoa();
			System.out.println("Digite o nome da pessoa: ");
			p.setNome(teclado.nextLine());
			System.out.println("Idade: ");
			p.setIdade(Integer.parseInt(teclado.nextLine()));
			System.out.println("Sexo: ");
			p.setSexo(teclado.nextLine());
			pessoas.add(p);
			
		}
		
		for(Pessoa p : pessoas)
		{
			System.out.println("O nome da pessoa " + p.getNome());
			System.out.println("A idade da pessoa é " + p.getIdade());
		}
	}

}

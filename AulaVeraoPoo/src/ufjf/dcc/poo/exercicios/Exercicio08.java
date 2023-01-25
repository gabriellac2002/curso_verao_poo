package ufjf.dcc.poo.exercicios;
import java.util.*;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com a idade: ");
		int idade = teclado.nextInt();
		
		if(idade <= 3)
			System.out.println("Bebê");
		else if (idade > 3 && idade<=13)
			System.out.println("Criança");
		else if(idade > 13 && idade <20)
			System.out.println("Adulto");
		else
			System.out.println("Idoso");

	}

}

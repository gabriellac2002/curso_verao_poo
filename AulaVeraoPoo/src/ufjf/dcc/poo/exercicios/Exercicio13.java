package ufjf.dcc.poo.exercicios;
import java.util.*;

public class Exercicio13 {

	public static void main(String[] args) {
		int x=0;
		int soma = 0;
		Scanner teclado = new Scanner(System.in);
		
		while(x != -1)
		{
			System.out.println("Escreva o numero: ");
			x = teclado.nextInt();
			soma = soma + x;
		}
		
		System.out.println("A soma é: " + soma);

	}

}

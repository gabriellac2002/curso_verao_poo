package ufjf.dcc.poo.exercicios;
import java.util.*;

public class exercicio17 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce deseja ler: ");
		int n = teclado.nextInt();
		int cout_impar = 0;
		int cout_par = 0;
		
		for(int i = 0; i < n ; i++)
		{
			System.out.println("Digite o nuemro: ");
			int num = teclado.nextInt();
			
			if(num % 2 == 0)
				cout_par = cout_par + 1;
			else
				cout_impar = cout_impar + 1;
			
		}
		
		System.out.println("Quantidade de nuemros par: " + cout_par);
		System.out.println("Quantidade de nuemros impar: " + cout_impar);

	}

}

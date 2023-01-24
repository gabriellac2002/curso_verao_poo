package ufjf.dcc.poo.exemplos;
import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // ler valor do teclado
        double n1, n2, n3; // Declaraçao de variaveis
        System.out.println("Digite o primeiro valor");
        n1 = teclado.nextDouble(); // define a entrada
        System.out.println("Digite o segundo valor");
        n2 = teclado.nextDouble();
        System.out.println("Digite o terceiro valor");
        n3 = teclado.nextDouble();
        double media = (n1 + n2 + n3) / 3;
        System.out.println("Media: " + media);
    }
}

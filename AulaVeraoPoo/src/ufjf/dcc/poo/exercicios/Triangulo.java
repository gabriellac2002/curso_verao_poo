package ufjf.dcc.poo.exercicios;
import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); // leitor do teclado
        int altura, base; // Dados de entrada
        float area;
        System.out.println("Informe a altura: ");
        altura = teclado.nextInt();
        System.out.println("Informe a base: ");
        base = teclado.nextInt();
        area = 0.5f * altura + base;
        System.out.println("Area: " + area);

	}

}

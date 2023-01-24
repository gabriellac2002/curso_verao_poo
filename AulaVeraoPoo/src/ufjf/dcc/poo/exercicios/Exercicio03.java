package ufjf.dcc.poo.exercicios;
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b, c;
        double x1, x2, delta;

        System.out.println("Digite o valor de a: ");
        a = teclado.nextInt();
        System.out.println("Digite o valor de b: ");
        b = teclado.nextInt();
        System.out.println("Digite o valor de c: ");
        c = teclado.nextInt();

        delta = (b*b) - 4 * a * c;
        if(delta >= 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        } else {
            System.out.println("Delta Negativo");
        }



    }
}

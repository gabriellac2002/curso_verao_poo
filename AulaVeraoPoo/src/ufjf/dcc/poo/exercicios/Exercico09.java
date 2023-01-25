package ufjf.dcc.poo.exercicios;
import java.util.*;

public class Exercico09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("A = ");
		a = teclado.nextInt();
		
		System.out.println("B = ");
		b = teclado.nextInt();
		
		System.out.println("C = ");
		c = teclado.nextInt();
		
		if(b-c < a && a < b+c)
			System.out.println("Triangulo existe");
		else if(a-c < b && b<a+c)
			System.out.println("Triangulo existe");
		else if(a-b < c && c<a+b)
			System.out.println("Triangulo existe");
		else
			System.out.println("Triangulo não existe");
	}

}

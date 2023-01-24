package ufjf.dcc.poo.exercicios;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double larguraTerreno, comprimentoTerreno, larguraCasa, comprimentoCasa;
        System.out.println("Digite a largura do terreno: ");
        larguraTerreno = teclado.nextDouble();
        System.out.println("Digite o comprimento do terreno: ");
        comprimentoTerreno = teclado.nextDouble();
        System.out.println("Digite a largura da casa: ");
        larguraCasa = teclado.nextDouble();
        System.out.println("Digite o comprimento da casa: ");
        comprimentoCasa = teclado.nextDouble();

        double areaTerreno = larguraTerreno * comprimentoTerreno;
        double areaCasa = larguraCasa * comprimentoCasa;
        double areaRestante = areaTerreno - areaCasa;

        System.out.println("Porcentagem Livre: " + (areaRestante/areaTerreno) * 100);

    }
}

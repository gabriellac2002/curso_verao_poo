package ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		int km,l;
		String kmDirigidos, litros;
		
		kmDirigidos = JOptionPane.showInputDialog("Km ", null);
		km = Integer.parseInt(kmDirigidos);
		
		litros = JOptionPane.showInputDialog("litros ", null);
		l = Integer.parseInt(litros);
		
		JOptionPane.showMessageDialog(null,(float) km/l);

	}

}

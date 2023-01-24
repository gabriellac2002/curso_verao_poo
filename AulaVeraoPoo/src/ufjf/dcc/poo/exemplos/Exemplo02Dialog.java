package ufjf.dcc.poo.exemplos;

import javax.swing.JOptionPane;

public class Exemplo02Dialog {
	public static void main(String[] args) {
		String num1,num2;
		int n1,n2;
		
		num1 = JOptionPane.showInputDialog("n1: ", null);
		n1 = Integer.parseInt(num1);
		
		num2 = JOptionPane.showInputDialog("n2: ", null);
		n2 = Integer.parseInt(num2);
		
		JOptionPane.showMessageDialog(null, n1+n2);
	}
}

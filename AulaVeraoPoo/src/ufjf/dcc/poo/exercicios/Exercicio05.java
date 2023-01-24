package ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		int p1x,p1y,p2x,p2y;
		String ponto1x, ponto1y, ponto2x, ponto2y;
		
		ponto1x = JOptionPane.showInputDialog("Ponto 1 - x: ", null);
		p1x = Integer.parseInt(ponto1x);
		
		ponto1y = JOptionPane.showInputDialog("Ponto 1 - y: ", null);
		p1y = Integer.parseInt(ponto1y);
		
		ponto2x = JOptionPane.showInputDialog("Ponto 2 - x: ", null);
		p2x = Integer.parseInt(ponto2x);
		
		ponto2y = JOptionPane.showInputDialog("Ponto 2 - y: ", null);
		p2y = Integer.parseInt(ponto2y);
		
		float dist = (float) Math.sqrt(Math.pow( p2x - p1x, 2) + Math.pow(p2y - p1y, 2));
		
		JOptionPane.showMessageDialog(null, dist);
	}

}

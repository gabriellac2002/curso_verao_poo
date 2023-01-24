package ufjf.dcc.poo.exemplos;

import javax.swing.JOptionPane;

public class Exemplo01Dialog {

	public static void main(String[] args) {
		String nomeUsuario;
		nomeUsuario = JOptionPane.showInputDialog(null);
		JOptionPane.showMessageDialog(null, nomeUsuario);
	}

}

package controller;

import model.Automovel;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Automovel auto = new Automovel();
		auto.setMarca("Mercedes");
		auto.setKmRodados(4.5f);
		auto.setCapacidadeTanque(55);
		System.out.println("Valor de consumo: " + auto.calcularConsumo(5.11f));

	}

}

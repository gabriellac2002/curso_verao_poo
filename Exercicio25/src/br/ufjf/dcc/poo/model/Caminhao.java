package br.ufjf.dcc.poo.model;

public class Caminhao extends Veiculo{
	private double licenca;
	private double valor_esperado;
	
	public double getLicenca() {
		return licenca;
	}
	public void setLicenca(double licenca) {
		this.licenca = licenca;
	}
	public double getValor_esperado() {
		return valor_esperado;
	}
	public void setValor_esperado(double valor_esperado) {
		this.valor_esperado = valor_esperado;
	}
}

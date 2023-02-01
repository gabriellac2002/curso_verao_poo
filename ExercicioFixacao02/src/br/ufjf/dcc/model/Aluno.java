package br.ufjf.dcc.model;

public class Aluno extends Pessoa{
	private String matricula;
	private double mensalidade;
	private double bolsa;
	
	public double calcularMensalidade() {
		return getMensalidade() - getBolsa();
	}
	

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	public double getBolsa() {
		return bolsa;
	}

	public void setBolsa(double bolsa) {
		this.bolsa = bolsa;
	}
}

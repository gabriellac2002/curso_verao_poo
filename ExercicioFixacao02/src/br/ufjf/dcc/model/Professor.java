package br.ufjf.dcc.model;

public class Professor {
	private String codigo;
	private String formacao;
	private double horaAula;
	private int quantidadeAula;
	
	public double calcularPagamento() {
		return getHoraAula() * getQuantidadeAula();
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public double getHoraAula() {
		return horaAula;
	}
	public void setHoraAula(double horaAula) {
		this.horaAula = horaAula;
	}
	public int getQuantidadeAula() {
		return quantidadeAula;
	}
	public void setQuantidadeAula(int quantidadeAula) {
		this.quantidadeAula = quantidadeAula;
	}
}

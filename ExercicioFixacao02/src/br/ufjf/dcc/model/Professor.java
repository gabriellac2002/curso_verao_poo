package br.ufjf.dcc.model;

import java.util.ArrayList;

public class Professor extends Pessoa{
	private String codigo;
	private String formacao;
	private double horaAula;
	private int quantidadeAula;
	private ArrayList<Diciplina> diciplinas;
	
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

	public ArrayList<Diciplina> getDiciplinas() {
		return diciplinas;
	}

	public void setDiciplinas(ArrayList<Diciplina> diciplinas) {
		this.diciplinas = diciplinas;
	}
}

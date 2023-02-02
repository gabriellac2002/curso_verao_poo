package br.ufjf.dcc.poo.model;

public class Cliente extends Pessoa{
	private int codigo;
	private Atendimento atend;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Atendimento getAtend() {
		return atend;
	}

	public void setAtend(Atendimento atend) {
		this.atend = atend;
	}
}

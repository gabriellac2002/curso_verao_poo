package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Funcionario extends Pessoa {
	private int matricula;
	private Departamento dep;
	private ArrayList<Atendimento> atend = new ArrayList<>();
	private Cliente cliente = new Cliente();
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Departamento getDep() {
		return dep;
	}

	public void setDep(Departamento dep) {
		this.dep = dep;
	}

	public ArrayList<Atendimento> getAtend() {
		return atend;
	}

	public void setAtend(ArrayList<Atendimento> atend) {
		this.atend = atend;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}

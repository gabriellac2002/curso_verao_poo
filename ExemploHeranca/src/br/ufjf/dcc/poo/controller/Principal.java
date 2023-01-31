package br.ufjf.dcc.poo.controller;

import br.ufjf.dcc.poo.model.Aluno;
import br.ufjf.dcc.poo.model.Funcionario;
import br.ufjf.dcc.poo.model.Professor;

public class Principal {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Afu");
		aluno.setCpf("123456789");
		aluno.setRg("MG-123456789");
		aluno.setSexo("M");
		aluno.setMatricula("789456123");
		
		Professor prof = new Professor();
		prof.setRg("987654321");
		prof.setNome("Ronney");
		prof.setCpf("456987");
		prof.setSexo("M");
		prof.setSiape("6547892");
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Carol");
		funcionario.setMatricula("879554");
		funcionario.setRg("9876543210");
		funcionario.setRegistro("ddjdjdjd");
		funcionario.setSexo("F");
		

	}

}

package br.ufjf.dcc.controller;

import java.util.ArrayList;
import java.util.Scanner;

import br.ufjf.dcc.model.Aluno;
import br.ufjf.dcc.model.Diciplina;
import br.ufjf.dcc.model.Professor;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Diciplina> diciplinas = new ArrayList<Diciplina>();
		
		ArrayList<Diciplina> diciplinasProf = new ArrayList<Diciplina>();
		
		Diciplina d1 = new Diciplina();
		d1.setNome("OO");
		d1.setCargaHoraria(60);
		
		Diciplina d2 = new Diciplina();
		d1.setNome("Modelagem");
		d1.setCargaHoraria(60);
		
		
		Diciplina d3 = new Diciplina();
		d1.setNome("Bd");
		d1.setCargaHoraria(60);
		
		Diciplina d4 = new Diciplina();
		d1.setNome("Redes");
		d1.setCargaHoraria(60);
		
		diciplinas.add(d1);
		diciplinas.add(d2);
		diciplinas.add(d3);
		
		diciplinasProf.add(d3);
		diciplinasProf.add(d4);
		
		Aluno aluno = new Aluno();
		aluno.setNome("Pedro");
		aluno.setIdade(25);
		aluno.setSexo("M");
		aluno.setMatricula("123456");
		aluno.setMensalidade(950.00f);
		aluno.setBolsa(120.00f);
		aluno.setDiciplinas(diciplinas);
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Relampago Marquinhos");
		aluno1.setIdade(18);
		aluno1.setSexo("M");
		aluno1.setMatricula("123456");
		aluno1.setMensalidade(950.00f);
		aluno1.setBolsa(180.00f);
		aluno1.setDiciplinas(diciplinas);
		
		Professor prof = new Professor();
		prof.setNome("Gleiph");
		prof.setIdade(36);
		prof.setSexo("M");
		prof.setFormacao("Doutorado");
		prof.setHoraAula(36);
		prof.setQuantidadeAula(5);
		prof.setDiciplinas(diciplinasProf);
		
		ArrayList<Aluno> alunosDiciplina = new ArrayList<>();
		alunosDiciplina.add(aluno1);
		alunosDiciplina.add(aluno);
		
		Diciplina d5 = new Diciplina();
		d5.setNome("Prog Web");
		d5.setCargaHoraria(60);
		d5.setProfessor(prof);
		d5.setAlunos(alunosDiciplina);
		
		for(Aluno a: d5.getAlunos()) {
			System.out.println("Nome: " + a.getNome());
			System.out.println("Sexo: " + a.getSexo());
		}
		

	}

}

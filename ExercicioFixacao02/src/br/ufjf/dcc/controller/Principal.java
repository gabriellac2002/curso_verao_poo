package br.ufjf.dcc.controller;

import java.util.ArrayList;
import java.util.Scanner;

import br.ufjf.dcc.model.Diciplina;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<Diciplina> diciplinas = new ArrayList<Diciplina>();
		
		int x = 0;
		
		do {
			Diciplina d = new Diciplina();
			System.out.println("Nome da disciplina: ");
			d.setNome(teclado.nextLine());
			System.out.println("Carga Horaria da disciplina: ");
			d.setCargaHoraria(Float.parseFloat(teclado.nextLine()));
			
			System.out.println("Deseja continuar?");
			System.out.println("Sim -> 1");
			System.out.println("Não -> 0");
			
			int resp = teclado.nextInt();
			
			if(resp == 1)
				x = 0;
			if(resp == 0)
				x --;
		} while(x != -1);

	}

}

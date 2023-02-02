package br.ufjf.dcc.poo.model;

import java.sql.Date;

public abstract class Veiculo {
	private String nro_placa;
	private String modelo;
	private Date dt_ultima_revisao;
	
	public Date proximaRevisao() {
		return dt_ultima_revisao;
	}
	
	public String getNro_placa() {
		return nro_placa;
	}
	public void setNro_placa(String nro_placa) {
		this.nro_placa = nro_placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Date getDt_ultima_revisao() {
		return dt_ultima_revisao;
	}
	public void setDt_ultima_revisao(Date dt_ultima_revisao) {
		this.dt_ultima_revisao = dt_ultima_revisao;
	}
	
	
}

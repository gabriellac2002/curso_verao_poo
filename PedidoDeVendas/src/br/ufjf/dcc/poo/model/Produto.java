package br.ufjf.dcc.poo.model;

public class Produto {
	private String nomeProduto;
	private int peso;
	private int qtdDisponivel;
	private ItenPedido itens;
	
	public Produto consultarProduto()
	{
		return null;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getQtdDisponivel() {
		return qtdDisponivel;
	}
	public void setQtdDisponivel(int qtdDisponivel) {
		this.qtdDisponivel = qtdDisponivel;
	}

	public ItenPedido getItens() {
		return itens;
	}

	public void setItens(ItenPedido itens) {
		this.itens = itens;
	}
}

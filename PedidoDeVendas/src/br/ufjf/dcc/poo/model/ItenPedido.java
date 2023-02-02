package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class ItenPedido {
	private int quantidade;
	private double preco;
	private Pedido pedido;
	private ArrayList<Produto> produto = new ArrayList<>();
	
	public int incluirItens()
	{
		return quantidade ++;
	}
	
	public int excluirItem() {
		return quantidade --;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public ArrayList<Produto> getProduto() {
		return produto;
	}

	public void setProduto(ArrayList<Produto> produto) {
		this.produto = produto;
	}
	
	
}

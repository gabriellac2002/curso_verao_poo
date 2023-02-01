package model;

public abstract class Veiculo {
	private String marca;
	private float capacidadeTanque;
	private float kmRodados;
	
	public double calcularConsumo(double precoLitro) {
		return 0;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(float capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	public float getKmRodados() {
		return kmRodados;
	}

	public void setKmRodados(float kmRodados) {
		this.kmRodados = kmRodados;
	}
}

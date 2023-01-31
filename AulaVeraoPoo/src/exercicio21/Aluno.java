package exercicio21;

public class Aluno {
	private String matricula;
	private String nome;
	private float nota1;
	private float nota2;
	private float trabalho;
	
	public float media() {
		return (nota1+nota2+trabalho)/3;
	}
	
	public float notaFinal() {
		float mediaAtual = media();
		 float notaFinal = 6 - mediaAtual;
		 
		 if(mediaAtual>6) {
			 return 0;
		 } else {
			 return notaFinal;
		 }
			 
		 
	}

	
	public Aluno() {
		super();
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

	public float getTrabalho() {
		return trabalho;
	}

	public void setTrabalho(float trabalho) {
		this.trabalho = trabalho;
	}
}

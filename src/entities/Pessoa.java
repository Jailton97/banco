package entities;

public class Pessoa {
	String nome; 
	private int numeroConta;
	
	public Pessoa(String nome, int numeroConta) {
		this.nome = nome;
		this.numeroConta = numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String toString() {
		return "Nome: " + nome + ", Número da conta: " + numeroConta;
	}

	
	
	

}

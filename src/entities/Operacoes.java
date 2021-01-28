package entities;

public class Operacoes {
	private double saldoConta;
	private double valorDeposito;
	private double valorSaque;
	private String opcao = "s";
	
	public Operacoes() {

	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public double getValorDeposito() {
		return valorDeposito;
	}

	public void setValorDeposito(double valorDeposito) {
		this.valorDeposito = valorDeposito;
	}
	
	
	public double getValorSaque() {
		return valorSaque;
	}

	public void setValorSaque(double valorSaque) {
		this.valorSaque = valorSaque;
	}

	public double depositoInicial(String opcao, double valorDeposito) {
		this.opcao = opcao;
		this.valorDeposito = valorDeposito;
		
		if (this.opcao.equals(opcao)) {
			return saldoConta + valorDeposito;
		}
		
		else {
			return saldoConta = 0.00;
		}
	}
	
	
	public void deposito(double valorDeposito) {
		this.valorDeposito = valorDeposito;
		saldoConta = valorDeposito + saldoConta;
	}
	
	public void saque(double valorSaque) {
		this.valorSaque = valorSaque;
		saldoConta = (saldoConta - 5.00) - valorSaque;
	}
	
	
	public double saldo() {
		return saldoConta; 
	}
	
	public String toString() {
		return "Saldo: " + saldo();
	}

}

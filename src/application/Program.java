package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Operacoes;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Digite o número da conta: ");
		int numeroConta = sc.nextInt();
		
		sc.nextLine();
		
		Pessoa p = new Pessoa(nome, numeroConta);

		String opcao2 = "s";
		
		System.out.println("Deseja fazer o depósito inicial (s/n): ");
		String opcao = sc.nextLine();
		
		
		double valorDeposito = 0.00;
		
		if(opcao.equals(opcao2)) {
		System.out.println("Digite o valor do depósito: ");
			valorDeposito = sc.nextDouble();
		}
		else {
			valorDeposito = 0.00;
		}
		
		
		Operacoes op = new Operacoes();
		
		op.deposito(valorDeposito);
		
		System.out.println("Dados da conta: ");
		System.out.println(p);
		System.out.println(op);
		
		System.out.println("Entre com o valor do depósito: ");
		valorDeposito = sc.nextDouble();
		op.deposito(valorDeposito);
		System.out.println("Dados atualizados: ");
		System.out.println(p);
		System.out.println(op);
		System.out.println("Entre com o valor do saque: ");
		double valorSaque = sc.nextDouble();
		op.saque(valorSaque);
		System.out.println("Dados atualizados: ");
		System.out.println(p);
		System.out.println(op);

		

		sc.close();
	}

}

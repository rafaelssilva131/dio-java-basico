package com.dio.rafael;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		
//		int numero;
//		String agencia;
//		String nomeCliente;
//		double saldo;
		
		System.out.println("Por favor, digite o número da Conta! ");
		int numero = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Por favor, digite o número da Agência ! ");
		String agencia = sc.next();
		sc.nextLine();
		
		System.out.println("Por favor, digite o Nome !");
		String nomeCliente = sc.nextLine();
		
		System.out.println("Por favor, digite o Saldo !");
		Double saldo = sc.nextDouble();
		
		System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta "+numero+" e seu saldo "+saldo+" já esta disponível para saque");
		sc.close();
	}

}

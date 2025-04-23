package com.nicolas.cursojava.aula13EXRC;

import java.util.Scanner;

public class Exer02 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		//2
		System.out.println("2. Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].");
		
		System.out.println("Um número inteiro por favor:");
		int numeroPedido = scan.nextInt();
		
		System.out.println("O número informado foi " + numeroPedido + "\r \n");
	}
}

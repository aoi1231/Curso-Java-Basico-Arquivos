package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		/*
		2. Faça um programa que leia um nome de usuário e a sua senha e não
		aceite a senha igual ao nome do usuário, mostrando uma mensagem
		de erro e voltando a pedir as informações.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nome de usuário:");
		String nome = scan.next();
		System.out.println("Senha");
		String senha = scan.next();
		
		boolean teste = false;
		
		if (!nome.equals(senha)) {
			teste = true;
		}
		
		while (!teste) {
			System.out.println("Erro! A sua senha não pode ser o mesmo que o username. Tente novamente: ");
			
			System.out.println("Nome de usuário:");
			nome = scan.next();
			System.out.println("Senha");
			senha = scan.next();
			
			if (!nome.equals(senha)) {
				teste = true;
			}
		}
		
		System.out.println("Perfeito");

		scan.close();
	}

}

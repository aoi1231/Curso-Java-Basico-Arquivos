package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		/*
		3. Faça um programa que leia e valide as seguintes informações:
		
			a. Nome: maior que 3 caracteres;
			b. Idade: entre 0 e 150;
			c. Salário: maior que zero;
			d. Sexo: 'f' ou 'm';
			e. Estado Civil: 's', 'c', 'v', 'd';
			*/
		
		Scanner scan = new Scanner(System.in);
		
		//Nome
		System.out.println("Nome:");
		String nome = scan.next();
		boolean teste = false;
		
		if (nome.length() > 3) {
			teste = true;
		}
		
		while (!teste) {
			System.out.println("Erro! O seu nome tem que ser maior que 3 caracteres. Tente novamente: ");
			
			System.out.println("Nome de usuário:");
			nome = scan.next();
			
			if (nome.length() > 3) {
				teste = true;
			}
		}
		
		//Idade
		System.out.println("Idade: ");
		int idade = scan.nextInt();
		teste = false;
		
		if (idade >= 0 && idade <= 150) {
			teste = true;
		}
		
		while (!teste) {
			System.out.println("Erro! Sua idade não pode ser menor que 0 ou ultrapassar 150. Tente novamente: ");
			
			System.out.println("Idade: ");
			idade = scan.nextInt();
			
			if (idade >= 0 && idade <= 150) {
				teste = true;
			}
		}
		
		//Salario
		System.out.println("Salario: ");
		double salario = scan.nextDouble();
		teste = false;
		
		if (salario > 0) {
			teste = true;
		}
		
		while (!teste) {
			System.out.println("Erro! Seu salário deve ser maior que 0. Tente novamente: ");
			
			System.out.println("Salario: ");
			salario = scan.nextDouble();
			
			if (salario > 0) {
				teste = true;
			}
		}
		
		//sexo
		System.out.println("Sexo F-Feminino, M-Masculino.");
		String sexo = scan.next();
		teste = false;
		
		if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
			teste = true;
		}
		
		while (!teste) {
			System.out.println("Erro! F para feminino ou M para masculino. Tente novamente: ");
			
			System.out.println("Sexo F-Feminino, M-Masculino.");
			sexo = scan.next();
			
			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				teste = true;
			}
		}
		
		//Estado Civil: 's', 'c', 'v', 'd';
		System.out.println("Estado Civil: 's'-solteiro, 'c'-casado, 'v'-viuvo, 'd'-divorciado");
		String eC = scan.next();
		teste = false;
		
		if (eC.equalsIgnoreCase("s") || eC.equalsIgnoreCase("c") 
				|| eC.equalsIgnoreCase("v") || eC.equalsIgnoreCase("c")) {
			teste = true;
		}
		
		while (!teste) {
			System.out.println("Erro! Tente novamente: ");
			
			System.out.println("Estado Civil: 's'-solteiro, 'c'-casado, 'v'-viuvo, 'd'-divorciado");
			eC = scan.next();
			
			if (eC.equalsIgnoreCase("s") || eC.equalsIgnoreCase("c") 
					||eC.equalsIgnoreCase("v") || eC.equalsIgnoreCase("c")) {
				teste = true;
			}
		}
		
		System.out.println("As seguintes informações foram coletadas:");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado civil: " + eC);

		scan.close();
	}

}

package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		/*
		  5. Altere o programa anterior permitindo ao usuário informar as
		populações e as taxas de crescimento iniciais. Valide a entrada e
		permita repetir a operação.
		 */
		
		Scanner scan = new Scanner(System.in);
	
		//população A
		double a;
		boolean teste = false;
		
		do {
			System.out.println("População A:");
			a = scan.nextDouble();
			
			if (a > 0) {
				teste = true;
			} else {
				System.out.println("Inválido, a população precisa ser maior que 0.");
			}
		} while (!teste);
		
		//população B
		double b;
		teste = false;
		
		do {
			System.out.println("População B:");
			b = scan.nextDouble();
			
			if (b > 0) {
				teste = true;
			} else {
				System.out.println("Inválido, a população precisa ser maior que 0.");
			}
		} while (!teste);
		
		//taxa A
		double taxaA;
		teste = false;
		
		do {
			System.out.println("Taxa de crescimento A:");
			taxaA = scan.nextDouble();
			
			if (taxaA > 0 && taxaA <=100) {
				teste = true;
			} else {
				System.out.println("Inválido, a taxa de CRESCIMENTO precisa ser maior que 0% e menor que 100%.");
			}
		} while (!teste);
		
		//taxa B
		double taxaB;
		teste = false;
		
		do {
			System.out.println("Taxa de crescimento A:");
			taxaB = scan.nextDouble();
			
			if (taxaB > 0 && taxaB <=100) {
				teste = true;
			} else {
				System.out.println("Inválido, a taxa de CRESCIMENTO precisa ser maior que 0% e menor que 100%.");
			}
		} while (!teste);
		
		//Anos
		int anos = 0;
		
		while (a <= b) {
			a += a * (taxaA/100);
			b += b * (taxaB/100);
			anos += 1;
		}
		System.out.println("População A: " + a);
		System.out.println("População B: " + b);
		System.out.println("Levaria " + anos + " anos.");
		
		scan.close();
	}

}

package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		/*
		20.Altere o programa de cálculo do fatorial, permitindo ao usuário calcular
		o fatorial várias vezes e limitando o fatorial a números inteiros positivos
		e menores que 16.
		*/
		
		Scanner scan = new Scanner(System.in);

		int n;
		int resultado;
		int nAnt;
		
		while (true) {
			System.out.println("Fatorial de:");
			n = scan.nextInt();
			
			if (n<16 && n>=0) {
				if (n == 0 || n == 1) {
					System.out.println(n+"!= 1");
					
				} else {
					
					System.out.print(n+"!=");
					System.out.print(n + ".");
					resultado = n;
					nAnt = n;
					n -=1;
					
					for (;n!=0; n-= 1) {
						if (n != 1) {
							System.out.print(n + ".");
						} else {
							System.out.print(n + "=");
						}
						nAnt = nAnt * n;
						resultado = nAnt;
					}
					System.out.println(resultado);
				}
			} else {
				System.out.println("Erro! precisa ser positivo e menor que 16.");
			}
		}

	}

}

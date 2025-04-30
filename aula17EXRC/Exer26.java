package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
		/*
		26.Numa eleição existem três candidatos. 
		Faça um programa que peça o número total de eleitores. 
		Peça para cada eleitor votar e ao final mostrar o número de votos 
		de cada candidato.
		*/
		int a = 0;
		int b = 0;
		int c = 0;
		
		String voto = "d";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantidade de eleitores:");
		int n = scan.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Qual seu voto?");
			voto = scan.next();
			
			switch (voto) {
			case "a": a++; break;
			case "b": b++; break;
			case "c": c++; break;
			}
		}
		System.out.println("Candidato A: " + a + " votos.");
		System.out.println("Candidato B: " + b + " votos.");
		System.out.println("Candidato C: " + c + " votos.");

		scan.close();
	}

}

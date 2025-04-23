package com.nicolas.cursojava.aula13EXRC;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//7
		System.out.println("7. Faça um Programa que calcule a área de um quadrado, depois mostre o dobro desta área para o usuário. ");
		
		System.out.println("lado: ");
		int lado = scan.nextInt();
		
		System.out.println("A área dobrada é: " + ((lado * lado) * 2));
		
	}

}

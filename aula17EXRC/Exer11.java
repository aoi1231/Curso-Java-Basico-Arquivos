package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		//11.Altere o programa anterior para mostrar no final a soma dos números. 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Numero inteiro 1:");
		int num1 = scan.nextInt();
		System.out.println("Numero inteiro 2:");
		int num2 = scan.nextInt();
		
		int soma = 0;

		while (num1-1 > num2) {
			num2 += 1;
			soma += num2;
		}
		while (num2-1 > num1) {
			num1 += 1;
			soma += num1;
		}
		
		System.out.println(soma);
		
		

	}

}

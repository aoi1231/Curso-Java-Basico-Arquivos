package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		//19.Altere o programa anterior para que ele aceite apenas números entre 0 e 1000
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantidade de numeros (ENTRE 0 E 1000: ");
		int i = scan.nextInt();
		
		if (i >= 0 && i <=1000) {
			int num;
			int maior = Integer.MIN_VALUE;
			int menor = Integer.MAX_VALUE;
			int soma = 0;
			
			for (; i!=0; i-= 1) {
				System.out.println("Entre com um número:");
				num = scan.nextInt();
				soma += num;
				
				if (num > maior) {
					maior = num;
				}
				if (num < menor) {
					menor = num;
				}
				
				
			}
			
			System.out.println("O maior número digitado foi: " + maior);
			System.out.println("O menor número digitado foi: " + menor);
			System.out.println("A soma dos valores foi: " + soma);
		}
	}

}

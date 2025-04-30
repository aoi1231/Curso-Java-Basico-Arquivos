package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		/*
		12.Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
		numero ele deseja ver a tabuada. 
		
		A saída deve ser conforme o exemplo abaixo:
		
		o Tabuada de 5:
		o 5 X 1 = 5
		o 5 X 2 = 10
		o ...
		o 5 X 10 = 50
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tabuada de (entre 1 a 10):");
		int num = scan.nextInt();
		
		int tabuada = 1;
		
		if (num<11 && num >0) {
			System.out.println("Tabuada de " + num + ":");
			for (; tabuada < 11; tabuada += 1) {
				System.out.println(num + " X " + tabuada + " = " + num*tabuada);
			}
		}

		scan.close();
	}

}

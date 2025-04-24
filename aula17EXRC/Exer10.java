package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Numero inteiro 1:");
		int num1 = scan.nextInt();
		System.out.println("Numero inteiro 2:");
		int num2 = scan.nextInt();

		while (num1-1 > num2) {
			num2 += 1;
			System.out.println(num2);
		}
		while (num2-1 > num1) {
			num1 += 1;
			System.out.println(num1);
		}
	}

}

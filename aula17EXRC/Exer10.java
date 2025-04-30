package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		/*
		 * 10.Faça um programa que receba dois números inteiros e gere os
		números inteiros que estão no intervalo compreendido por eles.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Numero inteiro 1:");
		int num1 = scan.nextInt();
		System.out.println("Numero inteiro 2:");
		int num2 = scan.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for (int i = num1 + 1; i < num2; i++) {
            System.out.println(i);
        }

        scan.close();
		scan.close();
	}

}

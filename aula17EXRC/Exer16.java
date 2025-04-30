package com.nicolas.cursojava.aula17EXRC;

public class Exer16 {

	public static void main(String[] args) {
		/*
		16.A série de Fibonacci é formada pela seqüência
		0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até
		que o valor seja maior que 500.
		*/
		int numant= 1;
		int num = 1;
		int result = 0;
		System.out.print(num + " ");
		System.out.print(num + " ");
		
		while (result <= 500) {
			result = numant+num;
			numant = num;
			num = result;
			
			System.out.print(num + " ");
		}
	}

}

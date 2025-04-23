package com.nicolas.cursojava.aula15EXRC;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		/* INCOMPLETO
		19.Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo.
		
			Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:
		
		o 326 = 3 centenas, 2 dezenas e 6 unidades
		o 12 = 1 dezena e 2 unidades
		Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o numero de 1 a 999? ");
		int numero = scan.nextInt();
		
		String cS = "";
		String dS = "";
		String uS = "";
		
		int centenas = numero / 100;
        int dezenas = (numero % 100) / 10;
        int unidades = numero % 10;
		
		System.out.print(numero + " = ");
		
		if (centenas > 0) {
			cS = "s";
			System.out.print(centenas + " centena" + cS + ", ");
		}
		if (dezenas > 0) {
			dS = "s";
			System.out.print(dezenas + " dezena" + dS + " e ");
		}
		if (unidades > 0) {
			uS = "s";
			System.out.print(unidades + " unidade" + uS);
		}
		

	}

}

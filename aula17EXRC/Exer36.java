package com.nicolas.cursojava.aula17EXRC;
import java.util.Scanner;

public class Exer36 {

	public static void main(String[] args) {
		/*
		36.Desenvolva um programa que faça a tabuada de um número qualquer
		inteiro que será digitado pelo usuário, mas a tabuada não deve
		necessariamente iniciar em 1 e terminar em 10, o valor inicial e final
		devem ser informados também pelo usuário, conforme exemplo
		abaixo:
		
		o Montar a tabuada de: 5
		o Começar por: 4
		o Terminar em: 7
		o
		o Vou montar a tabuada de 5 começando em 4 e terminando em 7:
		o 5 X 4 = 20
		o 5 X 5 = 25
		o 5 X 6 = 30
		o 5 X 7 = 35
		
		Obs: Você deve verificar se o usuário não digitou o final menor
		que o inicial.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Montar a tabuada de: ");
		int num = scan.nextInt();
		
		System.out.print("Começar por: ");
		int cmc = scan.nextInt();
		
		System.out.print("Terminar em: ");
		int fim = scan.nextInt();
		
		int tabuada = 1;
		
		if (fim>cmc) {
			System.out.print("\r\n Vou montar a tabuada de "+num+" começando em "+cmc+" e terminando em "+fim+":");
			cmc -=1;
			for (; cmc <= fim; cmc += 1) {
				System.out.println(num + " X " + cmc + " = " + num*cmc);
			}
		} else {
			System.out.print("Erro! O fim não pode ser menor que o início.");
		}
	}

}

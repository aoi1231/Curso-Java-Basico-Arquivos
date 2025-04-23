package com.nicolas.cursojava.aula15EXRC;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		//9. Faça um Programa que leia três números e mostre-os em ordem decrescente
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
        int a = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int b = scan.nextInt();
        System.out.println("Digite o terceiro número: ");
        int c = scan.nextInt();

        if (a >= b && a >= c) {
            if (b >= c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        } else if (b >= a && b >= c) {
            if (a >= c) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        } else { // c é o maior
            if (a >= b) {
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(c + " " + b + " " + a);
            }
        }
	}

}

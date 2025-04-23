
package com.nicolas.cursojava.aula15EXRC;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		//4. Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira uma letra.");
		String letra = scan.next();
		
		switch (letra) {
		case "a": 
		case "e": 
		case "i": 
		case "o": 
		case "u": System.out.println("Vogal"); break;
		default : System.out.println("Consoante"); break;
		}
	
	}

}

package com.nicolas.cursojava.aula15EXRC;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		/*
		25.Faça um programa que faça 5 perguntas para uma pessoa sobre um
		crime. As perguntas são:
		
		. "Telefonou para a vítima?"
		a. "Esteve no local do crime?"
		b. "Mora perto da vítima?"
		c. "Devia para a vítima?"
		d. "Já trabalhou com a vítima?" 
		
		O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
		Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", 
		entre 3 e 4 como "Cúmplice" e 5 como "Assassino". 
		Caso contrário, ele será classificado como "Inocente".
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Telefonou para a vítima?");
		String resposta1 = scan.next();
		System.out.println("Esteve no local do crime?");
		String resposta2 = scan.next();
		System.out.println("Mora perto da vítima");
		String resposta3 = scan.next();
		System.out.println("Devia para a vítima?");
		String resposta4 = scan.next();
		System.out.println("Já trabalhou com a vítima?");
		String resposta5 = scan.next();
		
		int positivo = 0;
		String classifi = "inocente";
		
<<<<<<< HEAD
		if (resposta1.equalsIgnoreCase("sim")) {
			positivo += 1;
		}
		if (resposta2.equalsIgnoreCase("sim")) {
			positivo += 1;
		}
		if (resposta3.equalsIgnoreCase("sim")) {
			positivo += 1;
		}
		if (resposta4.equalsIgnoreCase("sim")) {
			positivo += 1;
		}
		if (resposta5.equalsIgnoreCase("sim")) {
=======
		if (resposta1.equals("sim")) {
			positivo += 1;
		}
		if (resposta2.equals("sim")) {
			positivo += 1;
		}
		if (resposta3.equals("sim")) {
			positivo += 1;
		}
		if (resposta4.equals("sim")) {
			positivo += 1;
		}
		if (resposta5.equals("sim")) {
>>>>>>> 000ee0e (Refazendo uploads so que em .java e não em .class)
			positivo += 1;
		}
		
		if (positivo == 5) {
			classifi = "assassino.";
		} else if (positivo > 2) {
			classifi = "cumplice.";
		} else if (positivo == 2) {
			classifi = "suspeito.";
		} else {
			classifi = "inocente.";
		}
		
		System.out.println("O entrevistado é classificado como: " + classifi);

	}

}

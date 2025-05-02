package com.nicolas.cursojava.aula19EXRC;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		/*
		19.Ler as duas notas bimestrais para um conjunto de 10 alunos.
		Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do
		tipo real. 
		Escreva um programa que calcule a média aritmética simples
		das notas informadas armazenando o resultado em um vetor “Result”
		de mesmo tipo e tamanho. 
		
		Ao mostrar os resultados exibir a situação de cada aluno.
		 Se a média calculada for superior ou igual a 7 o aluno
		estará “aprovado”, caso contrário, a situação do aluno será
		“reprovado”.
		*/
		Scanner scan = new Scanner(System.in);
		
		//Declarando variáveis
		double[] nota1 = new double [10];
		double[] nota2 = new double [10];
		double[] result = new double [10];
		String output = "";
		
		//Recebendo notas
		for (int i =0; i<10; i++) {
			System.out.println("Primeira nota do aluno Nº " + (i+1));
			nota1[i] = scan.nextDouble();
			System.out.println("Segunda nota do aluno Nº " + (i+1));
			nota2[i] = scan.nextDouble();
			
			result[i] = (nota1[i]+nota2[i])/2;
			output += "\r\nO aluno Nº " + (i+1) + " teve a média " + result[i] + ".";
			if (result[i] >= 7) {
				output += " Portanto, foi aprovado!"; 
			} else {
				output += " Portanto, foi reprovado!";
			}
			
		}
		System.out.println(output);
		
		

	}

}

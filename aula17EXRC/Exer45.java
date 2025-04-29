package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer45 {

	public static void main(String[] args) {
		/*
		45.Desenvolver um programa para verificar a nota do aluno em uma prova com 10 questões,
		
		 o programa deve perguntar ao aluno a resposta de cada questão 
		 e ao final comparar com o gabarito da prova
		 e assim calcular o total de acertos e a nota (atribuir 1 ponto por resposta certa).
		 
		Após cada aluno utilizar o sistema deve ser feita uma pergunta se outro aluno vai utilizar o sistema. 
		
		Após todos os alunos terem respondido informar:
		. Maior e Menor Acerto;
		a. Total de Alunos que utilizaram o sistema;
		b. A Média das Notas da Turma.
		
		Gabarito da Prova:
		01 - A
		02 - B
		03 - C
		04 - D
		05 - E
		06 - E
		07 - D
		08 - C
		09 - B
		10 - A
		
		Após concluir isto você poderia incrementar o programa permitindo que o professor 
		digite o gabarito da prova antes dos alunos usarem o programa.
		*/
		Scanner scan = new Scanner(System.in);
		
		String um = "A", dois = "B", tres = "C", quatro = "D", cinco = "E", seis = "E", sete = "D", oito = "C", nove = "B", dez = "A";
		String resposta;
		String corrigir = "s";
		int questao;
		int pontos;
		int maior = -1;
		int menor = 11;
		int alunos = 0;
		int totalNotas = 0;
		
		do {
			System.out.println("\r\nUm gabarito para verificar? s/n");
			corrigir = scan.next();
			
			if (corrigir.equalsIgnoreCase("s")) {
				alunos++;
				pontos = 0;
				for (questao = 1; questao <= 10; questao++) {
					System.out.print("Resposta da questão Nº" + questao + ": ");
					resposta = scan.next();
					
					//Pontuação
					switch (questao) {
					
					case 1: 
						if (um.equalsIgnoreCase(resposta)) {
							pontos++;
						}
						; break;
					case 2: 
						if (dois.equalsIgnoreCase(resposta)) { 
							pontos++;
						}
						break;
					case 3: 
						if (tres.equalsIgnoreCase(resposta)) { 
							pontos++;
						}
						break;
					case 4: 
						if (quatro.equalsIgnoreCase(resposta)) { 
							pontos++;
						}
						break;
					case 5: 
						if (cinco.equalsIgnoreCase(resposta)) { 
							pontos++;
						}
						break;
					case 6: 
						if (seis.equalsIgnoreCase(resposta)) { 
							pontos++;
						}
						break;
					case 7: 
						if (sete.equalsIgnoreCase(resposta)) { 
							pontos++;
						}
						break;
					case 8: 
						if (oito.equalsIgnoreCase(resposta)) { 
							pontos++;
						} 
						break;
					case 9: 
						if (nove.equalsIgnoreCase(resposta)) { 
							pontos++;
						}
						break;
					case 10: 
						if (dez.equalsIgnoreCase(resposta)) { 
							pontos++;
						}
						break;
					}
					
					//Maior ou menor pontuação
					if (questao == 10) {
						totalNotas += pontos;
						if (pontos > maior) {
							maior = pontos;
						} 
						if (pontos < menor) {
							menor = pontos;
						}
					}
					
				}
			}
		} while (!corrigir.equalsIgnoreCase("n"));
		
		if (alunos > 0) {
			double media = ((double) totalNotas/alunos);
			System.out.println("\r\nCorreção concluída.");
			System.out.println("Maior acerto: " + maior);
			System.out.println("Menor acerto: " + menor);
			System.out.println("Total de alunos: " + alunos);
			System.out.println("Média da turma: " + media);
		}
		
		
	}

}

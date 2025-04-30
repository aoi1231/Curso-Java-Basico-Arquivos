package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer41 {

	public static void main(String[] args) {
		/*
		41.Faça um programa que receba o valor de uma dívida e mostre uma
		tabela com os seguintes dados: 
		
			valor da dívida, 
			valor dos juros,
			quantidade de parcelas
			valor da parcela.
		
			Os juros e a quantidade de parcelas seguem a tabela abaixo:
			
		Quantidade de Parcelas % de Juros sobre o valor inicial da dívida
		//q%j/v
		1 = 0
		3 = 10
		6 = 15
		9 = 20
		12= 25
		
		Valor da Dívida      Valor dos Juros      Quantidade de Parcelas      Valor da Parcela
		R$ 1.000,00          0                    1                           R$ 1.000,00
		R$ 1.100,00          100                  3                           R$ 366,00
		R$ 1.150,00          150                  6                           R$ 191,67

		
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Valor da dívida: ");
		double divida = scan.nextDouble();
		double calculo = 0;
		int parcela = 3;
		double percent = 10;
		
		System.out.println("Valor da Dívida      Valor dos Juros      Quantidade de Parcelas      Valor da Parcela");
		System.out.println("R$ " + divida + "            0                    1                           " + divida);
		
		for (int i = 1; i<=4 ; i++) {
			calculo = divida + divida*(percent/100);
			System.out.println("R$ " + calculo + "            "+(divida*(percent/100))+"                "+parcela+"                           " + (calculo/parcela));
			parcela +=3;
			percent += 5;
		}
		
		scan.close();
	}

}

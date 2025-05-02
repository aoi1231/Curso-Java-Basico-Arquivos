package com.nicolas.cursojava.aula19EXRC;

import java.text.DecimalFormat;

public class Exer04 {

	public static void main(String[] args) {
		/*
		4. Criar um vetor A com 15 elementos inteiros. 
		Construir um vetor B de mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
		raiz quadrada do respectivo elemento de A, ou seja:
		B[i] = sqrt(A[i]). 
		
		*/
		DecimalFormat df = new DecimalFormat("###,###.###");
		
		int[] A = new int [15];
		A[0] = 1;
		A[1] = 2;
		A[2] = 3;
		A[3] = 4;
		A[4] = 5;
		A[5] = 6;
		A[6] = 7;
		A[7] = 8;
		A[8] = 9;
		A[9] = 10;
		A[10] = 11;
		A[11] = 12;
		A[12] = 13;
		A[13] = 14;
		A[14] = 15;
		double[] B = new double [A.length];
		
		for (int i = 0; i<A.length; i++) {
			B[i] = Math.sqrt(A[i]);
			System.out.println(df.format(B[i]));
		}
	}

}

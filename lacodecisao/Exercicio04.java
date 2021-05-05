package lacodecisao;

import java.util.Scanner;

public class Exercicio04 {

	/*
	 * Data: 05/05/2021
	 * 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
	 * número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
	 * ímpar exiba o número elevado ao quadrado.
	 */
	
	public static void main(String[] args) {
		
		int num;
		double raiz, quad;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.print("\n"+num+" é par");
			raiz = Math.sqrt(num);
			System.out.printf(" e sua raiz quadrada = %2.2f \n",raiz);
			
		}else {
			System.out.print("\n"+num+" é ímpar");
			quad = Math.pow(num, 2);
			System.out.println(" e sua elevação ao quadrado = "+quad);
		}
		
		sc.close();
	}

}

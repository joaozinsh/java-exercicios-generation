package lacoRepeticao;

import java.util.Scanner;

public class Exercicio05 {

	/*
	 * Autor: João Gabriel
	 * Data: 06/05/2021
	 * 
	 * 5- Crie um programa que leia um número do teclado até que encontre um número
	 * igual a zero. No final, mostre a soma dos números digitados.
	 * 
	 * Foco do exercicio: Laço de Repetição DO...WHILE
	 */
	
	public static void main(String[] args) {
		
		int num, somaNum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Entre com um número: ");
			num = sc.nextInt();
			
			somaNum = somaNum + num;
			
		} while(num != 0);

		System.out.println("\nSoma dos números digitados: "+somaNum);
		
		sc.close();
	}
}
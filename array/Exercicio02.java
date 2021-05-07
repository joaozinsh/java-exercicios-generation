package array;

import java.util.Scanner;

public class Exercicio02 {

	/*
	 * Autor: João Gabriel
	 * Data: 07/05/2021
	 * 
	 * 2- Faça um programa que receba 6 números inteiros e mostre:
	 * • Os números pares digitados;
	 * • A soma dos números pares digitados;
	 * • Os números ímpares digitados;
	 * • A quantidade de números ímpares digitados.
	 * 
	 * Foco do exercicio: Vetor
	 */
		
	public static void main(String[] args) {
		
		int[] par = new int[6];
		int[] impar = new int[6];
		int num, somaPar = 0, somaImpar = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 6; i++) {
			System.out.println("Entre com um número: ");
			num = sc.nextInt();
			
			if(num % 2 == 0) {
				par[i] = num;
				somaPar += num;
				
			} else {
				impar[i] = num;
				somaImpar += num;
			}
		}
		
		System.out.print("\nNúmeros pares digitados: ");
		for (int i : par) {
			if(i != 0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println("\nSoma dos números pares digitados: "+somaPar);
		
		System.out.print("\nNúmeros ímpares digitados: ");
		for (int i : impar) {
			if(i != 0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println("\nSoma dos números ímpares digitados: "+somaImpar);
		
		sc.close();
	}
	
}
package array;

public class Exercicio01 {
	
	/*
	 * Autor: João Gabriel
	 * Data: 07/05/2021
	 * 
	 * 1- Faça um programa que possua um vetor denominado A que armazene 6 números
	 * inteiros. O programa deve executar os seguintes passos:
	 * (a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
	 * (b) Armazene em um variável inteira (simples) a soma entre os valores das posições A[0], A[1] e
	 * A[5] do vetor e mostre na tela esta soma.
	 * (c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
	 * (d) Mostre na tela cada valor do vetor A, um em cada linha.
	 * 
	 * Foco do exercicios: Vetor
	 */

	public static void main(String[] args) {
		
		int[] A = {1, 0, 5, -2, -5, 7}; //Passo a)
		int soma = 0;
		
		for(int i = 0; i < A.length; i++) {
			if(i == 0 || i == 1 || i == 5) {
				soma = soma + A[i]; //Passo b)
			}
			if(i == 4) {
				A[i] = 100; // Passo c)
			}
			
			System.out.println("A["+i+"] = "+A[i]); //Passo d)
		}
		
		System.out.println("\nSoma dos valores das posições A[0], A[1] e A[5] = "+soma); //Passo b)	
	}

}
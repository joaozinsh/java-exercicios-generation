package array;

import java.util.Scanner;

public class Exercicio03 {

	/*
	 * Autor: João Gabriel
	 * Data: 07/05/2021
	 *  
	 * 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela
	 * possui.
	 * 
	 * Foco do exericicio: Matriz
	 */
	
	public static void main(String[] args) {
		
		int[][] matriz = new int[3][3];
		int maior10 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os valores da Matriz 3 x 3:");
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("["+(i+1)+"]["+(j+1)+"]: ");
				matriz[i][j] = sc.nextInt();
				
				if(matriz[i][j] > 10) {
					maior10++;
				}	
			}
		}
		
		System.out.println("\nA Matriz 3 x 3 possui "+maior10+" valores maiores que 10");
		
		sc.close();
	}

}
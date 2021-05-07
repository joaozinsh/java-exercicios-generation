package array;

import java.util.Scanner;

public class Exercicio04 {

	/*
	 * Autor: João Gabriel
	 * Data: 07/05/2021
	 * 
	 * 4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça
	 * ao usuário um menu de opções:
	 * (1) somar as duas matrizes
	 * (2) subtrair a primeira matriz da segunda
	 * (3) adicionar uma constante as duas matrizes
	 * (4) imprimir as matrizes
	 * 
	 * Nas duas primeiras opções uma terceira matriz 2 x 2 deve
	 * ser criada. Na terceira opção o valor da constante deve ser lido e o
	 * resultado da adição da constante deve ser armazenado na própria matriz.
	 * 
	 * Foco do exercicio: Matriz
	 */
	
	public static void main(String[] args) {
		
		float[][] A = new float[2][2];
		float[][] B = new float[2][2];
		float[][] C = new float[2][2];
		float consta;
		int op = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//Popular Matriz A
		System.out.println("Entre com os valores da primeira Matriz 2 x 2:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("["+(i+1)+"]["+(j+1)+"]: ");
				A[i][j] = sc.nextFloat();
			}
		}
		
		//Popular Matriz B
		System.out.println("\nEntre com os valores da segunda Matriz 2 x 2:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("["+(i+1)+"]["+(j+1)+"]: ");
				B[i][j] = sc.nextFloat();
			}
		}
		
		while (op != 5) {
			System.out.print("\n\n\tMenu de opções:"
					+ "\n1- Somar as duas matrizes"
					+ "\n2- Subtrair a primeria matriz da segunda"
					+ "\n3- Adicionar uma constante as duas matrizes"
					+ "\n4- Imprimir as matrizes"
					+ "\n5 - Sair"
					+ "\n\nDigite sua opção: ");
			op = sc.nextInt();
			
			switch(op) {
			case 1:
				//Somar Matriz A com B
				System.out.println("\n\tMatrizes somadas!");
				
				for(int i = 0; i < 2; i++) {
					for(int j = 0; j < 2; j++) {
						C[i][j] = A[i][j] + B[i][j];
						System.out.println("["+(i+1)+"]["+(j+1)+"]: "+C[i][j]);
					}
				}
				break;
				
			case 2:
				//Subtrair Matriz B com A
				System.out.println("\n\tMatrizes subtraidas!");
				
				for(int i = 0; i < 2; i++) {
					for(int j = 0; j < 2; j++) {
						C[i][j] = B[i][j] - A[i][j];
						System.out.println("["+(i+1)+"]["+(j+1)+"]: "+C[i][j]);
					}
				}
				break;
				
			case 3:
				//Adicionar constante e somar com Matriz A e B
				System.out.println("\nEntre com um valor da constante: ");
				consta = sc.nextFloat();
				
				System.out.println("\n\tMatrizes somadas com a constante!");
				
				for(int i = 0; i < 2; i++) {
					for(int j = 0; j < 2; j++) {
						A[i][j] = A[i][j] + consta;
						System.out.println("["+(i+1)+"]["+(j+1)+"]: "+A[i][j]);
					}
				}
				
				for(int i = 0; i < 2; i++) {
					for(int j = 0; j < 2; j++) {
						B[i][j] = B[i][j] + consta;
						System.out.println("["+(i+1)+"]["+(j+1)+"]: "+B[i][j]);
					}
				}
				break;
				
			case 4:
				//Mostrar Matriz A
				System.out.println("\n\tMatriz A:");
					for(int i = 0; i < 2; i++) {
						for(int j = 0; j < 2; j++) {
							System.out.println("["+(i+1)+"]["+(j+1)+"]: "+A[i][j]);
						}
					}
				
				//Mostrar Matriz B
				System.out.println("\n\tMatriz B:");
					for(int i = 0; i < 2; i++) {
						for(int j = 0; j < 2; j++) {
							System.out.println("["+(i+1)+"]["+(j+1)+"]: "+B[i][j]);
						}
					}
				break;
				
			case 5:
				System.out.println("\nEncerrando programa...");
				break;
				
			default:
				System.err.println("\nOpção inválida");
				break;
			}
		
		}
		sc.close();
	}
	
}
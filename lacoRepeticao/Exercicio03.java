package lacoRepeticao;

import java.util.Scanner;

public class Exercicio03 {

	/*
	 * Autor: João Gabriel
	 * Data: 06/05/2021
	 * 
	 * 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	 * 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	 * idade for =-99.
	 * 
	 * Foco do exercicio: Laço de Repetição WHILE
	 */
	
	public static void main(String[] args) {
		
		int idade = 0, quantIdade21 = 0, quantIdade50 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a idade de quantas pessoas você quiser"
				+ "\nQuando terminar, digite -99\n");
		
		System.out.println("Digite a idade: ");
		idade = sc.nextInt();
		
		while(idade != -99) {
			if(idade < 21) {
				quantIdade21++;
				
			} else if(idade > 50) {
				quantIdade50++;
			}
			
			System.out.println("Digite a idade: ");
			idade = sc.nextInt();
		}
		
		System.out.println("\nTotal de pessoas com menos de 21 anos: "+quantIdade21);
		System.out.println("Total de pessoas com mais de 50 anos: "+quantIdade50);
		
		sc.close();
	}

}